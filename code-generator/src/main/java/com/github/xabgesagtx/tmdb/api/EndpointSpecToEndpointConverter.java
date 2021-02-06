package com.github.xabgesagtx.tmdb.api;

import com.github.xabgesagtx.tmdb.api.external.EndpointSpec;
import com.github.xabgesagtx.tmdb.api.external.RequestSpec;
import com.github.xabgesagtx.tmdb.api.external.SchemaSpec;
import com.github.xabgesagtx.tmdb.codegen.model.*;
import com.google.common.base.CaseFormat;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class EndpointSpecToEndpointConverter {

    private final SpecToTypeConverter specToTypeConverter;

    public EndpointSpecToEndpointConverter(List<SchemaSpec> schemaSpecs) {
        RefTypeResolver refTypeResolver = new RefTypeResolver(schemaSpecs);
        this.specToTypeConverter = new SpecToTypeConverter(refTypeResolver);
    }

    Endpoint convert(EndpointSpec spec) {
        String endpointName = getEndpointName(spec.getSlug());
        String typeName = getTypeName(spec.getSlug());

        RequestSpec request = spec.getRequest();
        String path = request.getPath();
        String method = request.getMethod();
        List<Variable<?>> pathVariables = getPathVariables(request);
        List<Variable<?>> requestParams = getRequestParams(request);

        /* TODO:
            - Use path and request variables
            - verify response type
            - consider traits (request and response)
        */
        Type response = specToTypeConverter.generateType(typeName, spec.getResponses().get(0).getBody());
        return Endpoint.builder()
                .name(endpointName)
                .description(spec.getDescription())
                .path(path)
                .method(method)
                .pathVariables(pathVariables)
                .requestParams(requestParams)
                .errorResponses(Collections.emptyMap())
                .response(response)
                .build();
    }

    private List<Variable<?>> getRequestParams(RequestSpec request) {
        Type requestType = specToTypeConverter.generateType("request", request.getQueryString());
        return typeToMapOfVariables(requestType);
    }

    private List<Variable<?>> typeToMapOfVariables(Type type) {
        if (type instanceof ObjectType) {
            ObjectType objectType = (ObjectType) type;
            List<Field> fields = objectType.getFields();
            return fields.stream()
                    .map(field -> {
                        if (field.getType() instanceof EnumType) {
                            EnumType variableType = ((EnumType) field.getType());
                            return new EnumVariable(variableType.withName(variableType.getName() + "Param"), field.getName(), field.getJsonName());
                        } else if (field.getType() instanceof SimpleType) {
                            SimpleType.Primitive variableType = ((SimpleType) field.getType()).getPrimitive();
                            return new PrimitiveVariable(variableType, field.getName(), field.getJsonName());
                        } else {
                            log.info("Found non simple field for {}: {}", objectType.getName(), field);
                            SimpleType.Primitive variableType = SimpleType.Primitive.STRING;
                            return new PrimitiveVariable(variableType, field.getName(), field.getJsonName());
                        }
                    })
                    .collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }

    private List<Variable<?>> getPathVariables(RequestSpec request) {
        Type requestType = specToTypeConverter.generateType("path", request.getPathParams());
        return typeToMapOfVariables(requestType);
    }

    String getEndpointName(String slug) {
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, slug);
    }

    String getTypeName(String slug) {
        String completeSlug = slug + "-response";
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_UNDERSCORE, completeSlug);
    }
}
