package com.github.xabgesagtx.tmdb.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.xabgesagtx.tmdb.api.external.ComplexTypeSpec;
import com.github.xabgesagtx.tmdb.api.external.SchemaSpec;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RefTypeResolver {

    @Getter
    private final Map<String, ComplexTypeSpec> refTypes;

    public RefTypeResolver(List<SchemaSpec> specs) {
        this.refTypes = createRefTypes(specs);
    }

    public ComplexTypeSpec resolveRefs(ComplexTypeSpec spec) {
        return resolveRefs(spec, refTypes);
    }

    private Map<String, ComplexTypeSpec> createRefTypes(List<SchemaSpec> specs) {
        Map<String, ComplexTypeSpec> initialRefs = specs.stream().collect(Collectors.toMap(SchemaSpec::getNamespace, SchemaSpec::getDefinition));
        return specs.stream().collect(Collectors.toMap(SchemaSpec::getNamespace, spec -> resolveRefs(spec.getDefinition(), initialRefs)));
    }

    private ComplexTypeSpec resolveRefs(ComplexTypeSpec spec, Map<String, ComplexTypeSpec> refs) {
        if (spec.getRef() != null) {
            return refs.getOrDefault(spec.getRef(), spec);
        } else if (spec.getProperties() != null) {
            Map<String, ComplexTypeSpec> fixedProperties = resolveRefs(spec.getProperties(), refs);
            spec.setProperties(fixedProperties);
            return spec;
        } else if (spec.getItems() != null) {
            ComplexTypeSpec fixedItems = resolveRefs(spec.getItems(), refs);
            spec.setItems(fixedItems);
            return spec;
        } else {
            return spec;
        }
    }

    private Map<String, ComplexTypeSpec> resolveRefs(Map<String, ComplexTypeSpec> properties, Map<String, ComplexTypeSpec> refs) {
        return properties.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> resolveRefs(entry.getValue(), refs)));
    }
}
