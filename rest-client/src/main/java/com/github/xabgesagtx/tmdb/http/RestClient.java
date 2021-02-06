package com.github.xabgesagtx.tmdb.http;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Map;
import java.util.Optional;

public interface RestClient {

    <T> Optional<T> get(String path, Map<String,Object> params, TypeReference<T> typeReference);
    <T> Optional<T> get(String path, TypeReference<T> typeReference);
    <T> Optional<T> post(String path, Map<String, Object> params, TypeReference<T> typeReference);
    <T> Optional<T> delete(String path, Map<String, Object> params, TypeReference<T> typeReference);
    <T> Optional<T> put(String path, Map<String, Object> params, TypeReference<T> typeReference);

}
