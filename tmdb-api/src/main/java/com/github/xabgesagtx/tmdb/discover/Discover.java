
package com.github.xabgesagtx.tmdb.discover;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Discover {

    private final RestClient restClient;

    public Discover(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<MovieDiscoverResponse> movieDiscover() {
        String path = "/discover/movie";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<TvDiscoverResponse> tvDiscover() {
        String path = "/discover/tv";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
