
package com.github.xabgesagtx.tmdb.account;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Account {

    private final RestClient restClient;

    public Account(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetAccountDetailsResponse> getAccountDetails() {
        String path = "/account";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetCreatedListsResponse> getCreatedLists(int accountId) {
        // /account/{account_id}/lists
        String path = String.format("/account/%s/lists", accountId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetFavoriteMoviesResponse> getFavoriteMovies(int accountId) {
        // /account/{account_id}/favorite/movies
        String path = String.format("/account/%s/favorite/movies", accountId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetFavoriteTvShowsResponse> getFavoriteTvShows(int accountId) {
        // /account/{account_id}/favorite/tv
        String path = String.format("/account/%s/favorite/tv", accountId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<MarkAsFavoriteResponse> markAsFavorite(int accountId) {
        // /account/{account_id}/favorite
        String path = String.format("/account/%s/favorite", accountId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetRatedMoviesResponse> getRatedMovies(int accountId) {
        // /account/{account_id}/rated/movies
        String path = String.format("/account/%s/rated/movies", accountId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetRatedTvShowsResponse> getRatedTvShows(int accountId) {
        // /account/{account_id}/rated/tv
        String path = String.format("/account/%s/rated/tv", accountId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetRatedTvEpisodesResponse> getRatedTvEpisodes(String accountId) {
        // /account/{account_id}/rated/tv/episodes
        String path = String.format("/account/%s/rated/tv/episodes", accountId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieWatchlistResponse> getMovieWatchlist(int accountId) {
        // /account/{account_id}/watchlist/movies
        String path = String.format("/account/%s/watchlist/movies", accountId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvShowWatchlistResponse> getTvShowWatchlist(int accountId) {
        // /account/{account_id}/watchlist/tv
        String path = String.format("/account/%s/watchlist/tv", accountId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<AddToWatchlistResponse> addToWatchlist(int accountId) {
        // /account/{account_id}/watchlist
        String path = String.format("/account/%s/watchlist", accountId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
