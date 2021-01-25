
package com.github.xabgesagtx.tmdb.credits;

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
public class GetCreditDetailsResponse {

    @JsonProperty("credit_type")
    String creditType;
    @JsonProperty("department")
    String department;
    @JsonProperty("job")
    String job;
    @JsonProperty("media")
    GetCreditDetailsResponse.Media media;
    @JsonProperty("media_type")
    String mediaType;
    @JsonProperty("id")
    String id;
    @JsonProperty("person")
    GetCreditDetailsResponse.Person person;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Media {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;
        @JsonProperty("original_name")
        String originalName;
        @JsonProperty("character")
        String character;
        @JsonProperty("episodes")
        Map<String, Object> episodes;
        @JsonProperty("seasons")
        List<GetCreditDetailsResponse.Media.Season> seasons;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Season {

            @JsonProperty("air_date")
            String airDate;
            @JsonProperty("poster_path")
            String posterPath;
            @JsonProperty("season_number")
            Integer seasonNumber;

        }

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Person {

        @JsonProperty("name")
        String name;
        @JsonProperty("id")
        Integer id;

    }

}
