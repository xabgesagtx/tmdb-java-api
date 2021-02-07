
package com.github.xabgesagtx.tmdb.lists;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateListRequest {

    @JsonProperty("name")
    String name;
    @JsonProperty("description")
    String description;
    @JsonProperty("language")
    String language;

}
