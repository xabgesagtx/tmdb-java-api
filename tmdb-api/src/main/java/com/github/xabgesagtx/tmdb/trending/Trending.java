
package com.github.xabgesagtx.tmdb.trending;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Trending {

    private final RestClient restClient;

    public Trending(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetTrendingResponse> getTrending(Trending.MediaTypeParam mediaType, Trending.TimeWindowParam timeWindow) {
        // /trending/{media_type}/{time_window}
        String path = String.format("/trending/%s/%s", mediaType, timeWindow);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public enum MediaTypeParam {

        @JsonProperty("all")
        ALL("all"),
        @JsonProperty("movie")
        MOVIE("movie"),
        @JsonProperty("tv")
        TV("tv"),
        @JsonProperty("person")
        PERSON("person");
        private final String value;

        MediaTypeParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum TimeWindowParam {

        @JsonProperty("day")
        DAY("day"),
        @JsonProperty("week")
        WEEK("week");
        private final String value;

        TimeWindowParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

}
