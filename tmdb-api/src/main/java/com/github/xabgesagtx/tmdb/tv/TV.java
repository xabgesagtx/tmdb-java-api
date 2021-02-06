
package com.github.xabgesagtx.tmdb.tv;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class TV {

    private final RestClient restClient;

    public TV(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetTvDetailsResponse getTvDetails(Integer tvId) {
        // /tv/{tv_id}
        String path = String.format("/tv/%s", tvId);
        return null;
    }

    public GetTvAccountStatesResponse getTvAccountStates(Integer tvId) {
        // /tv/{tv_id}/account_states
        String path = String.format("/tv/%s/account_states", tvId);
        return null;
    }

    public GetTvAggregateCreditsResponse getTvAggregateCredits(Integer tvId) {
        // /tv/{tv_id}/aggregate_credits
        String path = String.format("/tv/%s/aggregate_credits", tvId);
        return null;
    }

    public GetTvAlternativeTitlesResponse getTvAlternativeTitles(Integer tvId) {
        // /tv/{tv_id}/alternative_titles
        String path = String.format("/tv/%s/alternative_titles", tvId);
        return null;
    }

    public GetTvChangesResponse getTvChanges(Integer tvId) {
        // /tv/{tv_id}/changes
        String path = String.format("/tv/%s/changes", tvId);
        return null;
    }

    public GetTvContentRatingsResponse getTvContentRatings(Integer tvId) {
        // /tv/{tv_id}/content_ratings
        String path = String.format("/tv/%s/content_ratings", tvId);
        return null;
    }

    public GetTvCreditsResponse getTvCredits(Integer tvId) {
        // /tv/{tv_id}/credits
        String path = String.format("/tv/%s/credits", tvId);
        return null;
    }

    public GetTvEpisodeGroupsResponse getTvEpisodeGroups(Integer tvId) {
        // /tv/{tv_id}/episode_groups
        String path = String.format("/tv/%s/episode_groups", tvId);
        return null;
    }

    public GetTvExternalIdsResponse getTvExternalIds(Integer tvId) {
        // /tv/{tv_id}/external_ids
        String path = String.format("/tv/%s/external_ids", tvId);
        return null;
    }

    public GetTvImagesResponse getTvImages(Integer tvId) {
        // /tv/{tv_id}/images
        String path = String.format("/tv/%s/images", tvId);
        return null;
    }

    public GetTvKeywordsResponse getTvKeywords(Integer tvId) {
        // /tv/{tv_id}/keywords
        String path = String.format("/tv/%s/keywords", tvId);
        return null;
    }

    public GetTvRecommendationsResponse getTvRecommendations(Integer tvId) {
        // /tv/{tv_id}/recommendations
        String path = String.format("/tv/%s/recommendations", tvId);
        return null;
    }

    public GetTvReviewsResponse getTvReviews(Integer tvId) {
        // /tv/{tv_id}/reviews
        String path = String.format("/tv/%s/reviews", tvId);
        return null;
    }

    public GetScreenedTheatricallyResponse getScreenedTheatrically(Integer tvId) {
        // /tv/{tv_id}/screened_theatrically
        String path = String.format("/tv/%s/screened_theatrically", tvId);
        return null;
    }

    public GetSimilarTvShowsResponse getSimilarTvShows(Integer tvId) {
        // /tv/{tv_id}/similar
        String path = String.format("/tv/%s/similar", tvId);
        return null;
    }

    public GetTvTranslationsResponse getTvTranslations(Integer tvId) {
        // /tv/{tv_id}/translations
        String path = String.format("/tv/%s/translations", tvId);
        return null;
    }

    public GetTvVideosResponse getTvVideos(Integer tvId) {
        // /tv/{tv_id}/videos
        String path = String.format("/tv/%s/videos", tvId);
        return null;
    }

    public GetTvWatchProvidersResponse getTvWatchProviders(Integer tvId) {
        // /tv/{tv_id}/watch/providers
        String path = String.format("/tv/%s/watch/providers", tvId);
        return null;
    }

    public RateTvShowResponse rateTvShow(Integer tvId) {
        // /tv/{tv_id}/rating
        String path = String.format("/tv/%s/rating", tvId);
        return null;
    }

    public DeleteTvShowRatingResponse deleteTvShowRating(Integer tvId) {
        // /tv/{tv_id}/rating
        String path = String.format("/tv/%s/rating", tvId);
        return null;
    }

    public GetLatestTvResponse getLatestTv() {
        // /tv/latest
        String path = String.format("/tv/latest");
        return null;
    }

    public GetTvAiringTodayResponse getTvAiringToday() {
        // /tv/airing_today
        String path = String.format("/tv/airing_today");
        return null;
    }

    public GetTvOnTheAirResponse getTvOnTheAir() {
        // /tv/on_the_air
        String path = String.format("/tv/on_the_air");
        return null;
    }

    public GetPopularTvShowsResponse getPopularTvShows() {
        // /tv/popular
        String path = String.format("/tv/popular");
        return null;
    }

    public GetTopRatedTvResponse getTopRatedTv() {
        // /tv/top_rated
        String path = String.format("/tv/top_rated");
        return null;
    }

}
