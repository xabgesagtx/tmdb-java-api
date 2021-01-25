
package com.github.xabgesagtx.tmdb.keywords;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetKeywordDetailsResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("name")
    String name;

}
