
package com.github.xabgesagtx.tmdb.find;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Find {

    private final RestClient restClient;

    public Find(RestClient restClient) {
        this.restClient = restClient;
    }

    public FindByIdResponse findById(String externalId) {
        // /find/{external_id}
        String path = String.format("/find/%s", externalId);
        return null;
    }

}
