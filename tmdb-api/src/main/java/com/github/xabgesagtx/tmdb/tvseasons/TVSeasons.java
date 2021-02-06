
package com.github.xabgesagtx.tmdb.tvseasons;

import java.util.Collections;
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
    public Optional<GetTvSeasonDetailsResponse> getTvSeasonDetails(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}
        String path = String.format("/tv/%s/season/%s", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Returns all of the user ratings for the season's episodes.</p>
     * 
     */
    public Optional<GetTvSeasonAccountStatesResponse> getTvSeasonAccountStates(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/account_states
        String path = String.format("/tv/%s/season/%s/account_states", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the aggregate credits for TV season.</p> 
     * <p>This call differs from the main <code>credits</code> call in that it does not only return the season credits, but rather is a view of all the cast &amp; crew for all of the episodes belonging to a season.</p>
     * 
     */
    public Optional<GetTvSeasonAggregateCreditsResponse> getTvSeasonAggregateCredits(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/aggregate_credits
        String path = String.format("/tv/%s/season/%s/aggregate_credits", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the changes for a TV season. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     */
    public Optional<GetTvSeasonChangesResponse> getTvSeasonChanges(int seasonId) {
        // /tv/season/{season_id}/changes
        String path = String.format("/tv/season/%s/changes", seasonId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the credits for TV season.</p>
     * 
     */
    public Optional<GetTvSeasonCreditsResponse> getTvSeasonCredits(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/credits
        String path = String.format("/tv/%s/season/%s/credits", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the external ids for a TV season. We currently support the following external sources.</p>    <strong>Media Databases</strong>     TVDB ID   Freebase MID*   Freebase ID*   TVRage ID*    
     * <p>*Defunct or no longer available as a service.</p>
     * 
     */
    public Optional<GetTvSeasonExternalIdsResponse> getTvSeasonExternalIds(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/external_ids
        String path = String.format("/tv/%s/season/%s/external_ids", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that belong to a TV season.</p> 
     * <p>Querying images with a <code>language</code> parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the <code>include_image_language</code> parameter. This should be a comma seperated value like so: <code>include_image_language=en,null</code>.</p>
     * 
     */
    public Optional<GetTvSeasonImagesResponse> getTvSeasonImages(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/images
        String path = String.format("/tv/%s/season/%s/images", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the credits for TV season.</p>
     * 
     */
    public Optional<GetTvSeasonTranslationsResponse> getTvSeasonTranslations(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/translations
        String path = String.format("/tv/%s/season/%s/translations", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the videos that have been added to a TV season.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 23, 2019 Vimeo was added as a video source.   March 20, 2019 "Behind the Scenes" and "Bloopers" and "Recap" were added as valid video types.
     * 
     */
    public Optional<GetTvSeasonVideosResponse> getTvSeasonVideos(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/videos
        String path = String.format("/tv/%s/season/%s/videos", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
