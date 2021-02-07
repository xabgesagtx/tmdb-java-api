package com.github.xabgesagtx.tmdb.api.external;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Map;

// TODO: Find a way to make this class immutable (currently issues with Jackson custom serialisation)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComplexTypeSpec {
    private Map<String, ComplexTypeSpec> properties;
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private List<String> type;
    @JsonProperty("$ref")
    private String ref;
    @JsonProperty("enum")
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private List<String> enumValues;
    private ComplexTypeSpec items;
    private String format;
    private List<String> required;
    private List<ComplexTypeSpec> oneOf;

}
