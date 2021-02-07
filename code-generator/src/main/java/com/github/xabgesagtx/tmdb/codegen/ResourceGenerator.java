package com.github.xabgesagtx.tmdb.codegen;

import com.github.xabgesagtx.tmdb.codegen.model.Resource;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.sun.codemodel.*;
import lombok.SneakyThrows;

import java.util.Locale;

public class ResourceGenerator extends AbstractGenerator {

    private final EndpointGenerator endpointGenerator;

    public ResourceGenerator(JCodeModel model) {
        endpointGenerator = new EndpointGenerator(model);
    }

    @SneakyThrows
    JDefinedClass generateResource(Resource resource, JPackage basePackage) {
        JPackage resourcePackage = basePackage.subPackage(resource.getName().toLowerCase(Locale.ENGLISH).replaceAll("\\s", ""));
        JDefinedClass resourceClass = generateResourceClass(resource, resourcePackage);
        resource.getEndpoints().forEach(endpoint -> endpointGenerator.generateEndpoint(resourceClass, resourcePackage, endpoint));
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

}
