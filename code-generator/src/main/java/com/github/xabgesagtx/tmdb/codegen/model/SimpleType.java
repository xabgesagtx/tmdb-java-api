package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

@Value
public class SimpleType implements Type {

    public enum Primitive {
        STRING, DATE, INTEGER, FLOAT, BOOLEAN
    }

    Primitive primitive;


}
