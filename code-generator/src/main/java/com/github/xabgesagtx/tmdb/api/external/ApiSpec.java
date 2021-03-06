package com.github.xabgesagtx.tmdb.api.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Jacksonized
@Builder
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiSpec {

    List<GroupSpec> groups;
    ResourcesSpec resources;

}
