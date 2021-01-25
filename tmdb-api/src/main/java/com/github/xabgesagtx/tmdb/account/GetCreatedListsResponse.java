
package com.github.xabgesagtx.tmdb.account;

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
public class GetCreatedListsResponse {

    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    List<GetCreatedListsResponse.Result> results;
    @JsonProperty("total_pages")
    Integer totalPages;
    @JsonProperty("total_results")
    Integer totalResults;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("description")
        String description;
        @JsonProperty("favorite_count")
        Integer favoriteCount;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("item_count")
        Integer itemCount;
        @JsonProperty("iso_639_1")
        String iso6391;
        @JsonProperty("list_type")
        String listType;
        @JsonProperty("name")
        String name;
        @JsonProperty("poster_path")
        String posterPath;

    }

}
