package com.github.xabgesagtx.tmdb.api;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.xabgesagtx.tmdb.api.SpecObjectMapperFactory;
import com.github.xabgesagtx.tmdb.api.external.ComplexTypeSpec;

import java.io.IOException;

public class ComplexTypeSpecDeserializer extends JsonDeserializer<ComplexTypeSpec> {

    // TODO: Check if there is a way around this
    private final ObjectMapper objectMapper;

    public ComplexTypeSpecDeserializer() {
        objectMapper = new SpecObjectMapperFactory().create();
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
