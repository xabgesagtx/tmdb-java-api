package com.github.xabgesagtx.tmdb.codegen;

import com.github.xabgesagtx.tmdb.codegen.model.Resource;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.RestClientImpl;
import com.google.common.base.CaseFormat;
import com.sun.codemodel.*;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CodeGenerator extends AbstractGenerator {

    private final JCodeModel model;
    private final ResourceGenerator resourceGenerator;


    public CodeGenerator() {
        model = new JCodeModel();
        resourceGenerator = new ResourceGenerator(model);
    }

    public void generateFor(List<Resource> resources, String basePackage, File outputDir) throws IOException {
        JPackage jPackage = model._package(basePackage);
        List<JDefinedClass> resourceClasses = resources.stream().map(resource -> resourceGenerator.generateResource(resource, jPackage)).collect(Collectors.toList());
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

        // convenience constructor
        JMethod apiKeyConstructor = tmdbApi.constructor(JMod.PUBLIC);
        JVar apiKeyParam = apiKeyConstructor.param(String.class, "apiKey");
        JInvocation restClientImpl = JExpr._new(model.ref(RestClientImpl.class)).arg(apiKeyParam);
        apiKeyConstructor.body().invoke("this").arg(restClientImpl);
    }

}
