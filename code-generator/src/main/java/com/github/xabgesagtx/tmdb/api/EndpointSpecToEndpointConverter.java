package com.github.xabgesagtx.tmdb.api;

import com.github.xabgesagtx.tmdb.api.external.EndpointSpec;
import com.github.xabgesagtx.tmdb.api.external.SchemaSpec;
import com.github.xabgesagtx.tmdb.codegen.model.Endpoint;
import com.google.common.base.CaseFormat;

import java.util.Collections;
import java.util.List;

public class EndpointSpecToEndpointConverter {

    private final SpecToTypeConverter specToTypeConverter;

    public EndpointSpecToEndpointConverter(List<SchemaSpec> schemaSpecs) {
        RefTypeResolver refTypeResolver = new RefTypeResolver(schemaSpecs);
        this.specToTypeConverter = new SpecToTypeConverter(refTypeResolver);
    }

    Endpoint convert(EndpointSpec spec) {
        String endpointName = getEndpointName(spec.getSlug());
        String typeName = getTypeName(spec.getSlug());

        String path = spec.getRequest().getPath();
        String method = spec.getRequest().getMethod();
        /* TODO:
            - Use path and request variables
            - verify response type
            - consider traits (request and response)
        */
        return new Endpoint(endpointName, path, method, Collections.emptyMap(), Collections.emptyMap(), specToTypeConverter.generateType(typeName, spec.getResponses().get(0).getBody()), Collections.emptyMap());
    }

    String getEndpointName(String slug) {
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, slug);
    }

    String getTypeName(String slug) {
        String completeSlug = slug + "-response";
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_UNDERSCORE, completeSlug);
    }
}
