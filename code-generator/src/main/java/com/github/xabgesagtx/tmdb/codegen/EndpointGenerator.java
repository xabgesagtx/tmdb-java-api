package com.github.xabgesagtx.tmdb.codegen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.codegen.model.*;
import com.google.common.base.CaseFormat;
import com.sun.codemodel.*;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EndpointGenerator extends AbstractGenerator {
    private final JCodeModel model;
    private final JavaDocFormatter javaDocFormatter;
    private final ModelGenerator modelGenerator;

    public EndpointGenerator(JCodeModel model) {
        this.model = model;
        javaDocFormatter = new JavaDocFormatter("https://developers.themoviedb.org/");
        modelGenerator = new ModelGenerator(model);
    }

    void generateEndpoint(JDefinedClass resourceClass, JPackage jPackage, Endpoint endpoint) {
        JType resultType = getJType(endpoint.getResponse(), jPackage, false);
        JType optionalResultType = model.ref(Optional.class).narrow(resultType);
        JMethod method = resourceClass.method(JMod.PUBLIC, optionalResultType, endpoint.getName());
        String javaDocText = javaDocFormatter.format(endpoint.getDescription());
        method.javadoc().add(javaDocText);
        Map<String, JVar> pathVariables = endpoint.getPathVariables()
                .stream()
                .sorted(Comparator.comparing(Variable::getName, Comparator.naturalOrder()))
                .map(variable -> Pair.of(variable.getJsonName(), createMethodParam(method, resourceClass, variable)))
                .collect(Collectors.toMap(Pair::getKey, Pair::getValue));
        JExpression requestBodyExpression = JExpr._null();
        if (endpoint.getRequestBody() != null) {
            JDefinedClass requestClass = modelGenerator.createClass(endpoint.getRequestBody(), jPackage, false);
            String requestBodyParamName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, endpoint.getRequestBody().getName());
            requestBodyExpression = method.param(requestClass, requestBodyParamName);
        }
        Map<String, JVar> requestParams = endpoint.getRequestParams()
                .stream()
                .sorted(Comparator.comparing(Variable::getName, Comparator.naturalOrder()))
                .map(variable -> Pair.of(variable.getJsonName(), createMethodParam(method, resourceClass, variable)))
                .collect(Collectors.toMap(Pair::getKey, Pair::getValue));
        JBlock body = method.body();
        JVar formattedPath = formatPath(body, endpoint.getPath(), pathVariables);
        JExpression requestParamsExpression = createRequestParamsMap(body, requestParams);
        JFieldVar restClient = resourceClass.fields().get("restClient");
        JExpression typeReference = JExpr._new(model.anonymousClass(model.ref(TypeReference.class).narrow(new JClass[0])));
        JInvocation restClientInvocation = restClient.invoke(endpoint.getMethod())
                .arg(formattedPath)
                .arg(requestParamsExpression)
                .arg(typeReference);
        if (Set.of("post", "delete", "put").contains(endpoint.getMethod())) {
            restClientInvocation.arg(requestBodyExpression);
        }
        body._return(restClientInvocation);
    }

    private JExpression createRequestParamsMap(JBlock body, Map<String, JVar> requestParams) {
        if (requestParams.isEmpty()) {
            return body.decl(model.ref(Map.class).narrow(String.class, Object.class),
                    "requestParams",
                    model.ref(Collections.class).staticInvoke("emptyMap"));
        } else {
            var mapVar = body.decl(model.ref(Map.class).narrow(String.class, Object.class),
                    "requestParams",
                    JExpr._new(model.ref(HashMap.class).narrow(new JClass[0])));
            requestParams.forEach((name, variable) -> body.invoke(mapVar, "put").arg(JExpr.lit(name)).arg(variable));
            return mapVar;
        }
    }

    private JVar formatPath(JBlock body, String path, Map<String, JVar> pathVariables) {
        if (pathVariables.isEmpty()) {
            return body.decl(model.ref(String.class), "path", JExpr.lit(path));
        } else {
            Pattern searchPattern = Pattern.compile("\\{([^}]+)}");
            Matcher matcher = searchPattern.matcher(path);
            String pathPattern = path.replaceAll("\\{[^}]+}", "%s");
            JInvocation invocation = model.ref(String.class).staticInvoke("format").arg(JExpr.lit(pathPattern));
            while (matcher.find()) {
                String variableName = matcher.group(1);
                JVar var = pathVariables.get(variableName);
                invocation.arg(var);
            }
            body.directStatement("// " + path);
            return body.decl(model.ref(String.class), "path", invocation);
        }
    }

    JVar createMethodParam(JMethod method, JDefinedClass resourceClass, Variable<?> variable) {
        if (variable instanceof EnumVariable) {
            EnumVariable enumVariable = (EnumVariable) variable;
            JDefinedClass enumClass = modelGenerator.createEnum(enumVariable.getType(), resourceClass);
            return method.param(enumClass, variable.getName());
        } else {
            PrimitiveVariable primitiveVariable = (PrimitiveVariable) variable;
            return method.param(model.ref(getClassForPrimitive(primitiveVariable.getType())).unboxify(), variable.getName());
        }
    }

    JType getJType(Type type, JClassContainer classContainer, boolean shouldBeStatic) {
        if (type instanceof SimpleType) {
            return model.ref(getClassForSimpleType((SimpleType) type));
        } else if (type instanceof MapType) {
            return model.ref(Map.class).narrow(String.class, Object.class);
        } else if (type instanceof ArrayType) {
            JType genericType = getJType(((ArrayType) type).getType(), classContainer, shouldBeStatic);
            return model.ref(List.class).narrow(genericType);
        } else if (type instanceof EnumType) {
            return modelGenerator.createEnum((EnumType) type, classContainer);
        } else {
            return modelGenerator.createClass((ObjectType) type, classContainer, false);
        }
    }
}
