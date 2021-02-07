
package com.github.xabgesagtx.tmdb.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkAsFavoriteRequest {

    @JsonProperty("media_type")
    MarkAsFavoriteRequest.MediaType mediaType;
    @JsonProperty("media_id")
    Integer mediaId;
    @JsonProperty("favorite")
    Boolean favorite;

    public enum MediaType {

        @JsonProperty("movie")
        MOVIE("movie"),
        @JsonProperty("tv")
        TV("tv");
        private final String value;

        MediaType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

}
