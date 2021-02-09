
package com.github.xabgesagtx.tmdb.keywords;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Keywords {

    private final RestClient restClient;

    public Keywords(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * 
     * 
     * @param keywordId
     *     keywordId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetKeywordDetailsResponse> getKeywordDetails(int keywordId) {
        // /keyword/{keyword_id}
        String path = String.format("/keyword/%s", keywordId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the movies that belong to a keyword.</p> 
     * <p>We <strong>highly recommend</strong> using <a href="https://developers.themoviedb.org/3/discover/movie-discover">movie discover</a> instead of this method as it is much more flexible.</p>
     * 
     * @param keywordId
     *     keywordId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param includeAdult
     *     Choose whether to inlcude adult (pornography) content in the results.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetMoviesByKeywordResponse> getMoviesByKeyword(int keywordId, Boolean includeAdult, String language) {
        // /keyword/{keyword_id}/movies
        String path = String.format("/keyword/%s/movies", keywordId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("include_adult", includeAdult);
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the movies that belong to a keyword.</p> 
     * <p>We <strong>highly recommend</strong> using <a href="https://developers.themoviedb.org/3/discover/movie-discover">movie discover</a> instead of this method as it is much more flexible.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetMoviesByKeywordResponse> getMoviesByKeyword(int keywordId) {
        return getMoviesByKeyword(keywordId, null, null);
    }

}
