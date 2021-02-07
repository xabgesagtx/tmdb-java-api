package com.github.xabgesagtx.tmdb.api;

import com.github.xabgesagtx.tmdb.api.external.*;
import com.github.xabgesagtx.tmdb.codegen.model.*;
import com.google.common.base.CaseFormat;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
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
        String responseTypeName = getResponseTypeName(spec.getSlug());

        RequestSpec request = spec.getRequest();
        String path = request.getPath();
        String method = request.getMethod();
        List<Variable<?>> pathVariables = getPathVariables(spec.getSlug(), request);
        List<Variable<?>> requestParams = getRequestParams(spec.getSlug(), request);


        /* TODO:
            - consider traits (request and response)
        */
        Type response = specToTypeConverter.generateType(responseTypeName, spec.getResponses().get(0).getBody());
        ObjectType requestBody = getRequestBody(spec.getSlug(), spec.getRequest()).orElse(null);
        return Endpoint.builder()
                .name(endpointName)
                .description(spec.getDescription())
                .path(path)
                .method(method)
                .pathVariables(pathVariables)
                .requestBody(requestBody)
                .requestParams(requestParams)
                .errorResponses(Collections.emptyMap())
                .response(response)
                .build();
    }

    private Optional<ObjectType> getRequestBody(String slug, RequestSpec request) {
        String requestTypeName = getRequestTypeName(slug);
        return request.getBodies().stream()
                .map(BodySpec::getBody)
                .filter(Objects::nonNull)
                .filter(body -> body.getProperties() != null && !body.getProperties().isEmpty())
                .map(body -> specToTypeConverter.generateType(requestTypeName, body))
                .map(requestBodyType -> (ObjectType) requestBodyType)
                .findFirst();
    }

    private List<Variable<?>> getRequestParams(String slug, RequestSpec request) {
        Type requestType = specToTypeConverter.generateType("request", request.getQueryString());
        if (requestType instanceof ObjectType) {
            List<String> requiredFields = Objects.requireNonNullElse(request.getQueryString().getRequired(), Collections.emptyList());
            ObjectType requestObjectType = (ObjectType) requestType;
            return typeToMapOfVariables(slug, requestObjectType, requiredFields);
        } else {
            return Collections.emptyList();
        }
    }

    private List<Variable<?>> typeToMapOfVariables(String slug, ObjectType type, List<String> requiredFields) {
        List<Field> fields = type.getFields();
        return fields.stream()
                .map(field -> {
                    boolean required = requiredFields.contains(field.getJsonName());
                    if (field.getType() instanceof EnumType) {
                        EnumType variableType = ((EnumType) field.getType());
                        String prefix = CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, slug);
                        String suffix = "Param";
                        String variableTypeName = prefix + variableType.getName() + suffix;
                        return new EnumVariable(variableType.withName(variableTypeName), field.getName(), field.getJsonName(), required);
                    } else if (field.getType() instanceof SimpleType) {
                        SimpleType.Primitive variableType = ((SimpleType) field.getType()).getPrimitive();
                        return new PrimitiveVariable(variableType, field.getName(), field.getJsonName(), required);
                    } else {
                        log.info("Found non simple field for {}: {}", type.getName(), field);
                        SimpleType.Primitive variableType = SimpleType.Primitive.STRING;
                        return new PrimitiveVariable(variableType, field.getName(), field.getJsonName(), required);
                    }
                })
                .collect(Collectors.toList());
    }

    private List<Variable<?>> getPathVariables(String slug, RequestSpec request) {
        Type requestType = specToTypeConverter.generateType("path", request.getPathParams());
        if (requestType instanceof ObjectType) {
            ObjectType requestObjectType = (ObjectType) requestType;
            return typeToMapOfVariables(slug, requestObjectType, requestObjectType.getFields().stream().map(Field::getJsonName).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    String getEndpointName(String slug) {
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, slug);
    }

    String getResponseTypeName(String slug) {
        String completeSlug = slug + "-response";
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_UNDERSCORE, completeSlug);
    }

    String getRequestTypeName(String slug) {
        String completeSlug = slug + "-request";
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_UNDERSCORE, completeSlug);
    }
}
