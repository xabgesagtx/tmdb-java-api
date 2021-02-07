
package com.github.xabgesagtx.tmdb.account;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Account {

    private final RestClient restClient;

    public Account(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get your account details.</p>
     * 
     */
    public Optional<GetAccountDetailsResponse> getAccountDetails(String sessionId) {
        String path = "/account";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get all of the lists created by an account. Will invlude private lists if you are the owner.</p>
     * 
     */
    public Optional<GetCreatedListsResponse> getCreatedLists(int accountId, String language, Integer page, String sessionId) {
        // /account/{account_id}/lists
        String path = String.format("/account/%s/lists", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get all of the lists created by an account. Will invlude private lists if you are the owner.</p>
     * 
     */
    public Optional<GetCreatedListsResponse> getCreatedLists(int accountId, String sessionId) {
        return getCreatedLists(accountId, null, null, sessionId);
    }

    /**
     * <p>Get the list of your favorite movies.</p>
     * 
     */
    public Optional<GetFavoriteMoviesResponse> getFavoriteMovies(int accountId, String language, Integer page, String sessionId, Account.GetFavoriteMoviesSortByParam sortBy) {
        // /account/{account_id}/favorite/movies
        String path = String.format("/account/%s/favorite/movies", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("sort_by", sortBy);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of your favorite movies.</p>
     * 
     */
    public Optional<GetFavoriteMoviesResponse> getFavoriteMovies(int accountId, String sessionId) {
        return getFavoriteMovies(accountId, null, null, sessionId, null);
    }

    /**
     * <p>Get the list of your favorite TV shows.</p>
     * 
     */
    public Optional<GetFavoriteTvShowsResponse> getFavoriteTvShows(int accountId, String language, Integer page, String sessionId, Account.GetFavoriteTvShowsSortByParam sortBy) {
        // /account/{account_id}/favorite/tv
        String path = String.format("/account/%s/favorite/tv", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("sort_by", sortBy);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of your favorite TV shows.</p>
     * 
     */
    public Optional<GetFavoriteTvShowsResponse> getFavoriteTvShows(int accountId, String sessionId) {
        return getFavoriteTvShows(accountId, null, null, sessionId, null);
    }

    /**
     * <p>This method allows you to mark a movie or TV show as a favorite item.</p>
     * 
     */
    public Optional<MarkAsFavoriteResponse> markAsFavorite(int accountId, MarkAsFavoriteRequest markAsFavoriteRequest, String sessionId) {
        // /account/{account_id}/favorite
        String path = String.format("/account/%s/favorite", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , markAsFavoriteRequest);
    }

    /**
     * <p>Get a list of all the movies you have rated.</p>
     * 
     */
    public Optional<GetRatedMoviesResponse> getRatedMovies(int accountId, String language, Integer page, String sessionId, Account.GetRatedMoviesSortByParam sortBy) {
        // /account/{account_id}/rated/movies
        String path = String.format("/account/%s/rated/movies", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("sort_by", sortBy);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all the movies you have rated.</p>
     * 
     */
    public Optional<GetRatedMoviesResponse> getRatedMovies(int accountId, String sessionId) {
        return getRatedMovies(accountId, null, null, sessionId, null);
    }

    /**
     * <p>Get a list of all the TV shows you have rated.</p>
     * 
     */
    public Optional<GetRatedTvShowsResponse> getRatedTvShows(int accountId, String language, Integer page, String sessionId, Account.GetRatedTvShowsSortByParam sortBy) {
        // /account/{account_id}/rated/tv
        String path = String.format("/account/%s/rated/tv", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("sort_by", sortBy);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all the TV shows you have rated.</p>
     * 
     */
    public Optional<GetRatedTvShowsResponse> getRatedTvShows(int accountId, String sessionId) {
        return getRatedTvShows(accountId, null, null, sessionId, null);
    }

    /**
     * <p>Get a list of all the TV episodes you have rated.</p>
     * 
     */
    public Optional<GetRatedTvEpisodesResponse> getRatedTvEpisodes(String accountId, String language, Integer page, String sessionId, Account.GetRatedTvEpisodesSortByParam sortBy) {
        // /account/{account_id}/rated/tv/episodes
        String path = String.format("/account/%s/rated/tv/episodes", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("sort_by", sortBy);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all the TV episodes you have rated.</p>
     * 
     */
    public Optional<GetRatedTvEpisodesResponse> getRatedTvEpisodes(String accountId, String sessionId) {
        return getRatedTvEpisodes(accountId, null, null, sessionId, null);
    }

    /**
     * <p>Get a list of all the movies you have added to your watchlist.</p>
     * 
     */
    public Optional<GetMovieWatchlistResponse> getMovieWatchlist(int accountId, String language, Integer page, String sessionId, Account.GetMovieWatchlistSortByParam sortBy) {
        // /account/{account_id}/watchlist/movies
        String path = String.format("/account/%s/watchlist/movies", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("sort_by", sortBy);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all the movies you have added to your watchlist.</p>
     * 
     */
    public Optional<GetMovieWatchlistResponse> getMovieWatchlist(int accountId, String sessionId) {
        return getMovieWatchlist(accountId, null, null, sessionId, null);
    }

    /**
     * <p>Get a list of all the TV shows you have added to your watchlist.</p>
     * 
     */
    public Optional<GetTvShowWatchlistResponse> getTvShowWatchlist(int accountId, String language, Integer page, String sessionId, Account.GetTvShowWatchlistSortByParam sortBy) {
        // /account/{account_id}/watchlist/tv
        String path = String.format("/account/%s/watchlist/tv", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("sort_by", sortBy);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all the TV shows you have added to your watchlist.</p>
     * 
     */
    public Optional<GetTvShowWatchlistResponse> getTvShowWatchlist(int accountId, String sessionId) {
        return getTvShowWatchlist(accountId, null, null, sessionId, null);
    }

    /**
     * <p>Add a movie or TV show to your watchlist.</p>
     * 
     */
    public Optional<AddToWatchlistResponse> addToWatchlist(int accountId, AddToWatchlistRequest addToWatchlistRequest, String sessionId) {
        // /account/{account_id}/watchlist
        String path = String.format("/account/%s/watchlist", accountId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , addToWatchlistRequest);
    }

    public enum GetFavoriteMoviesSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetFavoriteMoviesSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetFavoriteTvShowsSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetFavoriteTvShowsSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetMovieWatchlistSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetMovieWatchlistSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetRatedMoviesSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetRatedMoviesSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetRatedTvEpisodesSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetRatedTvEpisodesSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetRatedTvShowsSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetRatedTvShowsSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetTvShowWatchlistSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetTvShowWatchlistSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

}
