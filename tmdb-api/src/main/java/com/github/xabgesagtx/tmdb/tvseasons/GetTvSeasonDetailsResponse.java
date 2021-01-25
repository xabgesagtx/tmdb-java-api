
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
public class GetTvSeasonDetailsResponse {

    @JsonProperty("_id")
    String Id;
    @JsonProperty("air_date")
    String airDate;
    @JsonProperty("episodes")
    List<GetTvSeasonDetailsResponse.Episode> episodes;
    @JsonProperty("name")
    String name;
    @JsonProperty("overview")
    String overview;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("poster_path")
    String posterPath;
    @JsonProperty("season_number")
    Integer seasonNumber;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Episode {

        @JsonProperty("air_date")
        String airDate;
        @JsonProperty("episode_number")
        Integer episodeNumber;
        @JsonProperty("crew")
        List<GetTvSeasonDetailsResponse.Episode.Crew> crew;
        @JsonProperty("guest_stars")
        List<GetTvSeasonDetailsResponse.Episode.GuestStar> guestStars;
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
        @JsonProperty("still_path")
        String stillPath;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("vote_count")
        Integer voteCount;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Crew {

            @JsonProperty("department")
            String department;
            @JsonProperty("job")
            String job;
            @JsonProperty("credit_id")
            String creditId;
            @JsonProperty("adult")
            Boolean adult;
            @JsonProperty("gender")
            Integer gender;
            @JsonProperty("id")
            Integer id;
            @JsonProperty("known_for_department")
            String knownForDepartment;
            @JsonProperty("name")
            String name;
            @JsonProperty("original_name")
            String originalName;
            @JsonProperty("popularity")
            Double popularity;
            @JsonProperty("profile_path")
            String profilePath;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class GuestStar {

            @JsonProperty("credit_id")
            String creditId;
            @JsonProperty("order")
            Integer order;
            @JsonProperty("character")
            String character;
            @JsonProperty("adult")
            Boolean adult;
            @JsonProperty("gender")
            Integer gender;
            @JsonProperty("id")
            Integer id;
            @JsonProperty("known_for_department")
            String knownForDepartment;
            @JsonProperty("name")
            String name;
            @JsonProperty("original_name")
            String originalName;
            @JsonProperty("popularity")
            Double popularity;
            @JsonProperty("profile_path")
            String profilePath;

        }

    }

}
