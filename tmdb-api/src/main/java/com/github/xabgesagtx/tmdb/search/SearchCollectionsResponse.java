
package com.github.xabgesagtx.tmdb.search;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchCollectionsResponse {

    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    List<SearchCollectionsResponse.Result> results;
    @JsonProperty("total_pages")
    Integer totalPages;
    @JsonProperty("total_results")
    Integer totalResults;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("name")
        String name;
        @JsonProperty("poster_path")
        String posterPath;

    }

}
