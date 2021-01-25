
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
public class CheckItemStatusResponse {

    @JsonProperty("id")
    String id;
    @JsonProperty("item_present")
    Boolean itemPresent;

}
