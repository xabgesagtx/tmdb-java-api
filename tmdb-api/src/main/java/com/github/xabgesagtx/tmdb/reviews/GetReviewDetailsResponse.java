
package com.github.xabgesagtx.tmdb.reviews;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetReviewDetailsResponse {

    @JsonProperty("id")
    String id;
    @JsonProperty("author")
    String author;
    @JsonProperty("author_details")
    GetReviewDetailsResponse.AuthorDetail authorDetails;
    @JsonProperty("content")
    String content;
    @JsonProperty("created_at")
    String createdAt;
    @JsonProperty("iso_639_1")
    String iso6391;
    @JsonProperty("media_id")
    Integer mediaId;
    @JsonProperty("media_title")
    String mediaTitle;
    @JsonProperty("media_type")
    String mediaType;
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
