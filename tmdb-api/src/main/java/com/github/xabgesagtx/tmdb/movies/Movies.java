
package com.github.xabgesagtx.tmdb.movies;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Movies {

    private final RestClient restClient;

    public Movies(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetMovieDetailsResponse getMovieDetails(Integer movieId) {
        // /movie/{movie_id}
        String path = String.format("/movie/%s", movieId);
        return null;
    }

    public GetMovieAccountStatesResponse getMovieAccountStates(Integer movieId) {
        // /movie/{movie_id}/account_states
        String path = String.format("/movie/%s/account_states", movieId);
        return null;
    }

    public GetMovieAlternativeTitlesResponse getMovieAlternativeTitles(Integer movieId) {
        // /movie/{movie_id}/alternative_titles
        String path = String.format("/movie/%s/alternative_titles", movieId);
        return null;
    }

    public GetMovieChangesResponse getMovieChanges(Integer movieId) {
        // /movie/{movie_id}/changes
        String path = String.format("/movie/%s/changes", movieId);
        return null;
    }

    public GetMovieCreditsResponse getMovieCredits(Integer movieId) {
        // /movie/{movie_id}/credits
        String path = String.format("/movie/%s/credits", movieId);
        return null;
    }

    public GetMovieExternalIdsResponse getMovieExternalIds(Integer movieId) {
        // /movie/{movie_id}/external_ids
        String path = String.format("/movie/%s/external_ids", movieId);
        return null;
    }

    public GetMovieImagesResponse getMovieImages(Integer movieId) {
        // /movie/{movie_id}/images
        String path = String.format("/movie/%s/images", movieId);
        return null;
    }

    public GetMovieKeywordsResponse getMovieKeywords(Integer movieId) {
        // /movie/{movie_id}/keywords
        String path = String.format("/movie/%s/keywords", movieId);
        return null;
    }

    public GetMovieListsResponse getMovieLists(Integer movieId) {
        // /movie/{movie_id}/lists
        String path = String.format("/movie/%s/lists", movieId);
        return null;
    }

    public GetMovieRecommendationsResponse getMovieRecommendations(Integer movieId) {
        // /movie/{movie_id}/recommendations
        String path = String.format("/movie/%s/recommendations", movieId);
        return null;
    }

    public GetMovieReleaseDatesResponse getMovieReleaseDates(Integer movieId) {
        // /movie/{movie_id}/release_dates
        String path = String.format("/movie/%s/release_dates", movieId);
        return null;
    }

    public GetMovieReviewsResponse getMovieReviews(Integer movieId) {
        // /movie/{movie_id}/reviews
        String path = String.format("/movie/%s/reviews", movieId);
        return null;
    }

    public GetSimilarMoviesResponse getSimilarMovies(Integer movieId) {
        // /movie/{movie_id}/similar
        String path = String.format("/movie/%s/similar", movieId);
        return null;
    }

    public GetMovieTranslationsResponse getMovieTranslations(Integer movieId) {
        // /movie/{movie_id}/translations
        String path = String.format("/movie/%s/translations", movieId);
        return null;
    }

    public GetMovieVideosResponse getMovieVideos(Integer movieId) {
        // /movie/{movie_id}/videos
        String path = String.format("/movie/%s/videos", movieId);
        return null;
    }

    public GetMovieWatchProvidersResponse getMovieWatchProviders(Integer movieId) {
        // /movie/{movie_id}/watch/providers
        String path = String.format("/movie/%s/watch/providers", movieId);
        return null;
    }

    public RateMovieResponse rateMovie(Integer movieId) {
        // /movie/{movie_id}/rating
        String path = String.format("/movie/%s/rating", movieId);
        return null;
    }

    public DeleteMovieRatingResponse deleteMovieRating(Integer movieId) {
        // /movie/{movie_id}/rating
        String path = String.format("/movie/%s/rating", movieId);
        return null;
    }

    public GetLatestMovieResponse getLatestMovie() {
        // /movie/latest
        String path = String.format("/movie/latest");
        return null;
    }

    public GetNowPlayingResponse getNowPlaying() {
        // /movie/now_playing
        String path = String.format("/movie/now_playing");
        return null;
    }

    public GetPopularMoviesResponse getPopularMovies() {
        // /movie/popular
        String path = String.format("/movie/popular");
        return null;
    }

    public GetTopRatedMoviesResponse getTopRatedMovies() {
        // /movie/top_rated
        String path = String.format("/movie/top_rated");
        return null;
    }

    public GetUpcomingResponse getUpcoming() {
        // /movie/upcoming
        String path = String.format("/movie/upcoming");
        return null;
    }

}
