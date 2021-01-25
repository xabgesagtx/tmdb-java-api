package com.github.xabgesagtx.tmdb.http.exceptions;

public class UnexpectedStatusCodeException extends TmdbApiException {

    public UnexpectedStatusCodeException(int statusCode) {
        super(String.format("Unexptected status code %s returned from api", statusCode));
    }

}
