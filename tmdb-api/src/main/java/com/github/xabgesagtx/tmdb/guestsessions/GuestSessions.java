
package com.github.xabgesagtx.tmdb.guestsessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class GuestSessions {

    private final RestClient restClient;

    public GuestSessions(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the rated movies for a guest session.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param sortBy
     *     Sort the results.
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetGuestSessionRatedMoviesResponse> getGuestSessionRatedMovies(String guestSessionId, String language, GuestSessions.GetGuestSessionRatedMoviesSortByParam sortBy) {
        // /guest_session/{guest_session_id}/rated/movies
        String path = String.format("/guest_session/%s/rated/movies", guestSessionId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("sort_by", sortBy);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the rated movies for a guest session.</p>
     * 
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetGuestSessionRatedMoviesResponse> getGuestSessionRatedMovies(String guestSessionId) {
        return getGuestSessionRatedMovies(guestSessionId, null, null);
    }

    /**
     * <p>Get the rated TV shows for a guest session.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param sortBy
     *     Sort the results.
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetGuestSessionRatedTvShowsResponse> getGuestSessionRatedTvShows(String guestSessionId, String language, GuestSessions.GetGuestSessionRatedTvShowsSortByParam sortBy) {
        // /guest_session/{guest_session_id}/rated/tv
        String path = String.format("/guest_session/%s/rated/tv", guestSessionId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("sort_by", sortBy);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the rated TV shows for a guest session.</p>
     * 
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetGuestSessionRatedTvShowsResponse> getGuestSessionRatedTvShows(String guestSessionId) {
        return getGuestSessionRatedTvShows(guestSessionId, null, null);
    }

    /**
     * <p>Get the rated TV episodes for a guest session.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param sortBy
     *     Sort the results.
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetGestSessionRatedTvEpisodesResponse> getGestSessionRatedTvEpisodes(String guestSessionId, String language, GuestSessions.GetGestSessionRatedTvEpisodesSortByParam sortBy) {
        // /guest_session/{guest_session_id}/rated/tv/episodes
        String path = String.format("/guest_session/%s/rated/tv/episodes", guestSessionId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("sort_by", sortBy);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the rated TV episodes for a guest session.</p>
     * 
     * @param guestSessionId
     *     guestSessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetGestSessionRatedTvEpisodesResponse> getGestSessionRatedTvEpisodes(String guestSessionId) {
        return getGestSessionRatedTvEpisodes(guestSessionId, null, null);
    }

    public enum GetGestSessionRatedTvEpisodesSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetGestSessionRatedTvEpisodesSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetGuestSessionRatedMoviesSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetGuestSessionRatedMoviesSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum GetGuestSessionRatedTvShowsSortByParam {

        @JsonProperty("created_at.asc")
        CREATED_ATASC("created_at.asc"),
        @JsonProperty("created_at.desc")
        CREATED_ATDESC("created_at.desc");
        private final String value;

        GetGuestSessionRatedTvShowsSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

}
