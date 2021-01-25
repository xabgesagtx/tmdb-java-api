
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
public class GetMovieAlternativeTitlesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("titles")
    List<GetMovieAlternativeTitlesResponse.Title> titles;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Title {

        @JsonProperty("iso_3166_1")
        String iso31661;
        @JsonProperty("title")
        String title;
        @JsonProperty("type")
        String type;

    }

}
