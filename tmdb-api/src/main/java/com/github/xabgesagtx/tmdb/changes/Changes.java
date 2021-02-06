
package com.github.xabgesagtx.tmdb.changes;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Changes {

    private final RestClient restClient;

    public Changes(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetMovieChangeListResponse getMovieChangeList() {
        // /movie/changes
        String path = String.format("/movie/changes");
        return null;
    }

    public GetTvChangeListResponse getTvChangeList() {
        // /tv/changes
        String path = String.format("/tv/changes");
        return null;
    }

    public GetPersonChangeListResponse getPersonChangeList() {
        // /person/changes
        String path = String.format("/person/changes");
        return null;
    }

}
