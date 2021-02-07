
package com.github.xabgesagtx.tmdb.credits;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Credits {

    private final RestClient restClient;

    public Credits(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get a movie or TV credit details by id.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     July 13, 2018 Movie credits are now supported.
     * 
     */
    public Optional<GetCreditDetailsResponse> getCreditDetails(String creditId) {
        // /credit/{credit_id}
        String path = String.format("/credit/%s", creditId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
