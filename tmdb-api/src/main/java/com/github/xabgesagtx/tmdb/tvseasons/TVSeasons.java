
package com.github.xabgesagtx.tmdb.tvseasons;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class TVSeasons {

    private final RestClient restClient;

    public TVSeasons(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the TV season details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p>
     * 
     */
    public Optional<GetTvSeasonDetailsResponse> getTvSeasonDetails(int seasonNumber, int tvId, String appendToResponse, String language) {
        // /tv/{tv_id}/season/{season_number}
        String path = String.format("/tv/%s/season/%s", tvId, seasonNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("append_to_response", appendToResponse);
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the TV season details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p>
     * 
     */
    public Optional<GetTvSeasonDetailsResponse> getTvSeasonDetails(int seasonNumber, int tvId) {
        return getTvSeasonDetails(seasonNumber, tvId, null, null);
    }

    /**
     * <p>Returns all of the user ratings for the season's episodes.</p>
     * 
     */
    public Optional<GetTvSeasonAccountStatesResponse> getTvSeasonAccountStates(int seasonNumber, int tvId, String guestSessionId, String language, String sessionId) {
        // /tv/{tv_id}/season/{season_number}/account_states
        String path = String.format("/tv/%s/season/%s/account_states", tvId, seasonNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("guest_session_id", guestSessionId);
        requestParams.put("session_id", sessionId);
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Returns all of the user ratings for the season's episodes.</p>
     * 
     */
    public Optional<GetTvSeasonAccountStatesResponse> getTvSeasonAccountStates(int seasonNumber, int tvId) {
        return getTvSeasonAccountStates(seasonNumber, tvId, null, null, null);
    }

    /**
     * <p>Get the aggregate credits for TV season.</p> 
     * <p>This call differs from the main <code>credits</code> call in that it does not only return the season credits, but rather is a view of all the cast &amp; crew for all of the episodes belonging to a season.</p>
     * 
     */
    public Optional<GetTvSeasonAggregateCreditsResponse> getTvSeasonAggregateCredits(int seasonNumber, int tvId, String language) {
        // /tv/{tv_id}/season/{season_number}/aggregate_credits
        String path = String.format("/tv/%s/season/%s/aggregate_credits", tvId, seasonNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the aggregate credits for TV season.</p> 
     * <p>This call differs from the main <code>credits</code> call in that it does not only return the season credits, but rather is a view of all the cast &amp; crew for all of the episodes belonging to a season.</p>
     * 
     */
    public Optional<GetTvSeasonAggregateCreditsResponse> getTvSeasonAggregateCredits(int seasonNumber, int tvId) {
        return getTvSeasonAggregateCredits(seasonNumber, tvId, null);
    }

    /**
     * <p>Get the changes for a TV season. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     */
    public Optional<GetTvSeasonChangesResponse> getTvSeasonChanges(int seasonId, LocalDate endDate, Integer page, LocalDate startDate) {
        // /tv/season/{season_id}/changes
        String path = String.format("/tv/season/%s/changes", seasonId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("end_date", endDate);
        requestParams.put("page", page);
        requestParams.put("start_date", startDate);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the changes for a TV season. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     */
    public Optional<GetTvSeasonChangesResponse> getTvSeasonChanges(int seasonId) {
        return getTvSeasonChanges(seasonId, null, null, null);
    }

    /**
     * <p>Get the credits for TV season.</p>
     * 
     */
    public Optional<GetTvSeasonCreditsResponse> getTvSeasonCredits(int seasonNumber, int tvId, String language) {
        // /tv/{tv_id}/season/{season_number}/credits
        String path = String.format("/tv/%s/season/%s/credits", tvId, seasonNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the credits for TV season.</p>
     * 
     */
    public Optional<GetTvSeasonCreditsResponse> getTvSeasonCredits(int seasonNumber, int tvId) {
        return getTvSeasonCredits(seasonNumber, tvId, null);
    }

    /**
     * <p>Get the external ids for a TV season. We currently support the following external sources.</p>    <strong>Media Databases</strong>     TVDB ID   Freebase MID*   Freebase ID*   TVRage ID*    
     * <p>*Defunct or no longer available as a service.</p>
     * 
     */
    public Optional<GetTvSeasonExternalIdsResponse> getTvSeasonExternalIds(int seasonNumber, int tvId, String language) {
        // /tv/{tv_id}/season/{season_number}/external_ids
        String path = String.format("/tv/%s/season/%s/external_ids", tvId, seasonNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the external ids for a TV season. We currently support the following external sources.</p>    <strong>Media Databases</strong>     TVDB ID   Freebase MID*   Freebase ID*   TVRage ID*    
     * <p>*Defunct or no longer available as a service.</p>
     * 
     */
    public Optional<GetTvSeasonExternalIdsResponse> getTvSeasonExternalIds(int seasonNumber, int tvId) {
        return getTvSeasonExternalIds(seasonNumber, tvId, null);
    }

    /**
     * <p>Get the images that belong to a TV season.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     */
    public Optional<GetTvSeasonImagesResponse> getTvSeasonImages(int seasonNumber, int tvId, String language) {
        // /tv/{tv_id}/season/{season_number}/images
        String path = String.format("/tv/%s/season/%s/images", tvId, seasonNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that belong to a TV season.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     */
    public Optional<GetTvSeasonImagesResponse> getTvSeasonImages(int seasonNumber, int tvId) {
        return getTvSeasonImages(seasonNumber, tvId, null);
    }

    /**
     * <p>Get the credits for TV season.</p>
     * 
     */
    public Optional<GetTvSeasonTranslationsResponse> getTvSeasonTranslations(int seasonNumber, int tvId, String language) {
        // /tv/{tv_id}/season/{season_number}/translations
        String path = String.format("/tv/%s/season/%s/translations", tvId, seasonNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the credits for TV season.</p>
     * 
     */
    public Optional<GetTvSeasonTranslationsResponse> getTvSeasonTranslations(int seasonNumber, int tvId) {
        return getTvSeasonTranslations(seasonNumber, tvId, null);
    }

    /**
     * <p>Get the videos that have been added to a TV season.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes" and "Bloopers" and "Recap" were added as valid video types.
     * 
     */
    public Optional<GetTvSeasonVideosResponse> getTvSeasonVideos(int seasonNumber, int tvId, String language) {
        // /tv/{tv_id}/season/{season_number}/videos
        String path = String.format("/tv/%s/season/%s/videos", tvId, seasonNumber);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the videos that have been added to a TV season.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes" and "Bloopers" and "Recap" were added as valid video types.
     * 
     */
    public Optional<GetTvSeasonVideosResponse> getTvSeasonVideos(int seasonNumber, int tvId) {
        return getTvSeasonVideos(seasonNumber, tvId, null);
    }

}
