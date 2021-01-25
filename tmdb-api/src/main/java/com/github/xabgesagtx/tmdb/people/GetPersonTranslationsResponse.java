
package com.github.xabgesagtx.tmdb.people;

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
public class GetPersonTranslationsResponse {

    @JsonProperty("translations")
    List<GetPersonTranslationsResponse.Translation> translations;
    @JsonProperty("id")
    Integer id;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Translation {

        @JsonProperty("iso_639_1")
        String iso6391;
        @JsonProperty("iso_3166_1")
        String iso31661;
        @JsonProperty("name")
        String name;
        @JsonProperty("data")
        GetPersonTranslationsResponse.Translation.Data data;
        @JsonProperty("english_name")
        String englishName;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Data {

            @JsonProperty("biography")
            String biography;

        }

    }

}
