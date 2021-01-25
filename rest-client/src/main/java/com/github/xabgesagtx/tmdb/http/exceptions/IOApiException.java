package com.github.xabgesagtx.tmdb.http.exceptions;

public class IOApiException extends TmdbApiException {

    public IOApiException(String message, Exception exception) {
        super(message, exception);
    }

}
