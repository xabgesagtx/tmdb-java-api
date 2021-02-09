
package com.github.xabgesagtx.tmdb.search;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Search {

    private final RestClient restClient;

    public Search(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Search for companies.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchCompaniesResponse searchCompanies(String query, Integer page) {
        String path = "/search/company";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("query", query);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for companies.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchCompaniesResponse searchCompanies(String query) {
        return searchCompanies(query, null);
    }

    /**
     * <p>Search for collections.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchCollectionsResponse searchCollections(String query, String language, Integer page) {
        String path = "/search/collection";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("query", query);
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for collections.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchCollectionsResponse searchCollections(String query) {
        return searchCollections(query, null, null);
    }

    /**
     * <p>Search for keywords.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchKeywordsResponse searchKeywords(String query, Integer page) {
        String path = "/search/keyword";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("query", query);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for keywords.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchKeywordsResponse searchKeywords(String query) {
        return searchKeywords(query, null);
    }

    /**
     * <p>Search for movies.</p>
     * 
     * @param year
     *     year
     * @param primaryReleaseYear
     *     primaryReleaseYear
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @param region
     *     Specify a ISO 3166-1 code to filter release dates. Must be uppercase.
     * @param includeAdult
     *     Choose whether to inlcude adult (pornography) content in the results.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchMoviesResponse searchMovies(String query, Boolean includeAdult, String language, Integer page, Integer primaryReleaseYear, String region, Integer year) {
        String path = "/search/movie";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("query", query);
        requestParams.put("include_adult", includeAdult);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("primary_release_year", primaryReleaseYear);
        requestParams.put("region", region);
        requestParams.put("year", year);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for movies.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchMoviesResponse searchMovies(String query) {
        return searchMovies(query, null, null, null, null, null, null);
    }

    /**
     * <p>Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @param region
     *     Specify a ISO 3166-1 code to filter release dates. Must be uppercase.
     * @param includeAdult
     *     Choose whether to inlcude adult (pornography) content in the results.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public MultiSearchResponse multiSearch(String query, Boolean includeAdult, String language, Integer page, String region) {
        String path = "/search/multi";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("query", query);
        requestParams.put("include_adult", includeAdult);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("region", region);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public MultiSearchResponse multiSearch(String query) {
        return multiSearch(query, null, null, null, null);
    }

    /**
     * <p>Search for people.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @param region
     *     Specify a ISO 3166-1 code to filter release dates. Must be uppercase.
     * @param includeAdult
     *     Choose whether to inlcude adult (pornography) content in the results.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchPeopleResponse searchPeople(String query, Boolean includeAdult, String language, Integer page, String region) {
        String path = "/search/person";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("query", query);
        requestParams.put("include_adult", includeAdult);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("region", region);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for people.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchPeopleResponse searchPeople(String query) {
        return searchPeople(query, null, null, null, null);
    }

    /**
     * <p>Search for a TV show.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @param firstAirDateYear
     *     firstAirDateYear
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @param includeAdult
     *     Choose whether to inlcude adult (pornography) content in the results.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchTvShowsResponse searchTvShows(String query, Integer firstAirDateYear, Boolean includeAdult, String language, Integer page) {
        String path = "/search/tv";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("query", query);
        requestParams.put("first_air_date_year", firstAirDateYear);
        requestParams.put("include_adult", includeAdult);
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for a TV show.</p>
     * 
     * @param query
     *     Pass a text query to search. This value should be URI encoded.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public SearchTvShowsResponse searchTvShows(String query) {
        return searchTvShows(query, null, null, null, null);
    }

}
