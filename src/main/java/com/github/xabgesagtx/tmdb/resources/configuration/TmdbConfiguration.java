package com.github.xabgesagtx.tmdb.resources.configuration;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;


@Jacksonized
@Value
@Builder
public class TmdbConfiguration {

    ImageConfiguration images;
    List<String> changeKeys;

}
