
package com.github.xabgesagtx.tmdb.networks;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Networks {

    private final RestClient restClient;

    public Networks(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetNetworkDetailsResponse> getNetworkDetails(int networkId) {
        // /network/{network_id}
        String path = String.format("/network/%s", networkId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetNetworkAlternativeNamesResponse> getNetworkAlternativeNames(int networkId) {
        // /network/{network_id}/alternative_names
        String path = String.format("/network/%s/alternative_names", networkId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetNetworkImagesResponse> getNetworkImages(int networkId) {
        // /network/{network_id}/images
        String path = String.format("/network/%s/images", networkId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
