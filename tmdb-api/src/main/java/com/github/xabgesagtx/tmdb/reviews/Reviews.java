
package com.github.xabgesagtx.tmdb.reviews;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Reviews {

    private final RestClient restClient;

    public Reviews(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetReviewDetailsResponse getReviewDetails(String reviewId) {
        // /review/{review_id}
        String path = String.format("/review/%s", reviewId);
        return null;
    }

}
