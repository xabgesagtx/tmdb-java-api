
package com.github.xabgesagtx.tmdb.certifications;

import java.util.Collections;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Certifications {

    private final RestClient restClient;

    public Certifications(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get an up to date list of the officially supported movie certifications on TMDb.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetMovieCertificationsResponse getMovieCertifications() {
        String path = "/certification/movie/list";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get an up to date list of the officially supported TV show certifications on TMDb.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTvCertificationsResponse getTvCertifications() {
        String path = "/certification/tv/list";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
