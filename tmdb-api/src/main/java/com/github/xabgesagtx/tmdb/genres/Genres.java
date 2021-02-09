
package com.github.xabgesagtx.tmdb.genres;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Genres {

    private final RestClient restClient;

    public Genres(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the list of official genres for movies.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetMovieListResponse getMovieList() {
        return getMovieList(null);
    }

    /**
     * <p>Get the list of official genres for TV shows.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvListResponse getTvList() {
        return getTvList(null);
    }

}
