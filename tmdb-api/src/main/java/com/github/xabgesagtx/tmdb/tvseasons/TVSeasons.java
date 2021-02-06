
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

    public Optional<GetTvSeasonDetailsResponse> getTvSeasonDetails(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}
        String path = String.format("/tv/%s/season/%s", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvSeasonAccountStatesResponse> getTvSeasonAccountStates(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/account_states
        String path = String.format("/tv/%s/season/%s/account_states", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvSeasonAggregateCreditsResponse> getTvSeasonAggregateCredits(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/aggregate_credits
        String path = String.format("/tv/%s/season/%s/aggregate_credits", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvSeasonChangesResponse> getTvSeasonChanges(int seasonId) {
        // /tv/season/{season_id}/changes
        String path = String.format("/tv/season/%s/changes", seasonId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvSeasonCreditsResponse> getTvSeasonCredits(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/credits
        String path = String.format("/tv/%s/season/%s/credits", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvSeasonExternalIdsResponse> getTvSeasonExternalIds(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/external_ids
        String path = String.format("/tv/%s/season/%s/external_ids", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvSeasonImagesResponse> getTvSeasonImages(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/images
        String path = String.format("/tv/%s/season/%s/images", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvSeasonTranslationsResponse> getTvSeasonTranslations(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/translations
        String path = String.format("/tv/%s/season/%s/translations", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvSeasonVideosResponse> getTvSeasonVideos(int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/videos
        String path = String.format("/tv/%s/season/%s/videos", tvId, seasonNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
