
package com.github.xabgesagtx.tmdb.tvepisodes;

import java.time.LocalDate;
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
public class GetTvEpisodeDetailsResponse {

    @JsonProperty("air_date")
    LocalDate airDate;
    @JsonProperty("crew")
    List<GetTvEpisodeDetailsResponse.Crew> crew;
    @JsonProperty("episode_number")
    Integer episodeNumber;
    @JsonProperty("guest_stars")
    List<GetTvEpisodeDetailsResponse.GuestStar> guestStars;
    @JsonProperty("name")
    String name;
    @JsonProperty("overview")
    String overview;
    @JsonProperty("id")
    Integer id;
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

        @JsonProperty("id")
        Integer id;
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("name")
        String name;
        @JsonProperty("department")
        String department;
        @JsonProperty("job")
        String job;
        @JsonProperty("profile_path")
        String profilePath;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GuestStar {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("character")
        String character;
        @JsonProperty("order")
        Integer order;
        @JsonProperty("profile_path")
        String profilePath;

    }

}
