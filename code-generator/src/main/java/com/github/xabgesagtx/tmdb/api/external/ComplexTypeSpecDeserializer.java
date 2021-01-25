package com.github.xabgesagtx.tmdb.api.external;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.xabgesagtx.tmdb.ObjectMapperFactory;

import java.io.IOException;

public class ComplexTypeSpecDeserializer extends JsonDeserializer<ComplexTypeSpec> {

    // TODO: Check if there is a way around this
    private final ObjectMapper objectMapper;

    public ComplexTypeSpecDeserializer() {
        objectMapper = new ObjectMapperFactory().create();
    }

    @Override
    public ComplexTypeSpec deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String specJson = jsonParser.getValueAsString();
        if (specJson == null || specJson.isBlank()) {
            return null;
        } else {
            return objectMapper.readValue(specJson, ComplexTypeSpec.class);
        }
    }
}
