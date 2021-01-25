
package com.github.xabgesagtx.tmdb.movies;

import java.time.LocalDate;
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
public class GetMovieDetailsResponse {

    @JsonProperty("adult")
    Boolean adult;
    @JsonProperty("backdrop_path")
    String backdropPath;
    @JsonProperty("belongs_to_collection")
    Map<String, Object> belongsToCollection;
    @JsonProperty("budget")
    Integer budget;
    @JsonProperty("genres")
    List<GetMovieDetailsResponse.Genre> genres;
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
    Double popularity;
    @JsonProperty("poster_path")
    String posterPath;
    @JsonProperty("production_companies")
    List<GetMovieDetailsResponse.ProductionCompany> productionCompanies;
    @JsonProperty("production_countries")
    List<GetMovieDetailsResponse.ProductionCountry> productionCountries;
    @JsonProperty("release_date")
    LocalDate releaseDate;
    @JsonProperty("revenue")
    Integer revenue;
    @JsonProperty("runtime")
    Integer runtime;
    @JsonProperty("spoken_languages")
    List<GetMovieDetailsResponse.SpokenLanguage> spokenLanguages;
    @JsonProperty("status")
    GetMovieDetailsResponse.Status status;
    @JsonProperty("tagline")
    String tagline;
    @JsonProperty("title")
    String title;
    @JsonProperty("video")
    Boolean video;
    @JsonProperty("vote_average")
    Double voteAverage;
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

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductionCompany {

        @JsonProperty("name")
        String name;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("logo_path")
        String logoPath;
        @JsonProperty("origin_country")
        String originCountry;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductionCountry {

        @JsonProperty("iso_3166_1")
        String iso31661;
        @JsonProperty("name")
        String name;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SpokenLanguage {

        @JsonProperty("iso_639_1")
        String iso6391;
        @JsonProperty("name")
        String name;

    }

    public enum Status {

        @JsonProperty("Rumored")
        RUMORED,
        @JsonProperty("Planned")
        PLANNED,
        @JsonProperty("In Production")
        IN_PRODUCTION,
        @JsonProperty("Post Production")
        POST_PRODUCTION,
        @JsonProperty("Released")
        RELEASED,
        @JsonProperty("Canceled")
        CANCELED;

    }

}
