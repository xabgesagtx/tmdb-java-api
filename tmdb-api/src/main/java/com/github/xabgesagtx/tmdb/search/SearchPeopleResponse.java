
package com.github.xabgesagtx.tmdb.search;

import java.util.List;
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
public class SearchPeopleResponse {

    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    List<SearchPeopleResponse.Result> results;
    @JsonProperty("total_results")
    Integer totalResults;
    @JsonProperty("total_pages")
    Integer totalPages;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("profile_path")
        String profilePath;
        @JsonProperty("adult")
        Boolean adult;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("known_for")
        Map<String, Object> knownFor;
        @JsonProperty("name")
        String name;
        @JsonProperty("popularity")
        Double popularity;

    }

}
