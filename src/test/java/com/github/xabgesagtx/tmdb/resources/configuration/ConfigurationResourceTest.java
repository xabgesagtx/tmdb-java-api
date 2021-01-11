package com.github.xabgesagtx.tmdb.resources.configuration;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.xabgesagtx.tmdb.resources.BaseTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.lanwen.wiremock.ext.WiremockResolver;
import ru.lanwen.wiremock.ext.WiremockResolver.Wiremock;
import ru.lanwen.wiremock.ext.WiremockUriResolver;
import ru.lanwen.wiremock.ext.WiremockUriResolver.WiremockUri;

import java.util.List;
import java.util.Optional;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith({
        WiremockResolver.class,
        WiremockUriResolver.class
})
class ConfigurationResourceTest extends BaseTest {

    @Test
    void getConfiguration(@Wiremock WireMockServer server, @WiremockUri String uri) {
        ConfigurationResource configuration = new ConfigurationResource(createRestClient(uri));
        server.stubFor(get(urlPathEqualTo("/configuration"))
                .withQueryParam("api_key", equalTo(API_KEY))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody(readFile("/configuration/configuration.json"))
                ));

        Optional<TmdbConfiguration> response = configuration.getConfiguration();

        TmdbConfiguration expected = createConfiguration();

        assertThat(response)
                .isPresent()
                .contains(expected);

        server.verify(getRequestedFor(urlPathEqualTo("/configuration")));
    }

    private TmdbConfiguration createConfiguration() {
        return TmdbConfiguration.builder()
                .changeKeys(List.of("air_date", "also_known_as"))
                .images(ImageConfiguration.builder()
                        .baseUrl("http://image.tmdb.org/t/p/")
                        .secureBaseUrl("https://image.tmdb.org/t/p/")
                        .backdropSizes(List.of("w300", "w780", "w1280", "original"))
                        .logoSizes(List.of("w45", "w92", "w154", "w185", "w300", "w500", "original"))
                        .posterSizes(List.of("w92",
                                "w154",
                                "w185",
                                "w342",
                                "w500",
                                "w780",
                                "original"))
                        .profileSizes(List.of("w45",
                                "w185",
                                "h632",
                                "original"))
                        .stillSizes(List.of( "w92",
                                "w185",
                                "w300",
                                "original"))
                        .build())
                .build();
    }

}