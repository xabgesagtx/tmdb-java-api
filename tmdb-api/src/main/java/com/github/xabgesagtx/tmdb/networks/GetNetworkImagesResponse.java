
package com.github.xabgesagtx.tmdb.networks;

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
public class GetNetworkImagesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("logos")
    List<GetNetworkImagesResponse.Logo> logos;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Logo {

        @JsonProperty("aspect_ratio")
        Double aspectRatio;
        @JsonProperty("file_path")
        String filePath;
        @JsonProperty("height")
        Integer height;
        @JsonProperty("id")
        String id;
        @JsonProperty("file_type")
        GetNetworkImagesResponse.Logo.FileType fileType;
        @JsonProperty("vote_average")
        Integer voteAverage;
        @JsonProperty("vote_count")
        Integer voteCount;
        @JsonProperty("width")
        Integer width;

        public enum FileType {

            @JsonProperty(".svg")
            .SVG,
            @JsonProperty(".png")
            .PNG;

        }

    }

}
