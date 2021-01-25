
package com.github.xabgesagtx.tmdb.tv;

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
public class GetTvAlternativeTitlesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    List<GetTvAlternativeTitlesResponse.Result> results;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("title")
        String title;
        @JsonProperty("iso_3166_1")
        String iso31661;
        @JsonProperty("type")
        String type;

    }

}
