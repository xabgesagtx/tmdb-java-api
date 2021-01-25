
package com.github.xabgesagtx.tmdb.tv;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTvExternalIdsResponse {

    @JsonProperty("imdb_id")
    String imdbId;
    @JsonProperty("freebase_mid")
    String freebaseMid;
    @JsonProperty("freebase_id")
    String freebaseId;
    @JsonProperty("tvdb_id")
    Integer tvdbId;
    @JsonProperty("tvrage_id")
    Integer tvrageId;
    @JsonProperty("facebook_id")
    String facebookId;
    @JsonProperty("instagram_id")
    String instagramId;
    @JsonProperty("twitter_id")
    String twitterId;
    @JsonProperty("id")
    Integer id;

}
