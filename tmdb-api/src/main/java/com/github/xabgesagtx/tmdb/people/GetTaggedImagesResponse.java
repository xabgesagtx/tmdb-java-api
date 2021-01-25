
package com.github.xabgesagtx.tmdb.people;

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
public class GetTaggedImagesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("page")
    Integer page;
    @JsonProperty("results")
    List<GetTaggedImagesResponse.Result> results;
    @JsonProperty("total_pages")
    Integer totalPages;
    @JsonProperty("total_results")
    Integer totalResults;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("aspect_ratio")
        Double aspectRatio;
        @JsonProperty("file_path")
        String filePath;
        @JsonProperty("height")
        Integer height;
        @JsonProperty("id")
        String id;
        @JsonProperty("iso_639_1")
        String iso6391;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("width")
        Integer width;
        @JsonProperty("image_type")
        String imageType;
        @JsonProperty("media")
        Map<String, Object> media;
        @JsonProperty("media_type")
        String mediaType;

    }

}
