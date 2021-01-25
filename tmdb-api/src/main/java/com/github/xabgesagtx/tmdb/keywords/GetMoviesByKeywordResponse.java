
package com.github.xabgesagtx.tmdb.keywords;

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
public class GetMoviesByKeywordResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    List<GetMoviesByKeywordResponse.Result> results;
    @JsonProperty("total_pages")
    Integer totalPages;
    @JsonProperty("total_results")
    Integer totalResults;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("overview")
        String overview;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("original_title")
        String originalTitle;
        @JsonProperty("video")
        Boolean video;
        @JsonProperty("title")
        String title;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("release_date")
        String releaseDate;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("adult")
        Boolean adult;
        @JsonProperty("vote_count")
        Integer voteCount;

    }

}
