
package com.github.xabgesagtx.tmdb.tvepisodegroups;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class TVEpisodeGroups {

    private final RestClient restClient;

    public TVEpisodeGroups(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetTvEpisodeGroupDetailsResponse> getTvEpisodeGroupDetails(String id) {
        // /tv/episode_group/{id}
        String path = String.format("/tv/episode_group/%s", id);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
