package com.github.xabgesagtx.tmdb.resources.movies;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Value
@Builder
public class ProductionCompany {

    int id;
    String name;
    String logoPath;
    String originCountry;

}
