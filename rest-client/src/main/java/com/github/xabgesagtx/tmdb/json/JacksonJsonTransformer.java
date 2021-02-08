package com.github.xabgesagtx.tmdb.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JacksonJsonTransformer implements JsonTransformer {

    private final ObjectMapper mapper;

    public JacksonJsonTransformer() {
        mapper = JsonMapper.builder()
                .propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .addModule(new JavaTimeModule())
                .build();
    }

    @Override
    public <T> T readValue(String body, TypeReference<T> typeReference) throws JsonTransformingException {
        try {
            return mapper.readValue(body, typeReference);
        } catch (JsonProcessingException e) {
            throw new JsonTransformingException("Failed to read body", e);
        }
    }

    @Override
    public String writeAsString(Object object) throws JsonTransformingException {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new JsonTransformingException("Failed to read body", e);
        }
    }
}
