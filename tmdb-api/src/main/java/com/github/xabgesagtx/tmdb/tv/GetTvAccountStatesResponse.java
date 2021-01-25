
package com.github.xabgesagtx.tmdb.tv;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTvAccountStatesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("favorite")
    Boolean favorite;
    @JsonProperty("rated")
    Map<String, Object> rated;
    @JsonProperty("watchlist")
    Boolean watchlist;

}
