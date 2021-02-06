package com.github.xabgesagtx.tmdb.http;

import java.util.Map;
import java.util.Optional;

public interface RestClient {

    <T> Optional<T> get(String path, Map<String,Object> params, Class<T> clazz);
    <T> Optional<T> get(String path, Class<T> clazz);
    <T> Optional<T> post(String path, Map<String, Object> params, Class<T> clazz);
    <T> Optional<T> delete(String path, Map<String, Object> params, Class<T> clazz);
    <T> Optional<T> put(String path, Map<String, Object> params, Class<T> clazz);

}
