
package com.github.xabgesagtx.tmdb.movies;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetLatestMovieResponse {

    @JsonProperty("adult")
    Boolean adult;
    @JsonProperty("backdrop_path")
    String backdropPath;
    @JsonProperty("belongs_to_collection")
    Map<String, Object> belongsToCollection;
    @JsonProperty("budget")
    Integer budget;
    @JsonProperty("genres")
    List<GetLatestMovieResponse.Genre> genres;
    @JsonProperty("homepage")
    String homepage;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("imdb_id")
    String imdbId;
    @JsonProperty("original_language")
    String originalLanguage;
    @JsonProperty("original_title")
    String originalTitle;
    @JsonProperty("overview")
    String overview;
    @JsonProperty("popularity")
    Integer popularity;
    @JsonProperty("poster_path")
    String posterPath;
    @JsonProperty("production_companies")
    Map<String, Object> productionCompanies;
    @JsonProperty("production_countries")
    Map<String, Object> productionCountries;
    @JsonProperty("release_date")
    String releaseDate;
    @JsonProperty("revenue")
    Integer revenue;
    @JsonProperty("runtime")
    Integer runtime;
    @JsonProperty("spoken_languages")
    Map<String, Object> spokenLanguages;
    @JsonProperty("status")
    String status;
    @JsonProperty("tagline")
    String tagline;
    @JsonProperty("title")
    String title;
    @JsonProperty("video")
    Boolean video;
    @JsonProperty("vote_average")
    Integer voteAverage;
    @JsonProperty("vote_count")
    Integer voteCount;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Genre {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;

    }

}
