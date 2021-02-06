
package com.github.xabgesagtx.tmdb.discover;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Discover {

    private final RestClient restClient;

    public Discover(RestClient restClient) {
        this.restClient = restClient;
    }

    public MovieDiscoverResponse movieDiscover() {
        // /discover/movie
        String path = String.format("/discover/movie");
        return null;
    }

    public TvDiscoverResponse tvDiscover() {
        // /discover/tv
        String path = String.format("/discover/tv");
        return null;
    }

}
