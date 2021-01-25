package com.github.xabgesagtx.tmdb.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.xabgesagtx.tmdb.ObjectMapperFactory;
import com.github.xabgesagtx.tmdb.api.external.ComplexTypeSpec;

import java.io.File;
import java.io.IOException;

public class SpecReader {

    private final ObjectMapper mapper;

    public SpecReader() {
        mapper = new ObjectMapperFactory().create();
    }

    public ComplexTypeSpec read(File file) throws IOException {
        return mapper.readValue(file, ComplexTypeSpec.class);
    }

}
