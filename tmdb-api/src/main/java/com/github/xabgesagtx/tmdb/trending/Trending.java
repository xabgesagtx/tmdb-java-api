
package com.github.xabgesagtx.tmdb.trending;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Trending {

    private final RestClient restClient;

    public Trending(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetTrendingResponse getTrending(String mediaType, String timeWindow) {
        // /trending/{media_type}/{time_window}
        String path = String.format("/trending/%s/%s", mediaType, timeWindow);
        return null;
    }

}
