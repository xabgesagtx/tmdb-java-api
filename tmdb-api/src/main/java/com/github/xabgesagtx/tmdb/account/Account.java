
package com.github.xabgesagtx.tmdb.account;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Account {

    private final RestClient restClient;

    public Account(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get your account details.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetAccountDetailsResponse getAccountDetails(String sessionId) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetCreatedListsResponse getCreatedLists(int accountId, String sessionId, String language, Integer page) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetCreatedListsResponse getCreatedLists(int accountId, String sessionId) {
        return getCreatedLists(accountId, sessionId, null, null);
    }

    /**
     * <p>Get the list of your favorite movies.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetFavoriteMoviesResponse getFavoriteMovies(int accountId, String sessionId, String language, Integer page, Account.GetFavoriteMoviesSortByParam sortBy) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetFavoriteMoviesResponse getFavoriteMovies(int accountId, String sessionId) {
        return getFavoriteMovies(accountId, sessionId, null, null, null);
    }

    /**
     * <p>Get the list of your favorite TV shows.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetFavoriteTvShowsResponse getFavoriteTvShows(int accountId, String sessionId, String language, Integer page, Account.GetFavoriteTvShowsSortByParam sortBy) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetFavoriteTvShowsResponse getFavoriteTvShows(int accountId, String sessionId) {
        return getFavoriteTvShows(accountId, sessionId, null, null, null);
    }

    /**
     * <p>This method allows you to mark a movie or TV show as a favorite item.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public MarkAsFavoriteResponse markAsFavorite(int accountId, MarkAsFavoriteRequest markAsFavoriteRequest, String sessionId) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetRatedMoviesResponse getRatedMovies(int accountId, String sessionId, String language, Integer page, Account.GetRatedMoviesSortByParam sortBy) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetRatedMoviesResponse getRatedMovies(int accountId, String sessionId) {
        return getRatedMovies(accountId, sessionId, null, null, null);
    }

    /**
     * <p>Get a list of all the TV shows you have rated.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetRatedTvShowsResponse getRatedTvShows(int accountId, String sessionId, String language, Integer page, Account.GetRatedTvShowsSortByParam sortBy) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetRatedTvShowsResponse getRatedTvShows(int accountId, String sessionId) {
        return getRatedTvShows(accountId, sessionId, null, null, null);
    }

    /**
     * <p>Get a list of all the TV episodes you have rated.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetRatedTvEpisodesResponse getRatedTvEpisodes(String accountId, String sessionId, String language, Integer page, Account.GetRatedTvEpisodesSortByParam sortBy) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetRatedTvEpisodesResponse getRatedTvEpisodes(String accountId, String sessionId) {
        return getRatedTvEpisodes(accountId, sessionId, null, null, null);
    }

    /**
     * <p>Get a list of all the movies you have added to your watchlist.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetMovieWatchlistResponse getMovieWatchlist(int accountId, String sessionId, String language, Integer page, Account.GetMovieWatchlistSortByParam sortBy) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetMovieWatchlistResponse getMovieWatchlist(int accountId, String sessionId) {
        return getMovieWatchlist(accountId, sessionId, null, null, null);
    }

    /**
     * <p>Get a list of all the TV shows you have added to your watchlist.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvShowWatchlistResponse getTvShowWatchlist(int accountId, String sessionId, String language, Integer page, Account.GetTvShowWatchlistSortByParam sortBy) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvShowWatchlistResponse getTvShowWatchlist(int accountId, String sessionId) {
        return getTvShowWatchlist(accountId, sessionId, null, null, null);
    }

    /**
     * <p>Add a movie or TV show to your watchlist.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public AddToWatchlistResponse addToWatchlist(int accountId, AddToWatchlistRequest addToWatchlistRequest, String sessionId) {
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
