package com.github.xabgesagtx.tmdb.resources.movies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Value
public class ProductionCountry {

    @JsonProperty("iso_3166_1")
    String iso3166_1;
    String name;

}
