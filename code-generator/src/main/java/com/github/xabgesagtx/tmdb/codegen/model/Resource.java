package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

import java.util.List;

@Value
public class Resource {

    String name;
    List<Endpoint> endpoints;

}
