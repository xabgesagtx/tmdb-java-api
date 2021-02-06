package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;
import lombok.With;

import java.util.List;

@Value
@With
public class EnumType implements ClassType {

    String name;

    List<String> values;

}
