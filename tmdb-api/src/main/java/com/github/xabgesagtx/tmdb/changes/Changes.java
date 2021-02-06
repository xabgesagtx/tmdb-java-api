
package com.github.xabgesagtx.tmdb.changes;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Changes {

    private final RestClient restClient;

    public Changes(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get a list of all of the movie ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     */
    public Optional<GetMovieChangeListResponse> getMovieChangeList() {
        String path = "/movie/changes";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all of the TV show ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     */
    public Optional<GetTvChangeListResponse> getTvChangeList() {
        String path = "/tv/changes";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of all of the person ids that have been changed in the past 24 hours.</p> 
     * <p>You can query it for up to 14 days worth of changed IDs at a time with the <code>start_date</code> and <code>end_date</code> query parameters. 100 items are returned per page.</p>
     * 
     */
    public Optional<GetPersonChangeListResponse> getPersonChangeList() {
        String path = "/person/changes";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
