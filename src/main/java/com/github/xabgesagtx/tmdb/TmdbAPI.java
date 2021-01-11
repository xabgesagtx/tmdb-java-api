package com.github.xabgesagtx.tmdb;

import com.github.xabgesagtx.tmdb.resources.configuration.ConfigurationResource;
import com.github.xabgesagtx.tmdb.http.RestClientImpl;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.resources.movies.MovieResource;

public class TmdbAPI {

    private final ConfigurationResource configuration;
    private final MovieResource movies;

    public TmdbAPI(String apiKey) {
        this(new RestClientImpl(apiKey));
    }

    public TmdbAPI(RestClient client) {
        this.configuration = new ConfigurationResource(client);
        this.movies = new MovieResource(client);
    }

    public ConfigurationResource configuration() {
        return configuration;
    }

    public MovieResource movies() {
        return movies;
    }

}
