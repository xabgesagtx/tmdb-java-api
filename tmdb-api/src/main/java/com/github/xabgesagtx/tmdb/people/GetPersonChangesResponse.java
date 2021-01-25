
package com.github.xabgesagtx.tmdb.people;

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
public class GetPersonChangesResponse {

    @JsonProperty("changes")
    List<GetPersonChangesResponse.Change> changes;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Change {

        @JsonProperty("key")
        String key;
        @JsonProperty("items")
        List<GetPersonChangesResponse.Change.Item> items;

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
            @JsonProperty("original_value")
            GetPersonChangesResponse.Change.Item.OriginalValue originalValue;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class OriginalValue {

                @JsonProperty("profile")
                GetPersonChangesResponse.Change.Item.OriginalValue.Profile profile;

                @Value
                @Builder
                @Jacksonized
                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class Profile {

                    @JsonProperty("file_path")
                    String filePath;

                }

            }

        }

    }

}
