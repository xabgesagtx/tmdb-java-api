
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
public class ValidateRequestTokenRequest {

    @JsonProperty("username")
    String username;
    @JsonProperty("password")
    String password;
    @JsonProperty("request_token")
    String requestToken;

}
