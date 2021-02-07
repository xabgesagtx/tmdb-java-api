
package com.github.xabgesagtx.tmdb.search;

import java.util.Collections;
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
    public Optional<SearchCompaniesResponse> searchCompanies() {
        String path = "/search/company";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for collections.</p>
     * 
     */
    public Optional<SearchCollectionsResponse> searchCollections() {
        String path = "/search/collection";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for keywords.</p>
     * 
     */
    public Optional<SearchKeywordsResponse> searchKeywords() {
        String path = "/search/keyword";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for movies.</p>
     * 
     */
    public Optional<SearchMoviesResponse> searchMovies(Integer primaryReleaseYear, Integer year) {
        String path = "/search/movie";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("primary_release_year", primaryReleaseYear);
        requestParams.put("year", year);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for movies.</p>
     * 
     */
    public Optional<SearchMoviesResponse> searchMovies() {
        return searchMovies(null, null);
    }

    /**
     * <p>Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.</p>
     * 
     */
    public Optional<MultiSearchResponse> multiSearch() {
        String path = "/search/multi";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for people.</p>
     * 
     */
    public Optional<SearchPeopleResponse> searchPeople() {
        String path = "/search/person";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for a TV show.</p>
     * 
     */
    public Optional<SearchTvShowsResponse> searchTvShows(Integer firstAirDateYear) {
        String path = "/search/tv";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("first_air_date_year", firstAirDateYear);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for a TV show.</p>
     * 
     */
    public Optional<SearchTvShowsResponse> searchTvShows() {
        return searchTvShows(null);
    }

}
