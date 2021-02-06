
package com.github.xabgesagtx.tmdb.keywords;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Keywords {

    private final RestClient restClient;

    public Keywords(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetKeywordDetailsResponse getKeywordDetails(Integer keywordId) {
        // /keyword/{keyword_id}
        String path = String.format("/keyword/%s", keywordId);
        return null;
    }

    public GetMoviesByKeywordResponse getMoviesByKeyword(Integer keywordId) {
        // /keyword/{keyword_id}/movies
        String path = String.format("/keyword/%s/movies", keywordId);
        return null;
    }

}
