
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
public class CreateListResponse {

    @JsonProperty("status_message")
    String statusMessage;
    @JsonProperty("success")
    Boolean success;
    @JsonProperty("status_code")
    Integer statusCode;
    @JsonProperty("list_id")
    Integer listId;

}
