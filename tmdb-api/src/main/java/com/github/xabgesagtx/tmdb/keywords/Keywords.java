
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

    public Optional<GetKeywordDetailsResponse> getKeywordDetails(int keywordId) {
        // /keyword/{keyword_id}
        String path = String.format("/keyword/%s", keywordId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMoviesByKeywordResponse> getMoviesByKeyword(int keywordId) {
        // /keyword/{keyword_id}/movies
        String path = String.format("/keyword/%s/movies", keywordId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
