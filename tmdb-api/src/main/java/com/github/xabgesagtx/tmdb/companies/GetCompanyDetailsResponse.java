
package com.github.xabgesagtx.tmdb.companies;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCompanyDetailsResponse {

    @JsonProperty("description")
    String description;
    @JsonProperty("headquarters")
    String headquarters;
    @JsonProperty("homepage")
    String homepage;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("logo_path")
    String logoPath;
    @JsonProperty("name")
    String name;
    @JsonProperty("origin_country")
    String originCountry;
    @JsonProperty("parent_company")
    Map<String, Object> parentCompany;

}
