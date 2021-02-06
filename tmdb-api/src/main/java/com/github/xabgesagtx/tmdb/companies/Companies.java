
package com.github.xabgesagtx.tmdb.companies;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Companies {

    private final RestClient restClient;

    public Companies(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetCompanyDetailsResponse> getCompanyDetails(int companyId) {
        // /company/{company_id}
        String path = String.format("/company/%s", companyId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetCompanyAlternativeNamesResponse> getCompanyAlternativeNames(int companyId) {
        // /company/{company_id}/alternative_names
        String path = String.format("/company/%s/alternative_names", companyId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetCompanyImagesResponse> getCompanyImages(int companyId) {
        // /company/{company_id}/images
        String path = String.format("/company/%s/images", companyId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
