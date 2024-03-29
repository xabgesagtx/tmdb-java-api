
package com.github.xabgesagtx.tmdb.companies;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Companies {

    private final RestClient restClient;

    public Companies(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get a companies details by id.</p>
     * 
     * @param companyId
     *     companyId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCompanyDetailsResponse> getCompanyDetails(int companyId) {
        // /company/{company_id}
        String path = String.format("/company/%s", companyId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the alternative names of a company.</p>
     * 
     * @param companyId
     *     companyId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCompanyAlternativeNamesResponse> getCompanyAlternativeNames(int companyId) {
        // /company/{company_id}/alternative_names
        String path = String.format("/company/%s/alternative_names", companyId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a companies logos by id.</p>
     * <p>There are two image formats that are supported for companies, PNG's and SVG's. You can see which type the original file is by looking at the <code>file_type</code> field. We prefer SVG's as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.</p>
     * <p>For more information about how SVG's and PNG's can be used, take a read through <a href="https://developers.themoviedb.org/3/getting-started/images">this document</a>.</p>
     * 
     * @param companyId
     *     companyId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCompanyImagesResponse> getCompanyImages(int companyId) {
        // /company/{company_id}/images
        String path = String.format("/company/%s/images", companyId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
