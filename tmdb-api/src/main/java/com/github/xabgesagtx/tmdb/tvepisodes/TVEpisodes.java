
package com.github.xabgesagtx.tmdb.tvepisodes;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class TVEpisodes {

    private final RestClient restClient;

    public TVEpisodes(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetTvEpisodeDetailsResponse> getTvEpisodeDetails(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}
        String path = String.format("/tv/%s/season/%s/episode/%s", tvId, seasonNumber, episodeNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvEpisodeAccountStatesResponse> getTvEpisodeAccountStates(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states
        String path = String.format("/tv/%s/season/%s/episode/%s/account_states", tvId, seasonNumber, episodeNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvEpisodeChangesResponse> getTvEpisodeChanges(int episodeId) {
        // /tv/episode/{episode_id}/changes
        String path = String.format("/tv/episode/%s/changes", episodeId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvEpisodeCreditsResponse> getTvEpisodeCredits(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits
        String path = String.format("/tv/%s/season/%s/episode/%s/credits", tvId, seasonNumber, episodeNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvEpisodeExternalIdsResponse> getTvEpisodeExternalIds(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids
        String path = String.format("/tv/%s/season/%s/episode/%s/external_ids", tvId, seasonNumber, episodeNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvEpisodeImagesResponse> getTvEpisodeImages(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/images
        String path = String.format("/tv/%s/season/%s/episode/%s/images", tvId, seasonNumber, episodeNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvEpisodeTranslationsResponse> getTvEpisodeTranslations(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations
        String path = String.format("/tv/%s/season/%s/episode/%s/translations", tvId, seasonNumber, episodeNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<RateTvEpisodeResponse> rateTvEpisode(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating
        String path = String.format("/tv/%s/season/%s/episode/%s/rating", tvId, seasonNumber, episodeNumber);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<DeleteTvEpisodeRatingResponse> deleteTvEpisodeRating(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating
        String path = String.format("/tv/%s/season/%s/episode/%s/rating", tvId, seasonNumber, episodeNumber);
        return restClient.delete(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvEpisodeVideosResponse> getTvEpisodeVideos(int episodeNumber, int seasonNumber, int tvId) {
        // /tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos
        String path = String.format("/tv/%s/season/%s/episode/%s/videos", tvId, seasonNumber, episodeNumber);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
