
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
public class GetMovieExternalIdsResponse {

    @JsonProperty("imdb_id")
    String imdbId;
    @JsonProperty("facebook_id")
    String facebookId;
    @JsonProperty("instagram_id")
    String instagramId;
    @JsonProperty("twitter_id")
    String twitterId;
    @JsonProperty("id")
    Integer id;

}
