
package com.github.xabgesagtx.tmdb.tvepisodes;

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
public class GetTvEpisodeCreditsResponse {

    @JsonProperty("cast")
    List<GetTvEpisodeCreditsResponse.Cast> cast;
    @JsonProperty("crew")
    List<GetTvEpisodeCreditsResponse.Crew> crew;
    @JsonProperty("guest_stars")
    List<GetTvEpisodeCreditsResponse.GuestStar> guestStars;
    @JsonProperty("id")
    Integer id;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Cast {

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
        @JsonProperty("character")
        String character;
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("order")
        Integer order;

    }

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

        @JsonProperty("character_name")
        String characterName;
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("order")
        Integer order;
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
