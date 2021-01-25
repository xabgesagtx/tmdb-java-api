package com.github.xabgesagtx.tmdb.codegen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.xabgesagtx.tmdb.codegen.model.*;
import com.github.xabgesagtx.tmdb.codegen.model.ClassType;
import com.sun.codemodel.*;
import lombok.Builder;
import lombok.SneakyThrows;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
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
        resources.forEach(resource -> generateResource(resource, jPackage, model));
        model.build(outputDir);
    }

    @SneakyThrows
    private void generateResource(Resource resource, JPackage basePackage, JCodeModel model) {
        JPackage resourcePackage = basePackage.subPackage(resource.getName().toLowerCase(Locale.ENGLISH).replaceAll("\\s", ""));
        JDefinedClass resourceClass = resourcePackage._class(JMod.PUBLIC, resource.getName().replaceAll("\\s", ""));
        resource.getEndpoints().forEach(endpoint -> generateEndpoint(resourceClass, resourcePackage, endpoint));
    }

    void generateEndpoint(JDefinedClass resourceClass, JPackage jPackage, Endpoint endpoint) {
        JType resultType = getJType(endpoint.getResponse(), jPackage, false);
        JMethod method = resourceClass.method(JMod.PUBLIC, resultType, endpoint.getName());
        JBlock body = method.body();
        body.decl(model.ref(String.class), "path", JExpr.lit(endpoint.getPath()));
        body._return(JExpr.ref("null"));
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
