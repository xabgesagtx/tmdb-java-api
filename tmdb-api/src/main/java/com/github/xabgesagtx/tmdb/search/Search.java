
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

    public Optional<SearchCompaniesResponse> searchCompanies() {
        String path = "/search/company";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<SearchCollectionsResponse> searchCollections() {
        String path = "/search/collection";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<SearchKeywordsResponse> searchKeywords() {
        String path = "/search/keyword";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<SearchMoviesResponse> searchMovies() {
        String path = "/search/movie";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<MultiSearchResponse> multiSearch() {
        String path = "/search/multi";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<SearchPeopleResponse> searchPeople() {
        String path = "/search/person";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<SearchTvShowsResponse> searchTvShows() {
        String path = "/search/tv";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
