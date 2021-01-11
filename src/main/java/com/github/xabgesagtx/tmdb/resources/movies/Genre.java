package com.github.xabgesagtx.tmdb.resources.movies;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Value
@Builder
public class Genre {

    int id;
    String name;

}
