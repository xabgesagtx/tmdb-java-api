
package com.github.xabgesagtx.tmdb.movies;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Movies {

    private final RestClient restClient;

    public Movies(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the primary information about a movie.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     November 20, 2020 A <code>watch/providers</code> method has been added to show what providers (eg. streaming) are available and where.
     * 
     */
    public Optional<GetMovieDetailsResponse> getMovieDetails(int movieId, String appendToResponse, String language) {
        // /movie/{movie_id}
        String path = String.format("/movie/%s", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("append_to_response", appendToResponse);
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the primary information about a movie.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     November 20, 2020 A <code>watch/providers</code> method has been added to show what providers (eg. streaming) are available and where.
     * 
     */
    public Optional<GetMovieDetailsResponse> getMovieDetails(int movieId) {
        return getMovieDetails(movieId, null, null);
    }

    /**
     * <p>Grab the following account states for a session:</p> 
     * <ul> 
     *  <li>Movie rating</li> 
     *  <li>If it belongs to your watchlist</li> 
     *  <li>If it belongs to your favourite list</li> 
     * </ul>
     * 
     */
    public Optional<GetMovieAccountStatesResponse> getMovieAccountStates(int movieId, String sessionId, String guestSessionId) {
        // /movie/{movie_id}/account_states
        String path = String.format("/movie/%s/account_states", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Grab the following account states for a session:</p> 
     * <ul> 
     *  <li>Movie rating</li> 
     *  <li>If it belongs to your watchlist</li> 
     *  <li>If it belongs to your favourite list</li> 
     * </ul>
     * 
     */
    public Optional<GetMovieAccountStatesResponse> getMovieAccountStates(int movieId, String sessionId) {
        return getMovieAccountStates(movieId, sessionId, null);
    }

    /**
     * <p>Get all of the alternative titles for a movie.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 16, 2018 Added the <code>type</code> field.
     * 
     */
    public Optional<GetMovieAlternativeTitlesResponse> getMovieAlternativeTitles(int movieId, String country) {
        // /movie/{movie_id}/alternative_titles
        String path = String.format("/movie/%s/alternative_titles", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("country", country);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get all of the alternative titles for a movie.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 16, 2018 Added the <code>type</code> field.
     * 
     */
    public Optional<GetMovieAlternativeTitlesResponse> getMovieAlternativeTitles(int movieId) {
        return getMovieAlternativeTitles(movieId, null);
    }

    /**
     * <p>Get the changes for a movie. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     */
    public GetMovieChangesResponse getMovieChanges(int movieId, LocalDate endDate, Integer page, LocalDate startDate) {
        // /movie/{movie_id}/changes
        String path = String.format("/movie/%s/changes", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("end_date", endDate);
        requestParams.put("page", page);
        requestParams.put("start_date", startDate);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the changes for a movie. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     */
    public GetMovieChangesResponse getMovieChanges(int movieId) {
        return getMovieChanges(movieId, null, null, null);
    }

    /**
     * <p>Get the cast and crew for a movie.</p>
     * 
     */
    public Optional<GetMovieCreditsResponse> getMovieCredits(int movieId, String language) {
        // /movie/{movie_id}/credits
        String path = String.format("/movie/%s/credits", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the cast and crew for a movie.</p>
     * 
     */
    public Optional<GetMovieCreditsResponse> getMovieCredits(int movieId) {
        return getMovieCredits(movieId, null);
    }

    /**
     * <p>Get the external ids for a movie. We currently support the following external sources.</p>    <strong>Media Databases</strong> <strong>Social IDs</strong>     IMDb ID Facebook    Instagram    Twitter
     * 
     */
    public Optional<GetMovieExternalIdsResponse> getMovieExternalIds(int movieId) {
        // /movie/{movie_id}/external_ids
        String path = String.format("/movie/%s/external_ids", movieId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that belong to a movie.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     */
    public Optional<GetMovieImagesResponse> getMovieImages(int movieId, String includeImageLanguage, String language) {
        // /movie/{movie_id}/images
        String path = String.format("/movie/%s/images", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("include_image_language", includeImageLanguage);
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that belong to a movie.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     */
    public Optional<GetMovieImagesResponse> getMovieImages(int movieId) {
        return getMovieImages(movieId, null, null);
    }

    /**
     * <p>Get the keywords that have been added to a movie.</p>
     * 
     */
    public Optional<GetMovieKeywordsResponse> getMovieKeywords(int movieId) {
        // /movie/{movie_id}/keywords
        String path = String.format("/movie/%s/keywords", movieId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of lists that this movie belongs to.</p>
     * 
     */
    public GetMovieListsResponse getMovieLists(int movieId, String language, Integer page) {
        // /movie/{movie_id}/lists
        String path = String.format("/movie/%s/lists", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of lists that this movie belongs to.</p>
     * 
     */
    public GetMovieListsResponse getMovieLists(int movieId) {
        return getMovieLists(movieId, null, null);
    }

    /**
     * <p>Get a list of recommended movies for a movie.</p>
     * 
     */
    public GetMovieRecommendationsResponse getMovieRecommendations(int movieId, String language, Integer page) {
        // /movie/{movie_id}/recommendations
        String path = String.format("/movie/%s/recommendations", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of recommended movies for a movie.</p>
     * 
     */
    public GetMovieRecommendationsResponse getMovieRecommendations(int movieId) {
        return getMovieRecommendations(movieId, null, null);
    }

    /**
     * <p>Get the release date along with the certification for a movie.</p> 
     * <p>Release dates support different types:</p> 
     * <ol> 
     *  <li>Premiere</li> 
     *  <li>Theatrical (limited)</li> 
     *  <li>Theatrical</li> 
     *  <li>Digital</li> 
     *  <li>Physical</li> 
     *  <li>TV</li> 
     * </ol>
     * 
     */
    public Optional<GetMovieReleaseDatesResponse> getMovieReleaseDates(int movieId) {
        // /movie/{movie_id}/release_dates
        String path = String.format("/movie/%s/release_dates", movieId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the user reviews for a movie.</p>
     * 
     */
    public GetMovieReviewsResponse getMovieReviews(int movieId, String language, Integer page) {
        // /movie/{movie_id}/reviews
        String path = String.format("/movie/%s/reviews", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the user reviews for a movie.</p>
     * 
     */
    public GetMovieReviewsResponse getMovieReviews(int movieId) {
        return getMovieReviews(movieId, null, null);
    }

    /**
     * <p>Get a list of similar movies. This is <strong>not</strong> the same as the "Recommendation" system you see on the website.</p> 
     * <p>These items are assembled by looking at keywords and genres.</p>
     * 
     */
    public GetSimilarMoviesResponse getSimilarMovies(int movieId, String language, Integer page) {
        // /movie/{movie_id}/similar
        String path = String.format("/movie/%s/similar", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of similar movies. This is <strong>not</strong> the same as the "Recommendation" system you see on the website.</p> 
     * <p>These items are assembled by looking at keywords and genres.</p>
     * 
     */
    public GetSimilarMoviesResponse getSimilarMovies(int movieId) {
        return getSimilarMovies(movieId, null, null);
    }

    /**
     * <p>Get a list of translations that have been created for a movie.</p>
     * 
     */
    public Optional<GetMovieTranslationsResponse> getMovieTranslations(int movieId) {
        // /movie/{movie_id}/translations
        String path = String.format("/movie/%s/translations", movieId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the videos that have been added to a movie.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes" and "Bloopers" were added as valid video types.
     * 
     */
    public Optional<GetMovieVideosResponse> getMovieVideos(int movieId, String language) {
        // /movie/{movie_id}/videos
        String path = String.format("/movie/%s/videos", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the videos that have been added to a movie.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes" and "Bloopers" were added as valid video types.
     * 
     */
    public Optional<GetMovieVideosResponse> getMovieVideos(int movieId) {
        return getMovieVideos(movieId, null);
    }

    /**
     * <p>Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.</p> 
     * <p>This is not going to return full deep links, but rather, it's just enough information to display what's available where.</p> 
     * <p>You can link to the provided TMDb URL to help support TMDb and let your users deep link into the content.</p>
     * 
     */
    public Optional<GetMovieWatchProvidersResponse> getMovieWatchProviders(int movieId) {
        // /movie/{movie_id}/watch/providers
        String path = String.format("/movie/%s/watch/providers", movieId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Rate a movie.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     */
    public RateMovieResponse rateMovie(int movieId, RateMovieRequest rateMovieRequest, String guestSessionId, String sessionId) {
        // /movie/{movie_id}/rating
        String path = String.format("/movie/%s/rating", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , rateMovieRequest);
    }

    /**
     * <p>Rate a movie.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     */
    public RateMovieResponse rateMovie(int movieId, RateMovieRequest requestBody) {
        return rateMovie(movieId, requestBody, null, null);
    }

    /**
     * <p>Remove your rating for a movie.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     */
    public DeleteMovieRatingResponse deleteMovieRating(int movieId, String guestSessionId, String sessionId) {
        // /movie/{movie_id}/rating
        String path = String.format("/movie/%s/rating", movieId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        return restClient.delete(path, requestParams, new TypeReference<>() {


        }
        , null);
    }

    /**
     * <p>Remove your rating for a movie.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     */
    public DeleteMovieRatingResponse deleteMovieRating(int movieId) {
        return deleteMovieRating(movieId, null, null);
    }

    /**
     * <p>Get the most newly created movie. This is a live response and will continuously change.</p>
     * 
     */
    public GetLatestMovieResponse getLatestMovie(String language) {
        String path = "/movie/latest";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the most newly created movie. This is a live response and will continuously change.</p>
     * 
     */
    public GetLatestMovieResponse getLatestMovie() {
        return getLatestMovie(null);
    }

    /**
     * <p>Get a list of movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.</p> 
     * <p>You can optionally specify a <code>region</code> prameter which will narrow the search to only look for theatrical release dates within the specified country.</p>
     * 
     */
    public GetNowPlayingResponse getNowPlaying(String language, Integer page, String region) {
        String path = "/movie/now_playing";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("region", region);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.</p> 
     * <p>You can optionally specify a <code>region</code> prameter which will narrow the search to only look for theatrical release dates within the specified country.</p>
     * 
     */
    public GetNowPlayingResponse getNowPlaying() {
        return getNowPlaying(null, null, null);
    }

    /**
     * <p>Get a list of the current popular movies on TMDb. This list updates daily.</p>
     * 
     */
    public GetPopularMoviesResponse getPopularMovies(String language, Integer page, String region) {
        String path = "/movie/popular";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("region", region);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of the current popular movies on TMDb. This list updates daily.</p>
     * 
     */
    public GetPopularMoviesResponse getPopularMovies() {
        return getPopularMovies(null, null, null);
    }

    /**
     * <p>Get the top rated movies on TMDb.</p>
     * 
     */
    public GetTopRatedMoviesResponse getTopRatedMovies(String language, Integer page, String region) {
        String path = "/movie/top_rated";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("region", region);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the top rated movies on TMDb.</p>
     * 
     */
    public GetTopRatedMoviesResponse getTopRatedMovies() {
        return getTopRatedMovies(null, null, null);
    }

    /**
     * <p>Get a list of upcoming movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.</p> 
     * <p>You can optionally specify a <code>region</code> prameter which will narrow the search to only look for theatrical release dates within the specified country.</p>
     * 
     */
    public GetUpcomingResponse getUpcoming(String language, Integer page, String region) {
        String path = "/movie/upcoming";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        requestParams.put("region", region);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of upcoming movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.</p> 
     * <p>You can optionally specify a <code>region</code> prameter which will narrow the search to only look for theatrical release dates within the specified country.</p>
     * 
     */
    public GetUpcomingResponse getUpcoming() {
        return getUpcoming(null, null, null);
    }

}
