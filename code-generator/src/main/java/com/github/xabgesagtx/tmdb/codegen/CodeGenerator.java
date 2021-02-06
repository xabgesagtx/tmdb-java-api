package com.github.xabgesagtx.tmdb.codegen;

import com.github.xabgesagtx.tmdb.codegen.model.*;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.google.common.base.CaseFormat;
import com.sun.codemodel.*;
import lombok.SneakyThrows;
import org.apache.commons.lang3.tuple.Pair;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CodeGenerator extends AbstractGenerator {

    private final JCodeModel model;
    private final ModelGenerator modelGenerator;

    public CodeGenerator() {
        model = new JCodeModel();
        modelGenerator = new ModelGenerator(model);
    }

    public void generateFor(List<Resource> resources, String basePackage, File outputDir) throws IOException {
        JPackage jPackage = model._package(basePackage);
        List<JDefinedClass> resourceClasses = resources.stream().map(resource -> generateResource(resource, jPackage, model)).collect(Collectors.toList());
        generateMainApiClass(jPackage, resourceClasses);
        model.build(outputDir);
    }

    @SneakyThrows
    private void generateMainApiClass(JPackage basePackage, List<JDefinedClass> resourceClasses) {
        JDefinedClass tmdbApi = basePackage._class(JMod.PUBLIC, "TmdbApi");
        JMethod constructor = tmdbApi.constructor(JMod.PUBLIC);
        JVar restClient = constructor.param(RestClient.class, "restClient");
        JBlock constructorBody = constructor.body();
        resourceClasses.forEach(resource -> {
            String resourceName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, resource.name());
            JFieldVar field = tmdbApi.field(JMod.PRIVATE | JMod.FINAL, resource, resourceName);
            constructorBody.assign(field, JExpr._new(resource).arg(restClient));
            tmdbApi.method(JMod.PUBLIC, resource, resourceName).body()._return(field);
        });
    }

    @SneakyThrows
    private JDefinedClass generateResource(Resource resource, JPackage basePackage, JCodeModel model) {
        JPackage resourcePackage = basePackage.subPackage(resource.getName().toLowerCase(Locale.ENGLISH).replaceAll("\\s", ""));
        JDefinedClass resourceClass = generateResourceClass(resource, resourcePackage);
        resource.getEndpoints().forEach(endpoint -> generateEndpoint(resourceClass, resourcePackage, endpoint));
        return resourceClass;
    }

    private JDefinedClass generateResourceClass(Resource resource, JPackage resourcePackage) throws JClassAlreadyExistsException {
        JDefinedClass resourceClass = resourcePackage._class(JMod.PUBLIC, resource.getName().replaceAll("\\s", ""));
        JFieldVar restClientField = resourceClass.field(JMod.PRIVATE | JMod.FINAL, RestClient.class, "restClient");
        JMethod constructor = resourceClass.constructor(JMod.PUBLIC);
        JVar restClientParam = constructor.param(RestClient.class, "restClient");
        constructor.body().assign(JExpr._this().ref(restClientField), restClientParam);
        return resourceClass;
    }

    void generateEndpoint(JDefinedClass resourceClass, JPackage jPackage, Endpoint endpoint) {
        JType resultType = getJType(endpoint.getResponse(), jPackage, false);
        JMethod method = resourceClass.method(JMod.PUBLIC, resultType, endpoint.getName());
        Map<String, JVar> pathVariables = endpoint.getPathVariables()
                .stream()
                .sorted(Comparator.comparing(PrimitiveVariable::getName, Comparator.naturalOrder()))
                .map(variable -> Pair.of(variable.getJsonName(), createMethodParam(method, variable)))
                .collect(Collectors.toMap(Pair::getKey, Pair::getValue));
        JBlock body = method.body();
        formatPath(body, endpoint.getPath(), pathVariables);
        body._return(JExpr.ref("null"));
    }

    private void formatPath(JBlock body, String path, Map<String, JVar> pathVariables) {
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
        body.decl(model.ref(String.class), "path", invocation);
    }

    JVar createMethodParam(JMethod method, PrimitiveVariable variable) {
        return method.param(getClassForPrimitive(variable.getType()), variable.getName());
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
