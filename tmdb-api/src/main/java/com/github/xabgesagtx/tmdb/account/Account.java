
package com.github.xabgesagtx.tmdb.account;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Account {

    private final RestClient restClient;

    public Account(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetAccountDetailsResponse getAccountDetails() {
        // /account
        String path = String.format("/account");
        return null;
    }

    public GetCreatedListsResponse getCreatedLists(Integer accountId) {
        // /account/{account_id}/lists
        String path = String.format("/account/%s/lists", accountId);
        return null;
    }

    public GetFavoriteMoviesResponse getFavoriteMovies(Integer accountId) {
        // /account/{account_id}/favorite/movies
        String path = String.format("/account/%s/favorite/movies", accountId);
        return null;
    }

    public GetFavoriteTvShowsResponse getFavoriteTvShows(Integer accountId) {
        // /account/{account_id}/favorite/tv
        String path = String.format("/account/%s/favorite/tv", accountId);
        return null;
    }

    public MarkAsFavoriteResponse markAsFavorite(Integer accountId) {
        // /account/{account_id}/favorite
        String path = String.format("/account/%s/favorite", accountId);
        return null;
    }

    public GetRatedMoviesResponse getRatedMovies(Integer accountId) {
        // /account/{account_id}/rated/movies
        String path = String.format("/account/%s/rated/movies", accountId);
        return null;
    }

    public GetRatedTvShowsResponse getRatedTvShows(Integer accountId) {
        // /account/{account_id}/rated/tv
        String path = String.format("/account/%s/rated/tv", accountId);
        return null;
    }

    public GetRatedTvEpisodesResponse getRatedTvEpisodes(String accountId) {
        // /account/{account_id}/rated/tv/episodes
        String path = String.format("/account/%s/rated/tv/episodes", accountId);
        return null;
    }

    public GetMovieWatchlistResponse getMovieWatchlist(Integer accountId) {
        // /account/{account_id}/watchlist/movies
        String path = String.format("/account/%s/watchlist/movies", accountId);
        return null;
    }

    public GetTvShowWatchlistResponse getTvShowWatchlist(Integer accountId) {
        // /account/{account_id}/watchlist/tv
        String path = String.format("/account/%s/watchlist/tv", accountId);
        return null;
    }

    public AddToWatchlistResponse addToWatchlist(Integer accountId) {
        // /account/{account_id}/watchlist
        String path = String.format("/account/%s/watchlist", accountId);
        return null;
    }

}
