
package com.github.xabgesagtx.tmdb.tvepisodegroups;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class TVEpisodeGroups {

    private final RestClient restClient;

    public TVEpisodeGroups(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetTvEpisodeGroupDetailsResponse getTvEpisodeGroupDetails(String id) {
        // /tv/episode_group/{id}
        String path = String.format("/tv/episode_group/%s", id);
        return null;
    }

}
