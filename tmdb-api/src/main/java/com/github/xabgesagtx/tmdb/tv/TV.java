
package com.github.xabgesagtx.tmdb.tv;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class TV {

    private final RestClient restClient;

    public TV(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetTvDetailsResponse> getTvDetails(int tvId) {
        // /tv/{tv_id}
        String path = String.format("/tv/%s", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvAccountStatesResponse> getTvAccountStates(int tvId) {
        // /tv/{tv_id}/account_states
        String path = String.format("/tv/%s/account_states", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvAggregateCreditsResponse> getTvAggregateCredits(int tvId) {
        // /tv/{tv_id}/aggregate_credits
        String path = String.format("/tv/%s/aggregate_credits", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvAlternativeTitlesResponse> getTvAlternativeTitles(int tvId) {
        // /tv/{tv_id}/alternative_titles
        String path = String.format("/tv/%s/alternative_titles", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvChangesResponse> getTvChanges(int tvId) {
        // /tv/{tv_id}/changes
        String path = String.format("/tv/%s/changes", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvContentRatingsResponse> getTvContentRatings(int tvId) {
        // /tv/{tv_id}/content_ratings
        String path = String.format("/tv/%s/content_ratings", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvCreditsResponse> getTvCredits(int tvId) {
        // /tv/{tv_id}/credits
        String path = String.format("/tv/%s/credits", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvEpisodeGroupsResponse> getTvEpisodeGroups(int tvId) {
        // /tv/{tv_id}/episode_groups
        String path = String.format("/tv/%s/episode_groups", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvExternalIdsResponse> getTvExternalIds(int tvId) {
        // /tv/{tv_id}/external_ids
        String path = String.format("/tv/%s/external_ids", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvImagesResponse> getTvImages(int tvId) {
        // /tv/{tv_id}/images
        String path = String.format("/tv/%s/images", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvKeywordsResponse> getTvKeywords(int tvId) {
        // /tv/{tv_id}/keywords
        String path = String.format("/tv/%s/keywords", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvRecommendationsResponse> getTvRecommendations(int tvId) {
        // /tv/{tv_id}/recommendations
        String path = String.format("/tv/%s/recommendations", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvReviewsResponse> getTvReviews(int tvId) {
        // /tv/{tv_id}/reviews
        String path = String.format("/tv/%s/reviews", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetScreenedTheatricallyResponse> getScreenedTheatrically(int tvId) {
        // /tv/{tv_id}/screened_theatrically
        String path = String.format("/tv/%s/screened_theatrically", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetSimilarTvShowsResponse> getSimilarTvShows(int tvId) {
        // /tv/{tv_id}/similar
        String path = String.format("/tv/%s/similar", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvTranslationsResponse> getTvTranslations(int tvId) {
        // /tv/{tv_id}/translations
        String path = String.format("/tv/%s/translations", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvVideosResponse> getTvVideos(int tvId) {
        // /tv/{tv_id}/videos
        String path = String.format("/tv/%s/videos", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvWatchProvidersResponse> getTvWatchProviders(int tvId) {
        // /tv/{tv_id}/watch/providers
        String path = String.format("/tv/%s/watch/providers", tvId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<RateTvShowResponse> rateTvShow(int tvId) {
        // /tv/{tv_id}/rating
        String path = String.format("/tv/%s/rating", tvId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<DeleteTvShowRatingResponse> deleteTvShowRating(int tvId) {
        // /tv/{tv_id}/rating
        String path = String.format("/tv/%s/rating", tvId);
        return restClient.delete(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetLatestTvResponse> getLatestTv() {
        String path = "/tv/latest";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvAiringTodayResponse> getTvAiringToday() {
        String path = "/tv/airing_today";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvOnTheAirResponse> getTvOnTheAir() {
        String path = "/tv/on_the_air";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPopularTvShowsResponse> getPopularTvShows() {
        String path = "/tv/popular";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTopRatedTvResponse> getTopRatedTv() {
        String path = "/tv/top_rated";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
