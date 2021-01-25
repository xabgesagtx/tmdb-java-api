
package com.github.xabgesagtx.tmdb.lists;

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
public class GetListDetailsResponse {

    @JsonProperty("created_by")
    String createdBy;
    @JsonProperty("description")
    String description;
    @JsonProperty("favorite_count")
    Integer favoriteCount;
    @JsonProperty("id")
    String id;
    @JsonProperty("items")
    List<GetListDetailsResponse.Item> items;
    @JsonProperty("item_count")
    Integer itemCount;
    @JsonProperty("iso_639_1")
    String iso6391;
    @JsonProperty("name")
    String name;
    @JsonProperty("poster_path")
    String posterPath;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Item {

        @JsonProperty("overview")
        String overview;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("original_title")
        String originalTitle;
        @JsonProperty("video")
        Boolean video;
        @JsonProperty("title")
        String title;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("release_date")
        String releaseDate;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("adult")
        Boolean adult;
        @JsonProperty("vote_count")
        Integer voteCount;

    }

}
