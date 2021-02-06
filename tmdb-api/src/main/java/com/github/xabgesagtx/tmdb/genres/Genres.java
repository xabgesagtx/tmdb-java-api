
package com.github.xabgesagtx.tmdb.genres;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Genres {

    private final RestClient restClient;

    public Genres(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetMovieListResponse getMovieList() {
        // /genre/movie/list
        String path = String.format("/genre/movie/list");
        return null;
    }

    public GetTvListResponse getTvList() {
        // /genre/tv/list
        String path = String.format("/genre/tv/list");
        return null;
    }

}
