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
    List<PrimitiveVariable> pathVariables;
    List<PrimitiveVariable> requestParams;
    Type response;
    Map<Integer, Type> errorResponses;

}
