
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
public class GetTvSeasonAggregateCreditsResponse {

    @JsonProperty("cast")
    List<GetTvSeasonAggregateCreditsResponse.Cast> cast;
    @JsonProperty("crew")
    List<GetTvSeasonAggregateCreditsResponse.Crew> crew;
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
        @JsonProperty("roles")
        List<GetTvSeasonAggregateCreditsResponse.Cast.Role> roles;
        @JsonProperty("total_episode_count")
        Integer totalEpisodeCount;
        @JsonProperty("order")
        Integer order;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Role {

            @JsonProperty("credit_id")
            String creditId;
            @JsonProperty("character")
            String character;
            @JsonProperty("episode_count")
            Integer episodeCount;

        }

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Crew {

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
        @JsonProperty("jobs")
        List<GetTvSeasonAggregateCreditsResponse.Crew.Job> jobs;
        @JsonProperty("department")
        String department;
        @JsonProperty("total_episode_count")
        Integer totalEpisodeCount;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Job {

            @JsonProperty("credit_id")
            String creditId;
            @JsonProperty("job")
            String job;
            @JsonProperty("episode_count")
            Integer episodeCount;

        }

    }

}
