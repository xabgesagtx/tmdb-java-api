
package com.github.xabgesagtx.tmdb.account;


public class Account {


    public GetAccountDetailsResponse getAccountDetails() {
        String path = "/account";
        return null;
    }

    public GetCreatedListsResponse getCreatedLists() {
        String path = "/account/{account_id}/lists";
        return null;
    }

    public GetFavoriteMoviesResponse getFavoriteMovies() {
        String path = "/account/{account_id}/favorite/movies";
        return null;
    }

    public GetFavoriteTvShowsResponse getFavoriteTvShows() {
        String path = "/account/{account_id}/favorite/tv";
        return null;
    }

    public MarkAsFavoriteResponse markAsFavorite() {
        String path = "/account/{account_id}/favorite";
        return null;
    }

    public GetRatedMoviesResponse getRatedMovies() {
        String path = "/account/{account_id}/rated/movies";
        return null;
    }

    public GetRatedTvShowsResponse getRatedTvShows() {
        String path = "/account/{account_id}/rated/tv";
        return null;
    }

    public GetRatedTvEpisodesResponse getRatedTvEpisodes() {
        String path = "/account/{account_id}/rated/tv/episodes";
        return null;
    }

    public GetMovieWatchlistResponse getMovieWatchlist() {
        String path = "/account/{account_id}/watchlist/movies";
        return null;
    }

    public GetTvShowWatchlistResponse getTvShowWatchlist() {
        String path = "/account/{account_id}/watchlist/tv";
        return null;
    }

    public AddToWatchlistResponse addToWatchlist() {
        String path = "/account/{account_id}/watchlist";
        return null;
    }

}
