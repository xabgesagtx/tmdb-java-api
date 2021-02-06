
package com.github.xabgesagtx.tmdb.reviews;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Reviews {

    private final RestClient restClient;

    public Reviews(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetReviewDetailsResponse> getReviewDetails(String reviewId) {
        // /review/{review_id}
        String path = String.format("/review/%s", reviewId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
