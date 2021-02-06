
package com.github.xabgesagtx.tmdb.networks;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Networks {

    private final RestClient restClient;

    public Networks(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetNetworkDetailsResponse getNetworkDetails(Integer networkId) {
        // /network/{network_id}
        String path = String.format("/network/%s", networkId);
        return null;
    }

    public GetNetworkAlternativeNamesResponse getNetworkAlternativeNames(Integer networkId) {
        // /network/{network_id}/alternative_names
        String path = String.format("/network/%s/alternative_names", networkId);
        return null;
    }

    public GetNetworkImagesResponse getNetworkImages(Integer networkId) {
        // /network/{network_id}/images
        String path = String.format("/network/%s/images", networkId);
        return null;
    }

}
