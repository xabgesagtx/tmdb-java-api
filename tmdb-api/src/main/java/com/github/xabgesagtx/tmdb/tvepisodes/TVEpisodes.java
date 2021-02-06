
package com.github.xabgesagtx.tmdb.tvepisodes;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class TVEpisodes {

    private final RestClient restClient;

    public TVEpisodes(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetTvEpisodeDetailsResponse getTvEpisodeDetails(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}
        String path = String.format("/tv/%s/season/%s/episode/%s", tvId, seasonNumber, episodeNumber);
        return null;
    }

    public GetTvEpisodeAccountStatesResponse getTvEpisodeAccountStates(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states
        String path = String.format("/tv/%s/season/%s/episode/%s/account_states", tvId, seasonNumber, episodeNumber);
        return null;
    }

    public GetTvEpisodeChangesResponse getTvEpisodeChanges(Integer episodeId) {
        // /tv/episode/{episode_id}/changes
        String path = String.format("/tv/episode/%s/changes", episodeId);
        return null;
    }

    public GetTvEpisodeCreditsResponse getTvEpisodeCredits(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits
        String path = String.format("/tv/%s/season/%s/episode/%s/credits", tvId, seasonNumber, episodeNumber);
        return null;
    }

    public GetTvEpisodeExternalIdsResponse getTvEpisodeExternalIds(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids
        String path = String.format("/tv/%s/season/%s/episode/%s/external_ids", tvId, seasonNumber, episodeNumber);
        return null;
    }

    public GetTvEpisodeImagesResponse getTvEpisodeImages(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/images
        String path = String.format("/tv/%s/season/%s/episode/%s/images", tvId, seasonNumber, episodeNumber);
        return null;
    }

    public GetTvEpisodeTranslationsResponse getTvEpisodeTranslations(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations
        String path = String.format("/tv/%s/season/%s/episode/%s/translations", tvId, seasonNumber, episodeNumber);
        return null;
    }

    public RateTvEpisodeResponse rateTvEpisode(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating
        String path = String.format("/tv/%s/season/%s/episode/%s/rating", tvId, seasonNumber, episodeNumber);
        return null;
    }

    public DeleteTvEpisodeRatingResponse deleteTvEpisodeRating(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating
        String path = String.format("/tv/%s/season/%s/episode/%s/rating", tvId, seasonNumber, episodeNumber);
        return null;
    }

    public GetTvEpisodeVideosResponse getTvEpisodeVideos(Integer episodeNumber, Integer seasonNumber, Integer tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos
        String path = String.format("/tv/%s/season/%s/episode/%s/videos", tvId, seasonNumber, episodeNumber);
        return null;
    }

}
