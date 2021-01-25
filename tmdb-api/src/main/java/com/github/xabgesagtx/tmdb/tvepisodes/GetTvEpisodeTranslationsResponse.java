
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
public class GetTvEpisodeTranslationsResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("translations")
    List<GetTvEpisodeTranslationsResponse.Translation> translations;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Translation {

        @JsonProperty("iso_3166_1")
        String iso31661;
        @JsonProperty("iso_639_1")
        String iso6391;
        @JsonProperty("name")
        String name;
        @JsonProperty("english_name")
        String englishName;
        @JsonProperty("data")
        GetTvEpisodeTranslationsResponse.Translation.Data data;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Data {

            @JsonProperty("name")
            String name;
            @JsonProperty("overview")
            String overview;

        }

    }

}
