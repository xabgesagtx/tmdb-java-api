package com.github.xabgesagtx.tmdb.http;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Map;
import java.util.Optional;

public interface RestClient {

    <T> T get(String path, Map<String,Object> params, TypeReference<T> typeReference);
    <T> Optional<T> getOpt(String path, Map<String,Object> params, TypeReference<T> typeReference);
    <T> T post(String path, Map<String, Object> params, TypeReference<T> typeReference, Object requestBody);
    <T> T delete(String path, Map<String, Object> params, TypeReference<T> typeReference, Object requestBody);
    <T> T put(String path, Map<String, Object> params, TypeReference<T> typeReference, Object requestBody);

}
