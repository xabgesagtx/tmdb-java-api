
package com.github.xabgesagtx.tmdb.credits;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Credits {

    private final RestClient restClient;

    public Credits(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetCreditDetailsResponse getCreditDetails(String creditId) {
        // /credit/{credit_id}
        String path = String.format("/credit/%s", creditId);
        return null;
    }

}
