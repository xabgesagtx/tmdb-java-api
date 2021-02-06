
package com.github.xabgesagtx.tmdb.certifications;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Certifications {

    private final RestClient restClient;

    public Certifications(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetMovieCertificationsResponse> getMovieCertifications() {
        String path = "/certification/movie/list";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTvCertificationsResponse> getTvCertifications() {
        String path = "/certification/tv/list";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
