package com.github.xabgesagtx.tmdb.api.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Jacksonized
@Builder
@Value
@With
@JsonIgnoreProperties(ignoreUnknown = true)
public class EndpointSpec {

    @JsonProperty("_id")
    String id;
    String name;
    String description;
    RequestSpec request;
    String slug;
    List<ResponseSpec> responses;
    List<String> produces;
    List<String> consumes;
    List<String> traits;

}
