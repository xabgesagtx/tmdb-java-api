
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
public class GetTvSeasonCreditsResponse {

    @JsonProperty("cast")
    List<GetTvSeasonCreditsResponse.Cast> cast;
    @JsonProperty("crew")
    List<GetTvSeasonCreditsResponse.Crew> crew;
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
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("department")
        String department;
        @JsonProperty("job")
        String job;

    }

}
