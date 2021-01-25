
package com.github.xabgesagtx.tmdb.movies;

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
public class GetMovieReviewsResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    List<GetMovieReviewsResponse.Result> results;
    @JsonProperty("total_pages")
    Integer totalPages;
    @JsonProperty("total_results")
    Integer totalResults;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("author")
        String author;
        @JsonProperty("author_details")
        GetMovieReviewsResponse.Result.AuthorDetail authorDetails;
        @JsonProperty("content")
        String content;
        @JsonProperty("created_at")
        String createdAt;
        @JsonProperty("id")
        String id;
        @JsonProperty("updated_at")
        String updatedAt;
        @JsonProperty("url")
        String url;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class AuthorDetail {

            @JsonProperty("name")
            String name;
            @JsonProperty("username")
            String username;
            @JsonProperty("avatar_path")
            String avatarPath;
            @JsonProperty("rating")
            Integer rating;

        }

    }

}
