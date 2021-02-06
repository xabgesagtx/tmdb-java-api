
package com.github.xabgesagtx.tmdb.companies;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Companies {

    private final RestClient restClient;

    public Companies(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetCompanyDetailsResponse getCompanyDetails(Integer companyId) {
        // /company/{company_id}
        String path = String.format("/company/%s", companyId);
        return null;
    }

    public GetCompanyAlternativeNamesResponse getCompanyAlternativeNames(Integer companyId) {
        // /company/{company_id}/alternative_names
        String path = String.format("/company/%s/alternative_names", companyId);
        return null;
    }

    public GetCompanyImagesResponse getCompanyImages(Integer companyId) {
        // /company/{company_id}/images
        String path = String.format("/company/%s/images", companyId);
        return null;
    }

}
