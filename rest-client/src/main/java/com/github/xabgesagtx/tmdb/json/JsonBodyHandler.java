package com.github.xabgesagtx.tmdb.json;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.RequiredArgsConstructor;

import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

@RequiredArgsConstructor
public class JsonBodyHandler<T> implements HttpResponse.BodyHandler<T> {

    private final TypeReference<T> typeReference;
    private final JsonTransformer transformer;


    @Override
    public HttpResponse.BodySubscriber<T> apply(HttpResponse.ResponseInfo responseInfo) {
        if (responseInfo.statusCode() >= 300) {
            return HttpResponse.BodySubscribers.replacing(null);
        } else {
            HttpResponse.BodySubscriber<String> upstream = HttpResponse.BodySubscribers.ofString(StandardCharsets.UTF_8);

            return HttpResponse.BodySubscribers.mapping(
                    upstream,
                    body -> transformer.readValue(body, typeReference));
        }
    }


}
