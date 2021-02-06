package com.github.xabgesagtx.tmdb.codegen.model;

public interface Variable<T> {

    T getType();

    String getName();

    String getJsonName();

}
