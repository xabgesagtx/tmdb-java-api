
package com.github.xabgesagtx.tmdb.trending;

import java.util.Collections;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Trending {

    private final RestClient restClient;

    public Trending(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the daily or weekly trending items. The daily trending list tracks items over the period of a day while items have a 24 hour half life. The weekly list tracks items over a 7 day period, with a 7 day half life.</p> <a href="https://developers.themoviedb.org/#valid-media-types">\ud83d\udd17</a> Valid Media Types    <strong>Media Type</strong> <strong>Description</strong>     all Include all movies, TV shows and people in the results as a global trending list.   movie Show the trending movies in the results.   tv Show the trending TV shows in the results.   person Show the trending people in the results.    <a href="https://developers.themoviedb.org/#valid-time-windows">\ud83d\udd17</a> Valid Time Windows    <strong>Time Window</strong> <strong>Description</strong>     day View the trending list for the day.   week View the trending list for the week.
     * 
     */
    public GetTrendingResponse getTrending(Trending.GetTrendingMediaTypeParam mediaType, Trending.GetTrendingTimeWindowParam timeWindow) {
        // /trending/{media_type}/{time_window}
        String path = String.format("/trending/%s/%s", mediaType, timeWindow);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    public enum GetTrendingMediaTypeParam {

        @JsonProperty("all")
        ALL("all"),
        @JsonProperty("movie")
        MOVIE("movie"),
        @JsonProperty("tv")
        TV("tv"),
        @JsonProperty("person")
        PERSON("person");
        private final String value;

        GetTrendingMediaTypeParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetTrendingTimeWindowParam {

        @JsonProperty("day")
        DAY("day"),
        @JsonProperty("week")
        WEEK("week");
        private final String value;

        GetTrendingTimeWindowParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

}
