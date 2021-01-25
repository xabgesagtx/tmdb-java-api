
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
public class GetMovieChangesResponse {

    @JsonProperty("changes")
    List<GetMovieChangesResponse.Change> changes;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Change {

        @JsonProperty("key")
        String key;
        @JsonProperty("items")
        List<GetMovieChangesResponse.Change.Item> items;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Item {

            @JsonProperty("id")
            String id;
            @JsonProperty("action")
            String action;
            @JsonProperty("time")
            String time;
            @JsonProperty("iso_639_1")
            String iso6391;
            @JsonProperty("value")
            String value;
            @JsonProperty("original_value")
            String originalValue;

        }

    }

}
