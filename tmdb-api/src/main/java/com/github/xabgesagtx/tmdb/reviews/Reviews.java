
package com.github.xabgesagtx.tmdb.reviews;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Reviews {

    private final RestClient restClient;

    public Reviews(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Retrieve the details of a movie or TV show review.</p><a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes <strong>Date</strong> <strong>Change</strong> November 14, 2020 A <code>author_details</code> field has been added to the default response, which includes an <code>avatar_path</code> and <code>rating</code> value.
     * 
     * @param reviewId
     *     reviewId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetReviewDetailsResponse> getReviewDetails(String reviewId) {
        // /review/{review_id}
        String path = String.format("/review/%s", reviewId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
