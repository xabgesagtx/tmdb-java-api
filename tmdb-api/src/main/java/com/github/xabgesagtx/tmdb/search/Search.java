
package com.github.xabgesagtx.tmdb.search;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Search {

    private final RestClient restClient;

    public Search(RestClient restClient) {
        this.restClient = restClient;
    }

    public SearchCompaniesResponse searchCompanies() {
        // /search/company
        String path = String.format("/search/company");
        return null;
    }

    public SearchCollectionsResponse searchCollections() {
        // /search/collection
        String path = String.format("/search/collection");
        return null;
    }

    public SearchKeywordsResponse searchKeywords() {
        // /search/keyword
        String path = String.format("/search/keyword");
        return null;
    }

    public SearchMoviesResponse searchMovies() {
        // /search/movie
        String path = String.format("/search/movie");
        return null;
    }

    public MultiSearchResponse multiSearch() {
        // /search/multi
        String path = String.format("/search/multi");
        return null;
    }

    public SearchPeopleResponse searchPeople() {
        // /search/person
        String path = String.format("/search/person");
        return null;
    }

    public SearchTvShowsResponse searchTvShows() {
        // /search/tv
        String path = String.format("/search/tv");
        return null;
    }

}
