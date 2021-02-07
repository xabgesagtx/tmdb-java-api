package com.github.xabgesagtx.tmdb.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.exceptions.UnauthorizedException;
import com.github.xabgesagtx.tmdb.http.exceptions.UnexpectedStatusCodeException;
import com.github.xabgesagtx.tmdb.json.JsonBodyHandler;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import com.github.xabgesagtx.tmdb.http.exceptions.ForbiddenException;
import com.github.xabgesagtx.tmdb.http.exceptions.IOApiException;
import com.github.xabgesagtx.tmdb.json.JacksonJsonTransformer;
import com.github.xabgesagtx.tmdb.json.JsonTransformer;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static java.util.stream.Collectors.joining;

@RequiredArgsConstructor
public class RestClientImpl implements RestClient {

    private final HttpClient client;
    private final JsonTransformer jsonTransformer;
    @NonNull
    private final String apiKey;
    @NonNull
    private final String baseUrl;

    public RestClientImpl(String apiKey) {
        this(apiKey, "https://api.themoviedb.org/3");
    }

    public RestClientImpl(String apiKey, String baseUrl) {
        this(HttpClient.newHttpClient(), new JacksonJsonTransformer(), apiKey, baseUrl);
    }



    @Override
    @SneakyThrows
    public <T> Optional<T> get(String path, Map<String, Object> params, TypeReference<T> typeReference) {
        URI uri = createUri(path, params);
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();
        try {
            HttpResponse<T> response = client.send(request, new JsonBodyHandler<>(typeReference, jsonTransformer));
            return handleResponse(response);
        } catch (IOException e) {
            throw new IOApiException("IO issue while performing get", e);
        }

    }

    @Override
    public <T> Optional<T> get(String path, TypeReference<T> typeReference) {
        return get(path, Collections.emptyMap(), typeReference);
    }

    @Override
    public <T> Optional<T> post(String path, Map<String, Object> params, TypeReference<T> typeReference, Object requestBody) {
        return Optional.empty();
    }

    @Override
    public <T> Optional<T> delete(String path, Map<String, Object> params, TypeReference<T> typeReference, Object requestBody) {
        return Optional.empty();
    }

    @Override
    public <T> Optional<T> put(String path, Map<String, Object> params, TypeReference<T> typeReference, Object requestBody) {
        return Optional.empty();
    }

    <T> Optional<T> handleResponse(HttpResponse<T> response) {
        switch (response.statusCode()) {
            case 200:
                return Optional.of(response.body());
            case 401:
                throw new UnauthorizedException("Got unauthorized from API");
            case 403:
                throw new ForbiddenException("Got forbidden from API");
            case 404:
                return Optional.empty();
            default:
                throw new UnexpectedStatusCodeException(response.statusCode());
        }
    }

    private URI createUri(String path, Map<String, Object> params) {
        HashMap<String, Object> mutableParams = new HashMap<>(params);
        mutableParams.put("api_key", apiKey);
        String query = createQuery(mutableParams);
        return URI.create(baseUrl + path + query);
    }

    private String createQuery(Map<String, Object> params) {
        if (params.isEmpty()) {
            return "";
        } else {
            return params.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + encodeValue(entry.getValue()))
                    .collect(joining("&", "?", ""));
        }
    }

    private String encodeValue(Object value) {
        return URLEncoder.encode(Objects.toString(value), StandardCharsets.UTF_8);
    }

}
