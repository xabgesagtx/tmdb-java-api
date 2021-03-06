
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
public class CreateRequestTokenResponse {

    @JsonProperty("success")
    Boolean success;
    @JsonProperty("expires_at")
    String expiresAt;
    @JsonProperty("request_token")
    String requestToken;

}
