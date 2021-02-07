package com.github.xabgesagtx.tmdb.api;

import com.github.xabgesagtx.tmdb.api.external.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class EndpointTraitEnricher {

    private final Map<String, TraitSpec> traits;

    public EndpointTraitEnricher(List<TraitSpec> traits) {
        this.traits = traits.stream()
                .collect(Collectors.toMap(TraitSpec::getId, Function.identity()));
    }

    EndpointSpec enrich(EndpointSpec endpointSpec) {
        return endpointSpec.getTraits().stream()
                .flatMap(key -> {
                    TraitSpec traitSpec = traits.get(key);
                    if (traitSpec == null) {
                        log.warn("Cannot find trait {} for endpoint {}", key, endpointSpec.getName());
                        return Stream.empty();
                    } else {
                        return Stream.of(traitSpec);
                    }
                })
                .reduce(endpointSpec, this::enrichWithTrait, (oldSpec, newSpec) -> newSpec);
    }

    private EndpointSpec enrichWithTrait(EndpointSpec spec, TraitSpec trait) {
        RequestSpec request = enrichRequest(spec.getRequest(), trait);
        List<ResponseSpec> responses = enrichResponses(spec.getResponses(), trait);
        return spec.withRequest(request).withResponses(responses);
    }

    private List<ResponseSpec> enrichResponses(List<ResponseSpec> responses, TraitSpec trait) {
        ArrayList<ResponseSpec> enrichedResponses = new ArrayList<>(responses);
        enrichedResponses.addAll(trait.getResponses());
        return enrichedResponses;
    }

    private RequestSpec enrichRequest(RequestSpec request, TraitSpec trait) {
        ComplexTypeSpec queryString = enrichQueryString(request.getQueryString(), trait);
        return request.withQueryString(queryString);
    }

    private ComplexTypeSpec enrichQueryString(ComplexTypeSpec queryString, TraitSpec trait) {
        Map<String, ComplexTypeSpec> traitProperties = trait.getRequest().getQueryString().getProperties();
        if (traitProperties != null && !traitProperties.isEmpty()) {
            Map<String, ComplexTypeSpec> newProperties;
            if (queryString.getProperties() == null) {
                newProperties = new HashMap<>();
            } else {
                newProperties = new HashMap<>(queryString.getProperties());
            }
            newProperties.putAll(traitProperties);
            queryString.setProperties(newProperties);
        }
        List<String> traitRequired = trait.getRequest().getQueryString().getRequired();
        if (traitRequired != null && !traitRequired.isEmpty()) {
            List<String> newRequired;
            if (queryString.getRequired() == null) {
                newRequired = new ArrayList<>();
            } else {
                newRequired = new ArrayList<>(queryString.getRequired());
            }
            newRequired.addAll(traitRequired);
            queryString.setRequired(newRequired);
        }
        return queryString;
    }
}
