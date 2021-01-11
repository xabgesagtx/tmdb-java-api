package com.github.xabgesagtx.tmdb.resources.configuration;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Jacksonized
@Builder
@Value
public class ImageConfiguration {

    String baseUrl;
    String secureBaseUrl;
    List<String> backdropSizes;
    List<String> logoSizes;
    List<String> posterSizes;
    List<String> profileSizes;
    List<String> stillSizes;

}
