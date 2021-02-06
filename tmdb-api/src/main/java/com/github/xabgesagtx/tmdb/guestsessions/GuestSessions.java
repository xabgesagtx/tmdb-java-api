
package com.github.xabgesagtx.tmdb.guestsessions;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class GuestSessions {

    private final RestClient restClient;

    public GuestSessions(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the rated movies for a guest session.</p>
     * 
     */
    public Optional<GetGuestSessionRatedMoviesResponse> getGuestSessionRatedMovies(String guestSessionId) {
        // /guest_session/{guest_session_id}/rated/movies
        String path = String.format("/guest_session/%s/rated/movies", guestSessionId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the rated TV shows for a guest session.</p>
     * 
     */
    public Optional<GetGuestSessionRatedTvShowsResponse> getGuestSessionRatedTvShows(String guestSessionId) {
        // /guest_session/{guest_session_id}/rated/tv
        String path = String.format("/guest_session/%s/rated/tv", guestSessionId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the rated TV episodes for a guest session.</p>
     * 
     */
    public Optional<GetGestSessionRatedTvEpisodesResponse> getGestSessionRatedTvEpisodes(String guestSessionId) {
        // /guest_session/{guest_session_id}/rated/tv/episodes
        String path = String.format("/guest_session/%s/rated/tv/episodes", guestSessionId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
