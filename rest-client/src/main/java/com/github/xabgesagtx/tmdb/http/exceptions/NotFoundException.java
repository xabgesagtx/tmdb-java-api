package com.github.xabgesagtx.tmdb.http.exceptions;

public class NotFoundException extends TmdbApiException {
    public NotFoundException(String path) {
        super(String.format("Could not find resource at path %s", path));
    }
}
