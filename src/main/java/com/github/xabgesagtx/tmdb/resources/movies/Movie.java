package com.github.xabgesagtx.tmdb.resources.movies;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Jacksonized
@Value
@Builder
public class Movie {

    boolean adult;
    String backdropPath;
    String belongsToCollection;
    int budget;
    List<Genre> genres;
    String homepage;
    int id;
    String imdbId;
    String originalLanguage;
    String originalTitle;
    String overview;
    BigDecimal popularity;
    String posterPath;
    List<ProductionCompany> productionCompanies;
    List<ProductionCountry> productionCountries;
    LocalDate releaseDate;
    int revenue;
    Integer runtime;
    List<SpokenLanguage> spokenLanguages;
    String status;
    String tagline;
    String title;
    boolean video;
    BigDecimal voteAverage;
    int voteCount;

}
