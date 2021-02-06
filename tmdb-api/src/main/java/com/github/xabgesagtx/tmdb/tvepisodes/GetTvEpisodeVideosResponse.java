
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
public class GetTvEpisodeVideosResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    List<GetTvEpisodeVideosResponse.Result> results;

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
        GetTvEpisodeVideosResponse.Result.Type type;

        public enum Type {

            @JsonProperty("Trailer")
            TRAILER("Trailer"),
            @JsonProperty("Teaser")
            TEASER("Teaser"),
            @JsonProperty("Clip")
            CLIP("Clip"),
            @JsonProperty("Featurette")
            FEATURETTE("Featurette"),
            @JsonProperty("Opening Credits")
            OPENING_CREDITS("Opening Credits"),
            @JsonProperty("Behind the Scenes")
            BEHIND_THE_SCENES("Behind the Scenes"),
            @JsonProperty("Bloopers")
            BLOOPERS("Bloopers"),
            @JsonProperty("Recap")
            RECAP("Recap");
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
