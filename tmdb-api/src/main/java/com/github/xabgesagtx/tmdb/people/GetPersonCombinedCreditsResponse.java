
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
public class GetPersonCombinedCreditsResponse {

    @JsonProperty("cast")
    List<GetPersonCombinedCreditsResponse.Cast> cast;
    @JsonProperty("crew")
    List<GetPersonCombinedCreditsResponse.Crew> crew;
    @JsonProperty("id")
    Integer id;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Cast {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("episode_count")
        Integer episodeCount;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("origin_country")
        List<String> originCountry;
        @JsonProperty("original_name")
        String originalName;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("name")
        String name;
        @JsonProperty("media_type")
        String mediaType;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("first_air_date")
        String firstAirDate;
        @JsonProperty("vote_average")
        Integer voteAverage;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("character")
        String character;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("original_title")
        String originalTitle;
        @JsonProperty("video")
        Boolean video;
        @JsonProperty("release_date")
        String releaseDate;
        @JsonProperty("title")
        String title;
        @JsonProperty("adult")
        Boolean adult;

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
        @JsonProperty("episode_count")
        Integer episodeCount;
        @JsonProperty("job")
        String job;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("origin_country")
        List<String> originCountry;
        @JsonProperty("original_name")
        String originalName;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("name")
        String name;
        @JsonProperty("media_type")
        String mediaType;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("first_air_date")
        String firstAirDate;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("original_title")
        String originalTitle;
        @JsonProperty("video")
        Boolean video;
        @JsonProperty("title")
        String title;
        @JsonProperty("adult")
        Boolean adult;
        @JsonProperty("release_date")
        String releaseDate;

    }

}
