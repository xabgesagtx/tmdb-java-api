package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

@Value
public class PrimitiveVariable {
    SimpleType.Primitive type;
    String name;
    String jsonName;
}
