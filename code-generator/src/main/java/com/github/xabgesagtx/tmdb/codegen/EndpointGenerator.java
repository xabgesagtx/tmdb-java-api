package com.github.xabgesagtx.tmdb.codegen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.codegen.model.*;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;
import com.google.common.base.CaseFormat;
import com.sun.codemodel.*;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EndpointGenerator extends AbstractGenerator {
    private final JCodeModel model;
    private final JavaDocFormatter javaDocFormatter;
    private final ModelGenerator modelGenerator;
    private final Comparator<Variable<?>> variableComparator;

    public EndpointGenerator(JCodeModel model) {
        this.model = model;
        javaDocFormatter = new JavaDocFormatter("https://developers.themoviedb.org/");
        modelGenerator = new ModelGenerator(model);
        Comparator<Variable<?>> variableComparator = Comparator.comparing(Variable::isRequired, Comparator.<Boolean>naturalOrder().reversed());
        this.variableComparator = variableComparator.thenComparing(Variable::getName);
    }

    void generateEndpoint(JDefinedClass resourceClass, JPackage jPackage, Endpoint endpoint) {
        JType resultType = getJType(endpoint.getResponse(), jPackage);
        JType methodResultType = endpoint.isSingleElementRetrieval() ? model.ref(Optional.class).narrow(resultType) : resultType;
        JMethod method = resourceClass.method(JMod.PUBLIC, methodResultType, endpoint.getName());
        String javaDocText = javaDocFormatter.format(endpoint.getDescription());
        JDocComment javadoc = method.javadoc();
        javadoc.add(javaDocText);
        addException(javadoc);
        List<Pair<Variable<?>, JVar>> pathVariables = addPathVariables(resourceClass, endpoint, method, javadoc);
        JExpression requestBodyExpression = JExpr._null();
        JDefinedClass requestClass = null;
        if (endpoint.getRequestBody() != null) {
            requestClass = modelGenerator.createClass(endpoint.getRequestBody(), jPackage, false);
            String requestBodyParamName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, endpoint.getRequestBody().getName());
            JVar param = method.param(requestClass, requestBodyParamName);
            javadoc.addParam(param).add(requestBodyParamName);
            requestBodyExpression = param;
        }
        var requestParams = endpoint.getRequestParams()
                .stream()
                .sorted(variableComparator)
                .map(variable -> Pair.<Variable<?>,JVar>of(variable, createMethodParam(method, resourceClass, variable, javadoc)))
                .collect(Collectors.toList());
        JBlock body = method.body();
        JVar formattedPath = formatPath(body, endpoint.getPath(), pathVariables);
        JExpression requestParamsExpression = createRequestParamsMap(body, requestParams);
        JFieldVar restClient = resourceClass.fields().get("restClient");
        JExpression typeReference = JExpr._new(model.anonymousClass(model.ref(TypeReference.class).narrow(new JClass[0])));
        String restClientMethod = endpoint.isSingleElementRetrieval() ? endpoint.getMethod() + "Opt" : endpoint.getMethod();
        JInvocation restClientInvocation = restClient.invoke(restClientMethod)
                .arg(formattedPath)
                .arg(requestParamsExpression)
                .arg(typeReference);
        if (Set.of("post", "delete", "put").contains(endpoint.getMethod())) {
            restClientInvocation.arg(requestBodyExpression);
        }
        body._return(restClientInvocation);
        createConvenienceMethod(resourceClass, methodResultType, endpoint, pathVariables, requestClass, requestParams);
    }

    private List<Pair<Variable<?>, JVar>> addPathVariables(JDefinedClass resourceClass, Endpoint endpoint, JMethod method, JDocComment javadoc) {
        List<String> pathVariableOrder = getPathVariableOrder(endpoint.getPath());
        Map<String, Variable<?>> pathVariableMap = endpoint.getPathVariables().stream()
                .collect(Collectors.toMap(Variable::getJsonName, Function.identity()));
        return pathVariableOrder.stream()
                .map(variableName -> {
                    Variable<?> variable = pathVariableMap.get(variableName);
                    return Pair.<Variable<?>,JVar>of(variable, createMethodParam(method, resourceClass, variable, javadoc));
                }).collect(Collectors.toList());
    }

    private List<String> getPathVariableOrder(String path) {
        Pattern searchPattern = Pattern.compile("\\{([^}]+)}");
        ArrayList<String> result = new ArrayList<>();
        Matcher matcher = searchPattern.matcher(path);
        while (matcher.find()) {
            String variableName = matcher.group(1);
            result.add(variableName);
        }
        return result;
    }

    private void addException(JDocComment javadoc) {
        javadoc.addThrows(model.ref(TmdbApiException.class)).add("when an unexpected status code or any other issue interacting with the API occurs");
    }

    private void createConvenienceMethod(JDefinedClass resourceClass, JType optionalResultType, Endpoint endpoint, List<Pair<Variable<?>,JVar>> pathVariables, JDefinedClass requestClass, List<Pair<Variable<?>,JVar>> requestParams) {
        if (endpoint.getRequestParams().stream().allMatch(Variable::isRequired)) {
            return;
        }
        JMethod method = resourceClass.method(JMod.PUBLIC, optionalResultType, endpoint.getName());
        String javaDocText = javaDocFormatter.format(endpoint.getDescription());
        JDocComment javadoc = method.javadoc();
        javadoc.add(javaDocText);
        addException(javadoc);
        List<JExpression> invocationParams = new ArrayList<>();
        pathVariables.forEach(pair -> {
            JVar jVar = pair.getValue();
            JVar param = addMethodParam(method, pair.getKey(), javadoc, jVar.type());
            invocationParams.add(param);
        });
        if (requestClass != null) {
            JVar param = method.param(requestClass, "requestBody");
            javadoc.addParam(param).add(param.name());
            invocationParams.add(param);
        }
        requestParams.forEach(pair -> {
                    var variable = pair.getKey();
                    if (variable.isRequired()) {
                        JVar jVar = pair.getValue();
                        JVar param = addMethodParam(method, variable, javadoc, jVar.type());
                        invocationParams.add(param);
                    } else {
                        invocationParams.add(JExpr._null());
                    }
                });
        JBlock body = method.body();
        JInvocation invocation = JExpr.invoke(endpoint.getName());
        invocationParams.forEach(invocation::arg);
        body._return(invocation);
    }

    private JExpression createRequestParamsMap(JBlock body, List<Pair<Variable<?>, JVar>> requestParams) {
        if (requestParams.isEmpty()) {
            return body.decl(model.ref(Map.class).narrow(String.class, Object.class),
                    "requestParams",
                    model.ref(Collections.class).staticInvoke("emptyMap"));
        } else {
            var mapVar = body.decl(model.ref(Map.class).narrow(String.class, Object.class),
                    "requestParams",
                    JExpr._new(model.ref(HashMap.class).narrow(new JClass[0])));
            requestParams.forEach(pair -> {
                String jsonName = pair.getKey().getJsonName();
                JVar jVar = pair.getValue();
                body.invoke(mapVar, "put").arg(JExpr.lit(jsonName)).arg(jVar);
            });
            return mapVar;
        }
    }

    private JVar formatPath(JBlock body, String path, List<Pair<Variable<?>, JVar>> pathVariables) {
        if (pathVariables.isEmpty()) {
            return body.decl(model.ref(String.class), "path", JExpr.lit(path));
        } else {
            String pathPattern = path.replaceAll("\\{[^}]+}", "%s");
            JInvocation invocation = model.ref(String.class).staticInvoke("format").arg(JExpr.lit(pathPattern));
            pathVariables.stream().map(Pair::getValue).forEach(invocation::arg);
            body.directStatement("// " + path);
            return body.decl(model.ref(String.class), "path", invocation);
        }
    }

    JVar createMethodParam(JMethod method, JDefinedClass resourceClass, Variable<?> variable, JDocComment javadoc) {
        JType type;
        if (variable instanceof EnumVariable) {
            EnumVariable enumVariable = (EnumVariable) variable;
            type = modelGenerator.createEnum(enumVariable.getType(), resourceClass);
        } else {
            PrimitiveVariable primitiveVariable = (PrimitiveVariable) variable;
            Class<?> classForPrimitive = getClassForPrimitive(primitiveVariable.getType());
            type = variable.isRequired() ? model.ref(classForPrimitive).unboxify() : model.ref(classForPrimitive);
        }
        return addMethodParam(method, variable, javadoc, type);
    }

    private JVar addMethodParam(JMethod method, Variable<?> variable, JDocComment javadoc, JType type) {
        JVar param = method.param(type, variable.getName());
        String paramDescription = variable.getDescription() == null ? variable.getName() : variable.getDescription();
        javadoc.addParam(param).add(paramDescription);
        return param;
    }

    JType getJType(Type type, JClassContainer classContainer) {
        if (type instanceof SimpleType) {
            return model.ref(getClassForSimpleType((SimpleType) type));
        } else if (type instanceof MapType) {
            return model.ref(Map.class).narrow(String.class, Object.class);
        } else if (type instanceof ArrayType) {
            JType genericType = getJType(((ArrayType) type).getType(), classContainer);
            return model.ref(List.class).narrow(genericType);
        } else if (type instanceof EnumType) {
            return modelGenerator.createEnum((EnumType) type, classContainer);
        } else {
            return modelGenerator.createClass((ObjectType) type, classContainer, false);
        }
    }
}
