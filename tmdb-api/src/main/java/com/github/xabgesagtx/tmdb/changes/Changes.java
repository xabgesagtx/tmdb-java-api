
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

    public Optional<GetMovieChangeListResponse> getMovieChangeList() {
        String path = "/movie/changes";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvChangeListResponse> getTvChangeList() {
        String path = "/tv/changes";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPersonChangeListResponse> getPersonChangeList() {
        String path = "/person/changes";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
