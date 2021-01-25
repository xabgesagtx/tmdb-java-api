package com.github.xabgesagtx.tmdb.json;

public class JsonTransformingException extends RuntimeException {

    public JsonTransformingException(String message, Exception exception) {
        super(message, exception);
    }
}
