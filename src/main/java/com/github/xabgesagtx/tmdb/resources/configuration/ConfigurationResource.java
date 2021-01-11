package com.github.xabgesagtx.tmdb.resources.configuration;

import lombok.RequiredArgsConstructor;
import com.github.xabgesagtx.tmdb.http.RestClient;

import java.util.Optional;

@RequiredArgsConstructor
public class ConfigurationResource {

    private final RestClient client;

    Optional<TmdbConfiguration> getConfiguration() {
        return client.get("/configuration", TmdbConfiguration.class);
    }
}
