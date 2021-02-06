
package com.github.xabgesagtx.tmdb.keywords;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Keywords {

    private final RestClient restClient;

    public Keywords(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * 
     * 
     */
    public Optional<GetKeywordDetailsResponse> getKeywordDetails(int keywordId) {
        // /keyword/{keyword_id}
        String path = String.format("/keyword/%s", keywordId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the movies that belong to a keyword.</p> 
     * <p>We <strong>highly recommend</strong> using <a href="https://developers.themoviedb.org/3/discover/movie-discover">movie discover</a> instead of this method as it is much more flexible.</p>
     * 
     */
    public Optional<GetMoviesByKeywordResponse> getMoviesByKeyword(int keywordId) {
        // /keyword/{keyword_id}/movies
        String path = String.format("/keyword/%s/movies", keywordId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
