package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.Map;

@Value
@Builder
public class Endpoint {

    String name;
    String path;
    String method;
    List<Variable<?>> pathVariables;
    List<Variable<?>> requestParams;
    Type response;
    Map<Integer, Type> errorResponses;

}
