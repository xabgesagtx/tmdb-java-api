
package com.github.xabgesagtx.tmdb.tvepisodes;

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
public class GetTvEpisodeChangesResponse {

    @JsonProperty("changes")
    List<GetTvEpisodeChangesResponse.Change> changes;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Change {

        @JsonProperty("key")
        String key;
        @JsonProperty("items")
        List<GetTvEpisodeChangesResponse.Change.Item> items;

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
            @JsonProperty("value")
            String value;
            @JsonProperty("iso_639_1")
            String iso6391;

        }

    }

}
