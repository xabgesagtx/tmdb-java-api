
package com.github.xabgesagtx.tmdb.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAccountDetailsResponse {

    @JsonProperty("avatar")
    GetAccountDetailsResponse.Avatar avatar;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("iso_639_1")
    String iso6391;
    @JsonProperty("iso_3166_1")
    String iso31661;
    @JsonProperty("name")
    String name;
    @JsonProperty("include_adult")
    Boolean includeAdult;
    @JsonProperty("username")
    String username;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Avatar {

        @JsonProperty("gravatar")
        GetAccountDetailsResponse.Avatar.Gravatar gravatar;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Gravatar {

            @JsonProperty("hash")
            String hash;

        }

    }

}
