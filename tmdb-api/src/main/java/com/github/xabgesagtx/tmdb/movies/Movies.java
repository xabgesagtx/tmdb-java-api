
package com.github.xabgesagtx.tmdb.movies;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Movies {

    private final RestClient restClient;

    public Movies(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetMovieDetailsResponse> getMovieDetails(int movieId) {
        // /movie/{movie_id}
        String path = String.format("/movie/%s", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieAccountStatesResponse> getMovieAccountStates(int movieId) {
        // /movie/{movie_id}/account_states
        String path = String.format("/movie/%s/account_states", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieAlternativeTitlesResponse> getMovieAlternativeTitles(int movieId) {
        // /movie/{movie_id}/alternative_titles
        String path = String.format("/movie/%s/alternative_titles", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieChangesResponse> getMovieChanges(int movieId) {
        // /movie/{movie_id}/changes
        String path = String.format("/movie/%s/changes", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieCreditsResponse> getMovieCredits(int movieId) {
        // /movie/{movie_id}/credits
        String path = String.format("/movie/%s/credits", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieExternalIdsResponse> getMovieExternalIds(int movieId) {
        // /movie/{movie_id}/external_ids
        String path = String.format("/movie/%s/external_ids", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieImagesResponse> getMovieImages(int movieId) {
        // /movie/{movie_id}/images
        String path = String.format("/movie/%s/images", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieKeywordsResponse> getMovieKeywords(int movieId) {
        // /movie/{movie_id}/keywords
        String path = String.format("/movie/%s/keywords", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieListsResponse> getMovieLists(int movieId) {
        // /movie/{movie_id}/lists
        String path = String.format("/movie/%s/lists", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieRecommendationsResponse> getMovieRecommendations(int movieId) {
        // /movie/{movie_id}/recommendations
        String path = String.format("/movie/%s/recommendations", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieReleaseDatesResponse> getMovieReleaseDates(int movieId) {
        // /movie/{movie_id}/release_dates
        String path = String.format("/movie/%s/release_dates", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieReviewsResponse> getMovieReviews(int movieId) {
        // /movie/{movie_id}/reviews
        String path = String.format("/movie/%s/reviews", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetSimilarMoviesResponse> getSimilarMovies(int movieId) {
        // /movie/{movie_id}/similar
        String path = String.format("/movie/%s/similar", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieTranslationsResponse> getMovieTranslations(int movieId) {
        // /movie/{movie_id}/translations
        String path = String.format("/movie/%s/translations", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieVideosResponse> getMovieVideos(int movieId) {
        // /movie/{movie_id}/videos
        String path = String.format("/movie/%s/videos", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetMovieWatchProvidersResponse> getMovieWatchProviders(int movieId) {
        // /movie/{movie_id}/watch/providers
        String path = String.format("/movie/%s/watch/providers", movieId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<RateMovieResponse> rateMovie(int movieId) {
        // /movie/{movie_id}/rating
        String path = String.format("/movie/%s/rating", movieId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<DeleteMovieRatingResponse> deleteMovieRating(int movieId) {
        // /movie/{movie_id}/rating
        String path = String.format("/movie/%s/rating", movieId);
        return restClient.delete(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetLatestMovieResponse> getLatestMovie() {
        String path = "/movie/latest";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetNowPlayingResponse> getNowPlaying() {
        String path = "/movie/now_playing";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPopularMoviesResponse> getPopularMovies() {
        String path = "/movie/popular";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTopRatedMoviesResponse> getTopRatedMovies() {
        String path = "/movie/top_rated";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetUpcomingResponse> getUpcoming() {
        String path = "/movie/upcoming";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
