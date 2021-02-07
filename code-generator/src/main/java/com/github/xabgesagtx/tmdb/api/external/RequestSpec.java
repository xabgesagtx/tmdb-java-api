package com.github.xabgesagtx.tmdb.api.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Jacksonized
@Builder
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
@With
public class RequestSpec {

     ComplexTypeSpec pathParams;
     ComplexTypeSpec headers;
     ComplexTypeSpec queryString;
     List<BodySpec> bodies;
     String path;
     String method;
     String id;

}
