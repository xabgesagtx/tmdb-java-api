
package com.github.xabgesagtx.tmdb.configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetLanguagesResponse {

    @JsonProperty("iso_639_1")
    String iso6391;
    @JsonProperty("english_name")
    String englishName;
    @JsonProperty("name")
    String name;

}
