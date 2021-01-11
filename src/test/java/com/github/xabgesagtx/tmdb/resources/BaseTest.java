package com.github.xabgesagtx.tmdb.resources;

import com.github.xabgesagtx.tmdb.http.RestClientImpl;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;

public class BaseTest {

    protected static final String API_KEY = "mock-api-key";

    @SneakyThrows
    protected String readFile(String path) {
        return Files.readString(Paths.get(getClass().getResource(path).toURI()));
    }

    protected RestClientImpl createRestClient(String uri) {
        return new RestClientImpl(API_KEY, uri);
    }
}
