
package com.github.xabgesagtx.tmdb.tv;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class TV {

    private final RestClient restClient;

    public TV(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the primary TV show details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     November 20, 2020 A <code>watch/providers</code> method has been added to show what providers (eg. streaming) are available and where.   November 14, 2020 The <code>tagline</code> has been added to the default response, and is also available as part of the translations method.   July 17, 2018 We now return <code>last_episode_to_air</code> and <code>next_episode_to_air</code> fields.   March 12, 2018 Networks return proper logos and we introduced SVG support.   March 8, 2018 The <code>seasons</code> field now returns the translated names and overviews.
     * 
     * @param appendToResponse
     *     Append requests within the same namespace to the response.
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvDetailsResponse> getTvDetails(int tvId, String appendToResponse, String language) {
        // /tv/{tv_id}
        String path = String.format("/tv/%s", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("append_to_response", appendToResponse);
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the primary TV show details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     November 20, 2020 A <code>watch/providers</code> method has been added to show what providers (eg. streaming) are available and where.   November 14, 2020 The <code>tagline</code> has been added to the default response, and is also available as part of the translations method.   July 17, 2018 We now return <code>last_episode_to_air</code> and <code>next_episode_to_air</code> fields.   March 12, 2018 Networks return proper logos and we introduced SVG support.   March 8, 2018 The <code>seasons</code> field now returns the translated names and overviews.
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvDetailsResponse> getTvDetails(int tvId) {
        return getTvDetails(tvId, null, null);
    }

    /**
     * <p>Grab the following account states for a session:</p> 
     * <ul> 
     *  <li>TV show rating</li> 
     *  <li>If it belongs to your watchlist</li> 
     *  <li>If it belongs to your favourite list</li> 
     * </ul>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @param sessionId
     *     sessionId
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvAccountStatesResponse> getTvAccountStates(int tvId, String guestSessionId, String language, String sessionId) {
        // /tv/{tv_id}/account_states
        String path = String.format("/tv/%s/account_states", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Grab the following account states for a session:</p> 
     * <ul> 
     *  <li>TV show rating</li> 
     *  <li>If it belongs to your watchlist</li> 
     *  <li>If it belongs to your favourite list</li> 
     * </ul>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvAccountStatesResponse> getTvAccountStates(int tvId) {
        return getTvAccountStates(tvId, null, null, null);
    }

    /**
     * <p>Get the aggregate credits (cast and crew) that have been added to a TV show.</p> 
     * <p>This call differs from the main <code>credits</code> call in that it does not return the newest season but rather, is a view of all the entire cast &amp; crew for all episodes belonging to a TV show.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvAggregateCreditsResponse> getTvAggregateCredits(int tvId, String language) {
        // /tv/{tv_id}/aggregate_credits
        String path = String.format("/tv/%s/aggregate_credits", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the aggregate credits (cast and crew) that have been added to a TV show.</p> 
     * <p>This call differs from the main <code>credits</code> call in that it does not return the newest season but rather, is a view of all the entire cast &amp; crew for all episodes belonging to a TV show.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvAggregateCreditsResponse> getTvAggregateCredits(int tvId) {
        return getTvAggregateCredits(tvId, null);
    }

    /**
     * <p>Returns all of the alternative titles for a TV show.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvAlternativeTitlesResponse> getTvAlternativeTitles(int tvId, String language) {
        // /tv/{tv_id}/alternative_titles
        String path = String.format("/tv/%s/alternative_titles", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Returns all of the alternative titles for a TV show.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvAlternativeTitlesResponse> getTvAlternativeTitles(int tvId) {
        return getTvAlternativeTitles(tvId, null);
    }

    /**
     * <p>Get the changes for a TV show. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p> 
     * <p>TV show changes are different than movie changes in that there are some edits on seasons and episodes that will create a change entry at the show level. These can be found under the season and episode keys. These keys will contain a <code>series_id</code> and <code>episode_id</code>. You can use the <a href="https://developers.themoviedb.org/3/tv-seasons/get-tv-season-changes">season changes</a> and <a href="https://developers.themoviedb.org/3/tv-episodes/get-tv-episode-changes">episode changes</a> methods to look these up individually.</p>
     * 
     * @param endDate
     *     Filter the results with a end date.
     * @param tvId
     *     tvId
     * @param page
     *     Specify which page to query.
     * @param startDate
     *     Filter the results with a start date.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvChangesResponse getTvChanges(int tvId, LocalDate endDate, Integer page, LocalDate startDate) {
        // /tv/{tv_id}/changes
        String path = String.format("/tv/%s/changes", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("end_date", endDate);
        requestParams.put("page", page);
        requestParams.put("start_date", startDate);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the changes for a TV show. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p> 
     * <p>TV show changes are different than movie changes in that there are some edits on seasons and episodes that will create a change entry at the show level. These can be found under the season and episode keys. These keys will contain a <code>series_id</code> and <code>episode_id</code>. You can use the <a href="https://developers.themoviedb.org/3/tv-seasons/get-tv-season-changes">season changes</a> and <a href="https://developers.themoviedb.org/3/tv-episodes/get-tv-episode-changes">episode changes</a> methods to look these up individually.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvChangesResponse getTvChanges(int tvId) {
        return getTvChanges(tvId, null, null, null);
    }

    /**
     * <p>Get the list of content ratings (certifications) that have been added to a TV show.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvContentRatingsResponse> getTvContentRatings(int tvId, String language) {
        // /tv/{tv_id}/content_ratings
        String path = String.format("/tv/%s/content_ratings", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of content ratings (certifications) that have been added to a TV show.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvContentRatingsResponse> getTvContentRatings(int tvId) {
        return getTvContentRatings(tvId, null);
    }

    /**
     * <p>Get the credits (cast and crew) that have been added to a TV show.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvCreditsResponse> getTvCredits(int tvId, String language) {
        // /tv/{tv_id}/credits
        String path = String.format("/tv/%s/credits", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the credits (cast and crew) that have been added to a TV show.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvCreditsResponse> getTvCredits(int tvId) {
        return getTvCredits(tvId, null);
    }

    /**
     * <p>Get all of the episode groups that have been created for a TV show. With a group ID you can call the <a href="https://developers.themoviedb.org/3/tv-episode-groups/get-tv-episode-group-details">get TV episode group details</a> method.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeGroupsResponse> getTvEpisodeGroups(int tvId, String language) {
        // /tv/{tv_id}/episode_groups
        String path = String.format("/tv/%s/episode_groups", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get all of the episode groups that have been created for a TV show. With a group ID you can call the <a href="https://developers.themoviedb.org/3/tv-episode-groups/get-tv-episode-group-details">get TV episode group details</a> method.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeGroupsResponse> getTvEpisodeGroups(int tvId) {
        return getTvEpisodeGroups(tvId, null);
    }

    /**
     * <p>Get the external ids for a TV show. We currently support the following external sources.</p>    <strong>Media Databases</strong> <strong>Social IDs</strong>     IMDb ID Facebook   TVDB ID Instagram   Freebase MID* Twitter   Freebase ID*    TVRage ID*     
     * <p>*Defunct or no longer available as a service.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvExternalIdsResponse> getTvExternalIds(int tvId, String language) {
        // /tv/{tv_id}/external_ids
        String path = String.format("/tv/%s/external_ids", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the external ids for a TV show. We currently support the following external sources.</p>    <strong>Media Databases</strong> <strong>Social IDs</strong>     IMDb ID Facebook   TVDB ID Instagram   Freebase MID* Twitter   Freebase ID*    TVRage ID*     
     * <p>*Defunct or no longer available as a service.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvExternalIdsResponse> getTvExternalIds(int tvId) {
        return getTvExternalIds(tvId, null);
    }

    /**
     * <p>Get the images that belong to a TV show.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvImagesResponse> getTvImages(int tvId, String language) {
        // /tv/{tv_id}/images
        String path = String.format("/tv/%s/images", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that belong to a TV show.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvImagesResponse> getTvImages(int tvId) {
        return getTvImages(tvId, null);
    }

    /**
     * <p>Get the keywords that have been added to a TV show.</p>
     * 
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvKeywordsResponse> getTvKeywords(int tvId) {
        // /tv/{tv_id}/keywords
        String path = String.format("/tv/%s/keywords", tvId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of TV show recommendations for this item.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvRecommendationsResponse getTvRecommendations(int tvId, String language, Integer page) {
        // /tv/{tv_id}/recommendations
        String path = String.format("/tv/%s/recommendations", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of TV show recommendations for this item.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvRecommendationsResponse getTvRecommendations(int tvId) {
        return getTvRecommendations(tvId, null, null);
    }

    /**
     * <p>Get the reviews for a TV show.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvReviewsResponse getTvReviews(int tvId, String language, Integer page) {
        // /tv/{tv_id}/reviews
        String path = String.format("/tv/%s/reviews", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the reviews for a TV show.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvReviewsResponse getTvReviews(int tvId) {
        return getTvReviews(tvId, null, null);
    }

    /**
     * <p>Get a list of seasons or episodes that have been screened in a film festival or theatre.</p>
     * 
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetScreenedTheatricallyResponse> getScreenedTheatrically(int tvId) {
        // /tv/{tv_id}/screened_theatrically
        String path = String.format("/tv/%s/screened_theatrically", tvId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of similar TV shows. These items are assembled by looking at keywords and genres.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetSimilarTvShowsResponse getSimilarTvShows(int tvId, String language, Integer page) {
        // /tv/{tv_id}/similar
        String path = String.format("/tv/%s/similar", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of similar TV shows. These items are assembled by looking at keywords and genres.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetSimilarTvShowsResponse getSimilarTvShows(int tvId) {
        return getSimilarTvShows(tvId, null, null);
    }

    /**
     * <p>Get a list of the translations that exist for a TV show.</p>
     * 
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvTranslationsResponse> getTvTranslations(int tvId) {
        // /tv/{tv_id}/translations
        String path = String.format("/tv/%s/translations", tvId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the videos that have been added to a TV show.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes" and "Bloopers" were added as valid video types.
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvVideosResponse> getTvVideos(int tvId, String language) {
        // /tv/{tv_id}/videos
        String path = String.format("/tv/%s/videos", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the videos that have been added to a TV show.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes" and "Bloopers" were added as valid video types.
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvVideosResponse> getTvVideos(int tvId) {
        return getTvVideos(tvId, null);
    }

    /**
     * <p>Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.</p> 
     * <p>This is not going to return full deep links, but rather, it's just enough information to display what's available where.</p> 
     * <p>You can link to the provided TMDb URL to help support TMDb and let your users deep link into the content.</p>
     * 
     * @param tvId
     *     tvId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvWatchProvidersResponse> getTvWatchProviders(int tvId) {
        // /tv/{tv_id}/watch/providers
        String path = String.format("/tv/%s/watch/providers", tvId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Rate a TV show.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @param rateTvShowRequest
     *     rateTvShowRequest
     * @param tvId
     *     tvId
     * @param sessionId
     *     sessionId
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public RateTvShowResponse rateTvShow(int tvId, RateTvShowRequest rateTvShowRequest, String guestSessionId, String sessionId) {
        // /tv/{tv_id}/rating
        String path = String.format("/tv/%s/rating", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , rateTvShowRequest);
    }

    /**
     * <p>Rate a TV show.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public RateTvShowResponse rateTvShow(int tvId, RateTvShowRequest requestBody) {
        return rateTvShow(tvId, requestBody, null, null);
    }

    /**
     * <p>Remove your rating for a TV show.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @param tvId
     *     tvId
     * @param sessionId
     *     sessionId
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public DeleteTvShowRatingResponse deleteTvShowRating(int tvId, String guestSessionId, String sessionId) {
        // /tv/{tv_id}/rating
        String path = String.format("/tv/%s/rating", tvId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        return restClient.delete(path, requestParams, new TypeReference<>() {


        }
        , null);
    }

    /**
     * <p>Remove your rating for a TV show.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public DeleteTvShowRatingResponse deleteTvShowRating(int tvId) {
        return deleteTvShowRating(tvId, null, null);
    }

    /**
     * <p>Get the most newly created TV show. This is a live response and will continuously change.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetLatestTvResponse getLatestTv(String language) {
        String path = "/tv/latest";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the most newly created TV show. This is a live response and will continuously change.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetLatestTvResponse getLatestTv() {
        return getLatestTv(null);
    }

    /**
     * <p>Get a list of TV shows that are airing today. This query is purely day based as we do not currently support airing times.</p> 
     * <p>You can specify a <a>timezone</a> to offset the day calculation. Without a specified timezone, this query defaults to EST (Eastern Time UTC-05:00).</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvAiringTodayResponse getTvAiringToday(String language, Integer page) {
        String path = "/tv/airing_today";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of TV shows that are airing today. This query is purely day based as we do not currently support airing times.</p> 
     * <p>You can specify a <a>timezone</a> to offset the day calculation. Without a specified timezone, this query defaults to EST (Eastern Time UTC-05:00).</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvAiringTodayResponse getTvAiringToday() {
        return getTvAiringToday(null, null);
    }

    /**
     * <p>Get a list of shows that are currently on the air.</p> 
     * <p>This query looks for any TV show that has an episode with an air date in the next 7 days.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvOnTheAirResponse getTvOnTheAir(String language, Integer page) {
        String path = "/tv/on_the_air";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of shows that are currently on the air.</p> 
     * <p>This query looks for any TV show that has an episode with an air date in the next 7 days.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvOnTheAirResponse getTvOnTheAir() {
        return getTvOnTheAir(null, null);
    }

    /**
     * <p>Get a list of the current popular TV shows on TMDb. This list updates daily.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetPopularTvShowsResponse getPopularTvShows(String language, Integer page) {
        String path = "/tv/popular";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of the current popular TV shows on TMDb. This list updates daily.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetPopularTvShowsResponse getPopularTvShows() {
        return getPopularTvShows(null, null);
    }

    /**
     * <p>Get a list of the top rated TV shows on TMDb.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTopRatedTvResponse getTopRatedTv(String language, Integer page) {
        String path = "/tv/top_rated";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of the top rated TV shows on TMDb.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTopRatedTvResponse getTopRatedTv() {
        return getTopRatedTv(null, null);
    }

}
