
package com.github.xabgesagtx.tmdb.people;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPersonExternalIdsResponse {

    @JsonProperty("imdb_id")
    String imdbId;
    @JsonProperty("facebook_id")
    String facebookId;
    @JsonProperty("freebase_mid")
    String freebaseMid;
    @JsonProperty("freebase_id")
    String freebaseId;
    @JsonProperty("tvrage_id")
    Integer tvrageId;
    @JsonProperty("twitter_id")
    String twitterId;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("instagram_id")
    String instagramId;

}
