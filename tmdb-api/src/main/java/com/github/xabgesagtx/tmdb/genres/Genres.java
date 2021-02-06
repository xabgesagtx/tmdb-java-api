
package com.github.xabgesagtx.tmdb.genres;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Genres {

    private final RestClient restClient;

    public Genres(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the list of official genres for movies.</p>
     * 
     */
    public Optional<GetMovieListResponse> getMovieList() {
        String path = "/genre/movie/list";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of official genres for TV shows.</p>
     * 
     */
    public Optional<GetTvListResponse> getTvList() {
        String path = "/genre/tv/list";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
