package com.github.xabgesagtx.tmdb.resources.movies;

import com.github.xabgesagtx.tmdb.http.RestClient;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
public class MovieResource {

    private final RestClient client;

    public Optional<Movie> findById(int id) {
        String path = "/movie/" + id;
        return client.get(path, Movie.class);
    }

    public Optional<Movie> findById(int id, String language) {
        String path = "/movie/" + id;
        return client.get(path, Map.of("language", language), Movie.class);
    }

}
