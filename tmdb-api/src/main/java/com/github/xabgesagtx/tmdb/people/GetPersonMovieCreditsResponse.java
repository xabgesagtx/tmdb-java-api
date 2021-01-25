
package com.github.xabgesagtx.tmdb.people;

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
public class GetPersonMovieCreditsResponse {

    @JsonProperty("cast")
    List<GetPersonMovieCreditsResponse.Cast> cast;
    @JsonProperty("crew")
    List<GetPersonMovieCreditsResponse.Crew> crew;
    @JsonProperty("id")
    Integer id;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Cast {

        @JsonProperty("character")
        String character;
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("release_date")
        String releaseDate;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("video")
        Boolean video;
        @JsonProperty("adult")
        Boolean adult;
        @JsonProperty("vote_average")
        Integer voteAverage;
        @JsonProperty("title")
        String title;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("original_title")
        String originalTitle;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("poster_path")
        String posterPath;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Crew {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("department")
        String department;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("original_title")
        String originalTitle;
        @JsonProperty("job")
        String job;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("video")
        Boolean video;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("title")
        String title;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("adult")
        Boolean adult;
        @JsonProperty("release_date")
        String releaseDate;
        @JsonProperty("credit_id")
        String creditId;

    }

}
