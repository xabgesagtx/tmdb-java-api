
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
public class GetMovieKeywordsResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("keywords")
    List<GetMovieKeywordsResponse.Keyword> keywords;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Keyword {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;

    }

}
