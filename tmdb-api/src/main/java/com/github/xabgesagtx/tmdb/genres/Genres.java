
package com.github.xabgesagtx.tmdb.genres;

import java.util.HashMap;
import java.util.Map;
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
    public GetMovieListResponse getMovieList(String language) {
        String path = "/genre/movie/list";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of official genres for movies.</p>
     * 
     */
    public GetMovieListResponse getMovieList() {
        return getMovieList(null);
    }

    /**
     * <p>Get the list of official genres for TV shows.</p>
     * 
     */
    public GetTvListResponse getTvList(String language) {
        String path = "/genre/tv/list";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of official genres for TV shows.</p>
     * 
     */
    public GetTvListResponse getTvList() {
        return getTvList(null);
    }

}
