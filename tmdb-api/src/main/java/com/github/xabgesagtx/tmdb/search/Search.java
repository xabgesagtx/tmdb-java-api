
package com.github.xabgesagtx.tmdb.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Search {

    private final RestClient restClient;

    public Search(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Search for companies.</p>
     * 
     */
    public Optional<SearchCompaniesResponse> searchCompanies(Integer page, String query) {
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
     */
    public Optional<SearchCompaniesResponse> searchCompanies(String query) {
        return searchCompanies(null, query);
    }

    /**
     * <p>Search for collections.</p>
     * 
     */
    public Optional<SearchCollectionsResponse> searchCollections(String language, Integer page, String query) {
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
     */
    public Optional<SearchCollectionsResponse> searchCollections(String query) {
        return searchCollections(null, null, query);
    }

    /**
     * <p>Search for keywords.</p>
     * 
     */
    public Optional<SearchKeywordsResponse> searchKeywords(Integer page, String query) {
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
     */
    public Optional<SearchKeywordsResponse> searchKeywords(String query) {
        return searchKeywords(null, query);
    }

    /**
     * <p>Search for movies.</p>
     * 
     */
    public Optional<SearchMoviesResponse> searchMovies(Boolean includeAdult, String language, Integer page, Integer primaryReleaseYear, String query, String region, Integer year) {
        String path = "/search/movie";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("include_adult", includeAdult);
        requestParams.put("primary_release_year", primaryReleaseYear);
        requestParams.put("year", year);
        requestParams.put("query", query);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("region", region);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for movies.</p>
     * 
     */
    public Optional<SearchMoviesResponse> searchMovies(String query) {
        return searchMovies(null, null, null, null, query, null, null);
    }

    /**
     * <p>Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.</p>
     * 
     */
    public Optional<MultiSearchResponse> multiSearch(Boolean includeAdult, String language, Integer page, String query, String region) {
        String path = "/search/multi";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("include_adult", includeAdult);
        requestParams.put("query", query);
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
     */
    public Optional<MultiSearchResponse> multiSearch(String query) {
        return multiSearch(null, null, null, query, null);
    }

    /**
     * <p>Search for people.</p>
     * 
     */
    public Optional<SearchPeopleResponse> searchPeople(Boolean includeAdult, String language, Integer page, String query, String region) {
        String path = "/search/person";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("include_adult", includeAdult);
        requestParams.put("query", query);
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
     */
    public Optional<SearchPeopleResponse> searchPeople(String query) {
        return searchPeople(null, null, null, query, null);
    }

    /**
     * <p>Search for a TV show.</p>
     * 
     */
    public Optional<SearchTvShowsResponse> searchTvShows(Integer firstAirDateYear, Boolean includeAdult, String language, Integer page, String query) {
        String path = "/search/tv";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("include_adult", includeAdult);
        requestParams.put("query", query);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("first_air_date_year", firstAirDateYear);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for a TV show.</p>
     * 
     */
    public Optional<SearchTvShowsResponse> searchTvShows(String query) {
        return searchTvShows(null, null, null, null, query);
    }

}
