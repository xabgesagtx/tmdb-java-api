package com.github.xabgesagtx.tmdb.api.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class SchemaSpec {

    @JsonProperty("_id")
    String id;
    /**
     * Type spec
     */
    ComplexTypeSpec definition;
    String description;
    String name;
    /**
     * Reference
     */
    String namespace;

}
