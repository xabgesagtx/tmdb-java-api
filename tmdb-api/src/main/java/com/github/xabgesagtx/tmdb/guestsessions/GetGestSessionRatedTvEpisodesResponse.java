
package com.github.xabgesagtx.tmdb.guestsessions;

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
public class GetGestSessionRatedTvEpisodesResponse {

    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    List<GetGestSessionRatedTvEpisodesResponse.Result> results;
    @JsonProperty("total_pages")
    Integer totalPages;
    @JsonProperty("total_results")
    Integer totalResults;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("air_date")
        String airDate;
        @JsonProperty("episode_number")
        Integer episodeNumber;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("production_code")
        String productionCode;
        @JsonProperty("season_number")
        Integer seasonNumber;
        @JsonProperty("show_id")
        Integer showId;
        @JsonProperty("still_path")
        String stillPath;
        @JsonProperty("vote_average")
        Integer voteAverage;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("rating")
        Integer rating;

    }

}
