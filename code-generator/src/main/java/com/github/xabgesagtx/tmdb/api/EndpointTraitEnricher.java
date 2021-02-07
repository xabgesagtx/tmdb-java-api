package com.github.xabgesagtx.tmdb.api;

import com.github.xabgesagtx.tmdb.api.external.EndpointSpec;
import com.github.xabgesagtx.tmdb.api.external.TraitSpec;

import java.util.List;

public class EndpointTraitEnricher {

    private final List<TraitSpec> traits;

    public EndpointTraitEnricher(List<TraitSpec> traits) {
        this.traits = traits;
    }

    EndpointSpec enrich(EndpointSpec spec) {
        return spec;
    }
}
