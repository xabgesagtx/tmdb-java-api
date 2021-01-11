package com.github.xabgesagtx.tmdb.resources.movies;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.xabgesagtx.tmdb.resources.BaseTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.lanwen.wiremock.ext.WiremockResolver;
import ru.lanwen.wiremock.ext.WiremockResolver.Wiremock;
import ru.lanwen.wiremock.ext.WiremockUriResolver;
import ru.lanwen.wiremock.ext.WiremockUriResolver.WiremockUri;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith({
        WiremockResolver.class,
        WiremockUriResolver.class
})
class MovieResourceTest extends BaseTest {

    @Test
    void findById(@Wiremock WireMockServer server, @WiremockUri String uri) {
        MovieResource movieResource = new MovieResource(createRestClient(uri));
        server.stubFor(get(urlPathEqualTo("/movie/1"))
                .withQueryParam("api_key", equalTo(API_KEY))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody(readFile("/movies/movie.json"))));
        Optional<Movie> response = movieResource.findById(1);
        server.verify(getRequestedFor(urlPathEqualTo("/movie/1")));
        Movie expected = createMovie();
        assertThat(response)
                .isPresent()
                .contains(expected);
    }

    @Test
    void testFindById(@Wiremock WireMockServer server, @WiremockUri String uri) {
        MovieResource movieResource = new MovieResource(createRestClient(uri));
        String language = "en";
        server.stubFor(get(urlPathEqualTo("/movie/1"))
                .withQueryParam("language", equalTo(language))
                .withQueryParam("api_key", equalTo(API_KEY))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody(readFile("/movies/movie.json"))));
        Optional<Movie> response = movieResource.findById(1, language);
        server.verify(getRequestedFor(urlPathEqualTo("/movie/1")));
        Movie expected = createMovie();
        assertThat(response)
                .isPresent()
                .contains(expected);
    }

    private Movie createMovie() {
        return Movie.builder()
                .adult(false)
                .backdropPath("/backdrop.jpg")
                .belongsToCollection("collection")
                .budget(0)
                .genres(List.of(new Genre(27, "Horror"), new Genre(53, "Thriller")))
                .homepage("")
                .id(5752)
                .imdbId("tt0091339")
                .originalLanguage("en")
                .originalTitle("Killer Workout")
                .overview("Two years ago...")
                .popularity(new BigDecimal("4.399"))
                .posterPath("/poster.jpg")
                .productionCompanies(List.of(ProductionCompany.builder()
                        .id(39635)
                        .name("Entertainment")
                        .logoPath("/logo.jpg")
                        .originCountry("US")
                        .build()))
                .productionCountries(List.of(ProductionCountry.builder()
                        .iso3166_1("US")
                        .name("United States of America")
                        .build()))
                .releaseDate(LocalDate.of(1987, 4, 16))
                .revenue(0)
                .runtime(84)
                .spokenLanguages(List.of(SpokenLanguage.builder()
                        .iso639_1("en")
                        .name("English")
                        .englishName("English")
                        .build()))
                .status("Released")
                .tagline("The workout will kill you!")
                .title("Killer Workout")
                .video(false)
                .voteAverage(new BigDecimal("5.0"))
                .voteCount(32)
                .build();
    }
}