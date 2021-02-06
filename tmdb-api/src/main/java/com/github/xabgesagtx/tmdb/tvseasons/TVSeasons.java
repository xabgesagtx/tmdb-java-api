
package com.github.xabgesagtx.tmdb.tvseasons;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class TVSeasons {

    private final RestClient restClient;

    public TVSeasons(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetTvSeasonDetailsResponse getTvSeasonDetails(Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}
        String path = String.format("/tv/%s/season/%s", tvId, seasonNumber);
        return null;
    }

    public GetTvSeasonAccountStatesResponse getTvSeasonAccountStates(Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/account_states
        String path = String.format("/tv/%s/season/%s/account_states", tvId, seasonNumber);
        return null;
    }

    public GetTvSeasonAggregateCreditsResponse getTvSeasonAggregateCredits(Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/aggregate_credits
        String path = String.format("/tv/%s/season/%s/aggregate_credits", tvId, seasonNumber);
        return null;
    }

    public GetTvSeasonChangesResponse getTvSeasonChanges(Integer seasonId) {
        // /tv/season/{season_id}/changes
        String path = String.format("/tv/season/%s/changes", seasonId);
        return null;
    }

    public GetTvSeasonCreditsResponse getTvSeasonCredits(Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/credits
        String path = String.format("/tv/%s/season/%s/credits", tvId, seasonNumber);
        return null;
    }

    public GetTvSeasonExternalIdsResponse getTvSeasonExternalIds(Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/external_ids
        String path = String.format("/tv/%s/season/%s/external_ids", tvId, seasonNumber);
        return null;
    }

    public GetTvSeasonImagesResponse getTvSeasonImages(Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/images
        String path = String.format("/tv/%s/season/%s/images", tvId, seasonNumber);
        return null;
    }

    public GetTvSeasonTranslationsResponse getTvSeasonTranslations(Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/translations
        String path = String.format("/tv/%s/season/%s/translations", tvId, seasonNumber);
        return null;
    }

    public GetTvSeasonVideosResponse getTvSeasonVideos(Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/videos
        String path = String.format("/tv/%s/season/%s/videos", tvId, seasonNumber);
        return null;
    }

}
