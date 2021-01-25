
package com.github.xabgesagtx.tmdb.authentication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSessionResponse {

    @JsonProperty("success")
    Boolean success;
    @JsonProperty("session_id")
    String sessionId;

}
