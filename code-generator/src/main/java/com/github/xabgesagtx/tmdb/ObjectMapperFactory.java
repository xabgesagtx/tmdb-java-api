package com.github.xabgesagtx.tmdb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class ObjectMapperFactory {

    public ObjectMapper create() {
        return JsonMapper.builder()
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .serializationInclusion(JsonInclude.Include.NON_EMPTY)
                .build();
    }
}
