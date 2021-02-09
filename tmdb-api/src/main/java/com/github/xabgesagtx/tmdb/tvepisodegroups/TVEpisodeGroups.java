
package com.github.xabgesagtx.tmdb.tvepisodegroups;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvEpisodeGroupDetailsResponse getTvEpisodeGroupDetails(String id, String language) {
        // /tv/episode_group/{id}
        String path = String.format("/tv/episode_group/%s", id);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvEpisodeGroupDetailsResponse getTvEpisodeGroupDetails(String id) {
        return getTvEpisodeGroupDetails(id, null);
    }

}
