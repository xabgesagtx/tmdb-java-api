
package com.github.xabgesagtx.tmdb.tvseasons;

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
public class GetTvSeasonAccountStatesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    List<GetTvSeasonAccountStatesResponse.Result> results;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("episode_number")
        Integer episodeNumber;
        @JsonProperty("rated")
        GetTvSeasonAccountStatesResponse.Result.Rated rated;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Rated {

            @JsonProperty("value")
            Integer value;

        }

    }

}
