
package com.github.xabgesagtx.tmdb.companies;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCompanyAlternativeNamesResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    List<GetCompanyAlternativeNamesResponse.Result> results;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("name")
        String name;
        @JsonProperty("type")
        String type;

    }

}
