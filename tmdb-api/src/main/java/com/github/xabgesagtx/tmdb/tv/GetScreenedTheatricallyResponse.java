
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
public class GetScreenedTheatricallyResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    List<GetScreenedTheatricallyResponse.Result> results;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("episode_number")
        Integer episodeNumber;
        @JsonProperty("season_number")
        Integer seasonNumber;

    }

}
