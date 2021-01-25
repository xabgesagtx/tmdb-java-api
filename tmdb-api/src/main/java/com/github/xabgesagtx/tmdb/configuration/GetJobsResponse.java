
package com.github.xabgesagtx.tmdb.configuration;

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
public class GetJobsResponse {

    @JsonProperty("department")
    String department;
    @JsonProperty("jobs")
    List<String> jobs;

}
