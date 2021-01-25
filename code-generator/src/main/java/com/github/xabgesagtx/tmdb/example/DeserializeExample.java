package com.github.xabgesagtx.tmdb.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

public class DeserializeExample {

    @SneakyThrows
    public static void deserialize() {
        ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();
        Movie movie = objectMapper.readValue(new File("movie-example.json"), Movie.class);
        String movieJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(movie);
        System.out.println(movieJson);
    }
}
