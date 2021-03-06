package com.github.xabgesagtx.tmdb.api.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Jacksonized
@Builder
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupSpec {

    @JsonProperty("_id")
    String id;
    String type;
    String name;
    String description;
    List<GroupItemSpec> items;

}
