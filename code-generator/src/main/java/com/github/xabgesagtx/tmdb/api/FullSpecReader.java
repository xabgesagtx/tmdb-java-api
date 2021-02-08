package com.github.xabgesagtx.tmdb.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.github.xabgesagtx.tmdb.api.external.ApiSpec;
import com.github.xabgesagtx.tmdb.api.external.ComplexTypeSpec;

import java.io.File;
import java.io.IOException;

public class FullSpecReader {

    private final ObjectMapper mapper;

    public FullSpecReader() {
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addDeserializer(ComplexTypeSpec.class, new ComplexTypeSpecDeserializer());
        mapper = new ObjectMapper().registerModule(simpleModule);
//        mapper = new ObjectMapper();
    }

    public ApiSpec read(File file) throws IOException {
        return mapper.readValue(file, ApiSpec.class);
    }

}
