package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

@Value
public class Field {

    Type type;
    String name;
    String jsonName;
    String description;

}
