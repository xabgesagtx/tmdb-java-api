
package com.github.xabgesagtx.tmdb.tvepisodes;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class TVEpisodes {

    private final RestClient restClient;

    public TVEpisodes(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the TV episode details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     June 1, 2018 Added the <a href="https://developers.themoviedb.org/3/tv-episodes/get-tv-episode-translations">translations</a> method.
     * 
     * @param appendToResponse
     *     Append requests within the same namespace to the response.
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeDetailsResponse> getTvEpisodeDetails(int tvId, int seasonNumber, int episodeNumber, String appendToResponse, String language) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}
        String path = String.format("/tv/%s/season/%s/episode/%s", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("append_to_response", appendToResponse);
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the TV episode details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     June 1, 2018 Added the <a href="https://developers.themoviedb.org/3/tv-episodes/get-tv-episode-translations">translations</a> method.
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeDetailsResponse> getTvEpisodeDetails(int tvId, int seasonNumber, int episodeNumber) {
        return getTvEpisodeDetails(tvId, seasonNumber, episodeNumber, null, null);
    }

    /**
     * <p>Get your rating for a episode.</p>
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param sessionId
     *     sessionId
     * @param episodeNumber
     *     episodeNumber
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeAccountStatesResponse> getTvEpisodeAccountStates(int tvId, int seasonNumber, int episodeNumber, String guestSessionId, String sessionId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states
        String path = String.format("/tv/%s/season/%s/episode/%s/account_states", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get your rating for a episode.</p>
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeAccountStatesResponse> getTvEpisodeAccountStates(int tvId, int seasonNumber, int episodeNumber) {
        return getTvEpisodeAccountStates(tvId, seasonNumber, episodeNumber, null, null);
    }

    /**
     * <p>Get the changes for a TV episode. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     * @param endDate
     *     Filter the results with a end date.
     * @param page
     *     Specify which page to query.
     * @param episodeId
     *     episodeId
     * @param startDate
     *     Filter the results with a start date.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvEpisodeChangesResponse getTvEpisodeChanges(int episodeId, LocalDate endDate, Integer page, LocalDate startDate) {
        // /tv/episode/{episode_id}/changes
        String path = String.format("/tv/episode/%s/changes", episodeId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("end_date", endDate);
        requestParams.put("page", page);
        requestParams.put("start_date", startDate);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the changes for a TV episode. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     * @param episodeId
     *     episodeId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvEpisodeChangesResponse getTvEpisodeChanges(int episodeId) {
        return getTvEpisodeChanges(episodeId, null, null, null);
    }

    /**
     * <p>Get the credits (cast, crew and guest stars) for a TV episode.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeCreditsResponse> getTvEpisodeCredits(int tvId, int seasonNumber, int episodeNumber, String language) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits
        String path = String.format("/tv/%s/season/%s/episode/%s/credits", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the credits (cast, crew and guest stars) for a TV episode.</p>
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeCreditsResponse> getTvEpisodeCredits(int tvId, int seasonNumber, int episodeNumber) {
        return getTvEpisodeCredits(tvId, seasonNumber, episodeNumber, null);
    }

    /**
     * <p>Get the external ids for a TV episode. We currently support the following external sources.</p>    <strong>External Sources</strong>     IMDb ID   TVDB ID   Freebase MID*   Freebase ID*   TVRage ID*    
     * <p>*Defunct or no longer available as a service.</p>
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeExternalIdsResponse> getTvEpisodeExternalIds(int tvId, int seasonNumber, int episodeNumber) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids
        String path = String.format("/tv/%s/season/%s/episode/%s/external_ids", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that belong to a TV episode.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeImagesResponse> getTvEpisodeImages(int tvId, int seasonNumber, int episodeNumber) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/images
        String path = String.format("/tv/%s/season/%s/episode/%s/images", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the translation data for an episode.</p>
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeTranslationsResponse> getTvEpisodeTranslations(int tvId, int seasonNumber, int episodeNumber) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations
        String path = String.format("/tv/%s/season/%s/episode/%s/translations", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Rate a TV episode.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @param rateTvEpisodeRequest
     *     rateTvEpisodeRequest
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param sessionId
     *     sessionId
     * @param episodeNumber
     *     episodeNumber
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public RateTvEpisodeResponse rateTvEpisode(int tvId, int seasonNumber, int episodeNumber, RateTvEpisodeRequest rateTvEpisodeRequest, String guestSessionId, String sessionId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating
        String path = String.format("/tv/%s/season/%s/episode/%s/rating", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , rateTvEpisodeRequest);
    }

    /**
     * <p>Rate a TV episode.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @param requestBody
     *     requestBody
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public RateTvEpisodeResponse rateTvEpisode(int tvId, int seasonNumber, int episodeNumber, RateTvEpisodeRequest requestBody) {
        return rateTvEpisode(tvId, seasonNumber, episodeNumber, requestBody, null, null);
    }

    /**
     * <p>Remove your rating for a TV episode.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param sessionId
     *     sessionId
     * @param episodeNumber
     *     episodeNumber
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public DeleteTvEpisodeRatingResponse deleteTvEpisodeRating(int tvId, int seasonNumber, int episodeNumber, String guestSessionId, String sessionId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating
        String path = String.format("/tv/%s/season/%s/episode/%s/rating", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        return restClient.delete(path, requestParams, new TypeReference<>() {


        }
        , null);
    }

    /**
     * <p>Remove your rating for a TV episode.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public DeleteTvEpisodeRatingResponse deleteTvEpisodeRating(int tvId, int seasonNumber, int episodeNumber) {
        return deleteTvEpisodeRating(tvId, seasonNumber, episodeNumber, null, null);
    }

    /**
     * <p>Get the videos that have been added to a TV episode.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes", "Bloopers" and "Recap" were added as valid video types.
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeVideosResponse> getTvEpisodeVideos(int tvId, int seasonNumber, int episodeNumber, String language) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos
        String path = String.format("/tv/%s/season/%s/episode/%s/videos", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the videos that have been added to a TV episode.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes", "Bloopers" and "Recap" were added as valid video types.
     * 
     * @param tvId
     *     tvId
     * @param seasonNumber
     *     seasonNumber
     * @param episodeNumber
     *     episodeNumber
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetTvEpisodeVideosResponse> getTvEpisodeVideos(int tvId, int seasonNumber, int episodeNumber) {
        return getTvEpisodeVideos(tvId, seasonNumber, episodeNumber, null);
    }

}
