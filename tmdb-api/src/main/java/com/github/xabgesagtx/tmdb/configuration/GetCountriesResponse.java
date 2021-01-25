
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
public class GetCountriesResponse {

    @JsonProperty("iso_3166_1")
    String iso31661;
    @JsonProperty("english_name")
    String englishName;

}
