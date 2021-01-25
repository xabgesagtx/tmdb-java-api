
package com.github.xabgesagtx.tmdb.tvseasons;

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
public class GetTvSeasonImagesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("posters")
    List<GetTvSeasonImagesResponse.Poster> posters;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Poster {

        @JsonProperty("aspect_ratio")
        Double aspectRatio;
        @JsonProperty("file_path")
        String filePath;
        @JsonProperty("height")
        Integer height;
        @JsonProperty("iso_639_1")
        String iso6391;
        @JsonProperty("vote_average")
        Integer voteAverage;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("width")
        Integer width;

    }

}
