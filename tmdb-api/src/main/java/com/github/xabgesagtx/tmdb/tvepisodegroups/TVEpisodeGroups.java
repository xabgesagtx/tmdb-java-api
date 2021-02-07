
package com.github.xabgesagtx.tmdb.tvepisodegroups;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class TVEpisodeGroups {

    private final RestClient restClient;

    public TVEpisodeGroups(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the details of a TV episode group. Groups support 7 different types which are enumerated as the following:</p> 
     * <ol> 
     *  <li>Original air date</li> 
     *  <li>Absolute</li> 
     *  <li>DVD</li> 
     *  <li>Digital</li> 
     *  <li>Story arc</li> 
     *  <li>Production</li> 
     *  <li>TV</li> 
     * </ol>
     * 
     */
    public Optional<GetTvEpisodeGroupDetailsResponse> getTvEpisodeGroupDetails(String id) {
        // /tv/episode_group/{id}
        String path = String.format("/tv/episode_group/%s", id);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
