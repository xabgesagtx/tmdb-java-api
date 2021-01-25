
package com.github.xabgesagtx.tmdb.movies;

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
public class GetMovieReleaseDatesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    List<GetMovieReleaseDatesResponse.Result> results;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("iso_3166_1")
        String iso31661;
        @JsonProperty("release_dates")
        List<GetMovieReleaseDatesResponse.Result.ReleaseDate> releaseDates;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ReleaseDate {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("iso_639_1")
            String iso6391;
            @JsonProperty("release_date")
            String releaseDate;
            @JsonProperty("type")
            Integer type;
            @JsonProperty("note")
            String note;

        }

    }

}
