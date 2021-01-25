
package com.github.xabgesagtx.tmdb.search;

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
public class MultiSearchResponse {

    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    Map<String, Object> results;
    @JsonProperty("total_results")
    Integer totalResults;
    @JsonProperty("total_pages")
    Integer totalPages;

}
