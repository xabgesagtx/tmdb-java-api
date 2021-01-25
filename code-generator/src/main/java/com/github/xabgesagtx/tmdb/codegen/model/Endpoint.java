package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

import java.util.Map;

@Value
public class Endpoint {

    String name;
    String path;
    String method;
    Map<String, SimpleType.Primitive> pathVariables;
    Map<String, SimpleType.Primitive> requestParams;
    Type response;
    Map<Integer, Type> errorResponses;

}
