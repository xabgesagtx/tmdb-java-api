package com.github.xabgesagtx.tmdb.api;

import com.github.xabgesagtx.tmdb.api.external.ApiSpec;
import com.github.xabgesagtx.tmdb.api.external.EndpointSpec;
import com.github.xabgesagtx.tmdb.api.external.GroupSpec;
import com.github.xabgesagtx.tmdb.codegen.model.Resource;
import lombok.Value;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ApiSpecToResourceConverter {

    public List<Resource> convert(ApiSpec apiSpec) {
        EndpointSpecToEndpointConverter endpointConverter = new EndpointSpecToEndpointConverter(apiSpec.getResources().getSchemas());
        return getGroupsWithEndpoints(apiSpec.getGroups(), apiSpec.getResources().getEndpoints()).stream()
                .map(groupWithEndpoints -> createResource(endpointConverter, groupWithEndpoints))
                .collect(Collectors.toList());
    }

    private Resource createResource(EndpointSpecToEndpointConverter endpointConverter, GroupNameEndpointsPair groupWithEndpoints) {
        return new Resource(groupWithEndpoints.getName(), groupWithEndpoints.getEndpointSpecs().stream()
                .map(endpointConverter::convert)
                .collect(Collectors.toList()));
    }

    List<GroupNameEndpointsPair> getGroupsWithEndpoints(List<GroupSpec> groups, List<EndpointSpec> endpointSpecs) {
        Map<String, EndpointSpec> endpointSpecMap = endpointSpecs.stream().collect(Collectors.toMap(EndpointSpec::getId, Function.identity()));
        return groups.stream().map(group -> {
            List<EndpointSpec> endpoints = group.getItems().stream()
                    .filter(item -> "endpoints".equals(item.getType()))
                    .map(item -> endpointSpecMap.get(item.getModelId()))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            return new GroupNameEndpointsPair(group.getName(), endpoints);
        })
                .filter(GroupNameEndpointsPair::hasEndpoints)
                .collect(Collectors.toList());
    }

    @Value
    private static class GroupNameEndpointsPair {
        String name;
        List<EndpointSpec> endpointSpecs;

        boolean hasEndpoints() {
            return !endpointSpecs.isEmpty();
        }
    }

}
