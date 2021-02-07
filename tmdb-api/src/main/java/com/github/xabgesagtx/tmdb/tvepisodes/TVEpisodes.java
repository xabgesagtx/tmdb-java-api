
package com.github.xabgesagtx.tmdb.tvepisodes;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class TVEpisodes {

    private final RestClient restClient;

    public TVEpisodes(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the TV episode details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     June 1, 2018 Added the <a href="https://developers.themoviedb.org/3/tv-episodes/get-tv-episode-translations">translations</a> method.
     * 
     */
    public Optional<GetTvEpisodeDetailsResponse> getTvEpisodeDetails(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}
        String path = String.format("/tv/%s/season/%s/episode/%s", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get your rating for a episode.</p>
     * 
     */
    public Optional<GetTvEpisodeAccountStatesResponse> getTvEpisodeAccountStates(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states
        String path = String.format("/tv/%s/season/%s/episode/%s/account_states", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the changes for a TV episode. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     */
    public Optional<GetTvEpisodeChangesResponse> getTvEpisodeChanges(int episodeId) {
        // /tv/episode/{episode_id}/changes
        String path = String.format("/tv/episode/%s/changes", episodeId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the credits (cast, crew and guest stars) for a TV episode.</p>
     * 
     */
    public Optional<GetTvEpisodeCreditsResponse> getTvEpisodeCredits(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits
        String path = String.format("/tv/%s/season/%s/episode/%s/credits", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the external ids for a TV episode. We currently support the following external sources.</p>    <strong>External Sources</strong>     IMDb ID   TVDB ID   Freebase MID*   Freebase ID*   TVRage ID*    
     * <p>*Defunct or no longer available as a service.</p>
     * 
     */
    public Optional<GetTvEpisodeExternalIdsResponse> getTvEpisodeExternalIds(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids
        String path = String.format("/tv/%s/season/%s/episode/%s/external_ids", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that belong to a TV episode.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     */
    public Optional<GetTvEpisodeImagesResponse> getTvEpisodeImages(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/images
        String path = String.format("/tv/%s/season/%s/episode/%s/images", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the translation data for an episode.</p>
     * 
     */
    public Optional<GetTvEpisodeTranslationsResponse> getTvEpisodeTranslations(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations
        String path = String.format("/tv/%s/season/%s/episode/%s/translations", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Rate a TV episode.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     */
    public Optional<RateTvEpisodeResponse> rateTvEpisode(int episodeNumber, int seasonNumber, int tvId, RateTvEpisodeRequest rateTvEpisodeRequest) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating
        String path = String.format("/tv/%s/season/%s/episode/%s/rating", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , rateTvEpisodeRequest);
    }

    /**
     * <p>Remove your rating for a TV episode.</p> 
     * <p>A valid session or guest session ID is required. You can read more about how this works <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     */
    public Optional<DeleteTvEpisodeRatingResponse> deleteTvEpisodeRating(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating
        String path = String.format("/tv/%s/season/%s/episode/%s/rating", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.delete(path, requestParams, new TypeReference<>() {


        }
        , null);
    }

    /**
     * <p>Get the videos that have been added to a TV episode.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes", "Bloopers" and "Recap" were added as valid video types.
     * 
     */
    public Optional<GetTvEpisodeVideosResponse> getTvEpisodeVideos(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos
        String path = String.format("/tv/%s/season/%s/episode/%s/videos", tvId, seasonNumber, episodeNumber);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
