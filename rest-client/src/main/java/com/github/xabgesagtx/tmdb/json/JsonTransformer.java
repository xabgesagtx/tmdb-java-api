package com.github.xabgesagtx.tmdb.json;

import com.fasterxml.jackson.core.type.TypeReference;

public interface JsonTransformer {

    <T> T readValue(String body, TypeReference<T> typeReference);
}
