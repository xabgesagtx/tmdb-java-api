
package com.github.xabgesagtx.tmdb.genres;

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
public class GetTvListResponse {

    @JsonProperty("genres")
    List<GetTvListResponse.Genre> genres;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Genre {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;

    }

}
