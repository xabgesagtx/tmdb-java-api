
package com.github.xabgesagtx.tmdb.changes;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Changes {

    private final RestClient restClient;

    public Changes(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get a list of all of the movie ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     * @param endDate
     *     Filter the results with a end date.
     * @param page
     *     Specify which page to query.
     * @param startDate
     *     Filter the results with a start date.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetMovieChangeListResponse getMovieChangeList(LocalDate endDate, Integer page, LocalDate startDate) {
        String path = "/movie/changes";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("end_date", endDate);
        requestParams.put("page", page);
        requestParams.put("start_date", startDate);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all of the movie ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetMovieChangeListResponse getMovieChangeList() {
        return getMovieChangeList(null, null, null);
    }

    /**
     * <p>Get a list of all of the TV show ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     * @param endDate
     *     Filter the results with a end date.
     * @param page
     *     Specify which page to query.
     * @param startDate
     *     Filter the results with a start date.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvChangeListResponse getTvChangeList(LocalDate endDate, Integer page, LocalDate startDate) {
        String path = "/tv/changes";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("end_date", endDate);
        requestParams.put("page", page);
        requestParams.put("start_date", startDate);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all of the TV show ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvChangeListResponse getTvChangeList() {
        return getTvChangeList(null, null, null);
    }

    /**
     * <p>Get a list of all of the person ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     * @param endDate
     *     Filter the results with a end date.
     * @param page
     *     Specify which page to query.
     * @param startDate
     *     Filter the results with a start date.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetPersonChangeListResponse getPersonChangeList(LocalDate endDate, Integer page, LocalDate startDate) {
        String path = "/person/changes";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("end_date", endDate);
        requestParams.put("page", page);
        requestParams.put("start_date", startDate);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all of the person ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetPersonChangeListResponse getPersonChangeList() {
        return getPersonChangeList(null, null, null);
    }

}
