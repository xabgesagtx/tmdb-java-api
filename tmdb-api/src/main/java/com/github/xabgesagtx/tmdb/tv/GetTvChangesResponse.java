
package com.github.xabgesagtx.tmdb.tv;

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
public class GetTvChangesResponse {

    @JsonProperty("changes")
    List<GetTvChangesResponse.Change> changes;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Change {

        @JsonProperty("key")
        String key;
        @JsonProperty("items")
        List<GetTvChangesResponse.Change.Item> items;

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

        }

    }

}
