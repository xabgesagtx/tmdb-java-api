
package com.github.xabgesagtx.tmdb.certifications;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Certifications {

    private final RestClient restClient;

    public Certifications(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetMovieCertificationsResponse getMovieCertifications() {
        // /certification/movie/list
        String path = String.format("/certification/movie/list");
        return null;
    }

    public GetTvCertificationsResponse getTvCertifications() {
        // /certification/tv/list
        String path = String.format("/certification/tv/list");
        return null;
    }

}
