
package com.github.xabgesagtx.tmdb.tvepisodes;


public class TVEpisodes {


    public GetTvEpisodeDetailsResponse getTvEpisodeDetails() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}";
        return null;
    }

    public GetTvEpisodeAccountStatesResponse getTvEpisodeAccountStates() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states";
        return null;
    }

    public GetTvEpisodeChangesResponse getTvEpisodeChanges() {
        String path = "/tv/episode/{episode_id}/changes";
        return null;
    }

    public GetTvEpisodeCreditsResponse getTvEpisodeCredits() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits";
        return null;
    }

    public GetTvEpisodeExternalIdsResponse getTvEpisodeExternalIds() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids";
        return null;
    }

    public GetTvEpisodeImagesResponse getTvEpisodeImages() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}/images";
        return null;
    }

    public GetTvEpisodeTranslationsResponse getTvEpisodeTranslations() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations";
        return null;
    }

    public RateTvEpisodeResponse rateTvEpisode() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating";
        return null;
    }

    public DeleteTvEpisodeRatingResponse deleteTvEpisodeRating() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating";
        return null;
    }

    public GetTvEpisodeVideosResponse getTvEpisodeVideos() {
        String path = "/tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos";
        return null;
    }

}
