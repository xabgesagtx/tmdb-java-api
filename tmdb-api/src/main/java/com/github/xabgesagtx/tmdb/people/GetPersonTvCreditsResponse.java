
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
public class GetPersonTvCreditsResponse {

    @JsonProperty("cast")
    List<GetPersonTvCreditsResponse.Cast> cast;
    @JsonProperty("crew")
    List<GetPersonTvCreditsResponse.Crew> crew;
    @JsonProperty("id")
    Integer id;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Cast {

        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("original_name")
        String originalName;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("character")
        String character;
        @JsonProperty("name")
        String name;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("episode_count")
        Integer episodeCount;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("first_air_date")
        String firstAirDate;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("origin_country")
        List<String> originCountry;

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
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("name")
        String name;
        @JsonProperty("first_air_date")
        String firstAirDate;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("credit_id")
        String creditId;

    }

}
