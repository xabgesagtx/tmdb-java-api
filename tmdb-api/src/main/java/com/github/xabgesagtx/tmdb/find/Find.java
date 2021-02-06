
package com.github.xabgesagtx.tmdb.find;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Find {

    private final RestClient restClient;

    public Find(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<FindByIdResponse> findById(String externalId) {
        // /find/{external_id}
        String path = String.format("/find/%s", externalId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
