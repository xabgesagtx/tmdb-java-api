
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
public class GetMovieVideosResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    List<GetMovieVideosResponse.Result> results;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("id")
        String id;
        @JsonProperty("iso_639_1")
        String iso6391;
        @JsonProperty("iso_3166_1")
        String iso31661;
        @JsonProperty("key")
        String key;
        @JsonProperty("name")
        String name;
        @JsonProperty("site")
        String site;
        @JsonProperty("size")
        Integer size;
        @JsonProperty("type")
        GetMovieVideosResponse.Result.Type type;

        public enum Type {

            @JsonProperty("Trailer")
            TRAILER("Trailer"),
            @JsonProperty("Teaser")
            TEASER("Teaser"),
            @JsonProperty("Clip")
            CLIP("Clip"),
            @JsonProperty("Featurette")
            FEATURETTE("Featurette"),
            @JsonProperty("Behind the Scenes")
            BEHIND_THE_SCENES("Behind the Scenes"),
            @JsonProperty("Bloopers")
            BLOOPERS("Bloopers");
            private final String value;

            Type(String value) {
                this.value = value;
            }

            @Override
            public String toString() {
                return value;
            }

        }

    }

}
