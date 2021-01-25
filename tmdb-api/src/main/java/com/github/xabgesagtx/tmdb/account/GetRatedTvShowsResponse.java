
package com.github.xabgesagtx.tmdb.account;

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
public class GetRatedTvShowsResponse {

    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    List<GetRatedTvShowsResponse.Result> results;
    @JsonProperty("total_pages")
    Integer totalPages;
    @JsonProperty("total_results")
    Integer totalResults;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("first_air_date")
        String firstAirDate;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("rating")
        Integer rating;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("origin_country")
        List<String> originCountry;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("original_name")
        String originalName;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("name")
        String name;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("vote_count")
        Integer voteCount;

    }

}
