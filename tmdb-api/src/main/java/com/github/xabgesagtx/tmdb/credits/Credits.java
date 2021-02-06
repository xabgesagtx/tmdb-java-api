
package com.github.xabgesagtx.tmdb.credits;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Credits {

    private final RestClient restClient;

    public Credits(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetCreditDetailsResponse> getCreditDetails(String creditId) {
        // /credit/{credit_id}
        String path = String.format("/credit/%s", creditId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
