
package com.github.xabgesagtx.tmdb.trending;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Trending {

    private final RestClient restClient;

    public Trending(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetTrendingResponse> getTrending(String mediaType, String timeWindow) {
        // /trending/{media_type}/{time_window}
        String path = String.format("/trending/%s/%s", mediaType, timeWindow);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
