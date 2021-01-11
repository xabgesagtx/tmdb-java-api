package com.github.xabgesagtx.tmdb.resources.movies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Value
public class SpokenLanguage {

    @JsonProperty("iso_639_1")
    String iso639_1;
    String name;
    String englishName;

}
