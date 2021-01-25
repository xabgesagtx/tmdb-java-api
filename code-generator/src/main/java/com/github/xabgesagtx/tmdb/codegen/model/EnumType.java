package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

import java.util.List;

@Value
public class EnumType implements ClassType {

    String name;

    List<String> values;

}
