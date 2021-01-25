
package com.github.xabgesagtx.tmdb.tvepisodes;

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
public class GetTvEpisodeAccountStatesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("rated")
    Map<String, Object> rated;

}
