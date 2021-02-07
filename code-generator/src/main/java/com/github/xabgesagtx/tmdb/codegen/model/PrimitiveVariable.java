package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

@Value
public class PrimitiveVariable implements Variable<SimpleType.Primitive> {
    SimpleType.Primitive type;
    String name;
    String jsonName;
    boolean required;
}
