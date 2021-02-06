
package com.github.xabgesagtx.tmdb.search;

import java.util.Collections;
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
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for collections.</p>
     * 
     */
    public Optional<SearchCollectionsResponse> searchCollections() {
        String path = "/search/collection";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for keywords.</p>
     * 
     */
    public Optional<SearchKeywordsResponse> searchKeywords() {
        String path = "/search/keyword";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for movies.</p>
     * 
     */
    public Optional<SearchMoviesResponse> searchMovies() {
        String path = "/search/movie";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.</p>
     * 
     */
    public Optional<MultiSearchResponse> multiSearch() {
        String path = "/search/multi";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for people.</p>
     * 
     */
    public Optional<SearchPeopleResponse> searchPeople() {
        String path = "/search/person";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Search for a TV show.</p>
     * 
     */
    public Optional<SearchTvShowsResponse> searchTvShows() {
        String path = "/search/tv";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
