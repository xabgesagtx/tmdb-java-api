package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

@Value
public class EnumVariable implements Variable<EnumType> {
    EnumType type;
    String name;
    String jsonName;
}
