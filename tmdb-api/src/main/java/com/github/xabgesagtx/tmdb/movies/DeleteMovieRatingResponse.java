
package com.github.xabgesagtx.tmdb.movies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteMovieRatingResponse {

    @JsonProperty("status_code")
    Integer statusCode;
    @JsonProperty("status_message")
    String statusMessage;

}
