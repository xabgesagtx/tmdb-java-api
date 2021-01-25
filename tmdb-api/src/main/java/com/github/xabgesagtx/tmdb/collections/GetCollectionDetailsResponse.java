
package com.github.xabgesagtx.tmdb.collections;

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
public class GetCollectionDetailsResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("name")
    String name;
    @JsonProperty("overview")
    String overview;
    @JsonProperty("poster_path")
    String posterPath;
    @JsonProperty("backdrop_path")
    String backdropPath;
    @JsonProperty("parts")
    List<GetCollectionDetailsResponse.Part> parts;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part {

        @JsonProperty("adult")
        Boolean adult;
        @JsonProperty("backdrop_path")
        String backdropPath;
        @JsonProperty("genre_ids")
        List<Integer> genreIds;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("original_language")
        String originalLanguage;
        @JsonProperty("original_title")
        String originalTitle;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("release_date")
        String releaseDate;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("popularity")
        Double popularity;
        @JsonProperty("title")
        String title;
        @JsonProperty("video")
        Boolean video;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("vote_count")
        Integer voteCount;

    }

}
