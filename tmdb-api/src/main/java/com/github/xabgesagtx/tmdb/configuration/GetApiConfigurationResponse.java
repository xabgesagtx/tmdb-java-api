
package com.github.xabgesagtx.tmdb.configuration;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetApiConfigurationResponse {

    @JsonProperty("images")
    GetApiConfigurationResponse.Image images;
    @JsonProperty("change_keys")
    List<String> changeKeys;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Image {

        @JsonProperty("base_url")
        String baseUrl;
        @JsonProperty("secure_base_url")
        String secureBaseUrl;
        @JsonProperty("backdrop_sizes")
        List<String> backdropSizes;
        @JsonProperty("logo_sizes")
        List<String> logoSizes;
        @JsonProperty("poster_sizes")
        List<String> posterSizes;
        @JsonProperty("profile_sizes")
        List<String> profileSizes;
        @JsonProperty("still_sizes")
        List<String> stillSizes;

    }

}
