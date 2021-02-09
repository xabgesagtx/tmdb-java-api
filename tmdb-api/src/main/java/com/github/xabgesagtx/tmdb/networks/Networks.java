
package com.github.xabgesagtx.tmdb.networks;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Networks {

    private final RestClient restClient;

    public Networks(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the details of a network.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     November 14, 2020 The <code>logo_path</code> has been added to the default response.
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetNetworkDetailsResponse> getNetworkDetails(int networkId) {
        // /network/{network_id}
        String path = String.format("/network/%s", networkId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the alternative names of a network.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetNetworkAlternativeNamesResponse> getNetworkAlternativeNames(int networkId) {
        // /network/{network_id}/alternative_names
        String path = String.format("/network/%s/alternative_names", networkId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the TV network logos by id.</p> 
     * <p>There are two image formats that are supported for networks, PNG's and SVG's. You can see which type the original file is by looking at the <code>file_type</code> field. We prefer SVG's as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.</p> 
     * <p>For more information about how SVG's and PNG's can be used, take a read through <a href="https://developers.themoviedb.org/3/getting-started/images">this document</a>.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetNetworkImagesResponse> getNetworkImages(int networkId) {
        // /network/{network_id}/images
        String path = String.format("/network/%s/images", networkId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
