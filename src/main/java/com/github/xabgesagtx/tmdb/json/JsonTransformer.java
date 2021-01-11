package com.github.xabgesagtx.tmdb.json;

public interface JsonTransformer {

    <T> T readValue(String body, Class<T> clazz);
}
