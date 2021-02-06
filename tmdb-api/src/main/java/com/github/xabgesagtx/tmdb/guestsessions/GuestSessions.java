
package com.github.xabgesagtx.tmdb.guestsessions;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class GuestSessions {

    private final RestClient restClient;

    public GuestSessions(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetGuestSessionRatedMoviesResponse getGuestSessionRatedMovies(String guestSessionId) {
        // /guest_session/{guest_session_id}/rated/movies
        String path = String.format("/guest_session/%s/rated/movies", guestSessionId);
        return null;
    }

    public GetGuestSessionRatedTvShowsResponse getGuestSessionRatedTvShows(String guestSessionId) {
        // /guest_session/{guest_session_id}/rated/tv
        String path = String.format("/guest_session/%s/rated/tv", guestSessionId);
        return null;
    }

    public GetGestSessionRatedTvEpisodesResponse getGestSessionRatedTvEpisodes(String guestSessionId) {
        // /guest_session/{guest_session_id}/rated/tv/episodes
        String path = String.format("/guest_session/%s/rated/tv/episodes", guestSessionId);
        return null;
    }

}
