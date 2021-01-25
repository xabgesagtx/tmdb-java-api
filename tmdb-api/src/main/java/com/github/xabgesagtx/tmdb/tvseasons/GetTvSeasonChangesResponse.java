
package com.github.xabgesagtx.tmdb.tvseasons;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@lombok.Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTvSeasonChangesResponse {

    @JsonProperty("changes")
    List<GetTvSeasonChangesResponse.Change> changes;

    @lombok.Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Change {

        @JsonProperty("key")
        String key;
        @JsonProperty("items")
        List<GetTvSeasonChangesResponse.Change.Item> items;

        @lombok.Value
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
            GetTvSeasonChangesResponse.Change.Item.Value value;
            @JsonProperty("iso_639_1")
            String iso6391;
            @JsonProperty("original_value")
            String originalValue;

            @lombok.Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Value {

                @JsonProperty("episode_id")
                Integer episodeId;
                @JsonProperty("episode_number")
                Integer episodeNumber;

            }

        }

    }

}
