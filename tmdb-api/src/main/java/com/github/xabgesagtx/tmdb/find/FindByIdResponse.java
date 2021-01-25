
package com.github.xabgesagtx.tmdb.find;

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
public class FindByIdResponse {

    @JsonProperty("movie_results")
    List<FindByIdResponse.MovieResult> movieResults;
    @JsonProperty("person_results")
    List<FindByIdResponse.PersonResult> personResults;
    @JsonProperty("tv_results")
    List<FindByIdResponse.TvResult> tvResults;
    @JsonProperty("tv_episode_results")
    Map<String, Object> tvEpisodeResults;
    @JsonProperty("tv_season_results")
    Map<String, Object> tvSeasonResults;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MovieResult {

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

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PersonResult {

        @JsonProperty("known_for")
        Map<String, Object> knownFor;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("name")
        String name;
        @JsonProperty("profile_path")
        String profilePath;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("adult")
        Boolean adult;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TvResult {

        @JsonProperty("first_air_date")
        String firstAirDate;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("origin_country")
        List<String> originCountry;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("original_name")
        String originalName;
        @JsonProperty("name")
        String name;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("vote_count")
        Integer voteCount;

    }

}
