package com.github.xabgesagtx.tmdb.http.exceptions;

public abstract class TmdbApiException extends RuntimeException {

    TmdbApiException(String message, Exception exception) {
        super(message, exception);
    }

    TmdbApiException(String message) {
        super(message);
    }
}
