
package com.github.xabgesagtx.tmdb.configuration;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Configuration {

    private final RestClient restClient;

    public Configuration(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetApiConfigurationResponse> getApiConfiguration() {
        String path = "/configuration";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<List<GetCountriesResponse>> getCountries() {
        String path = "/configuration/countries";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<List<GetJobsResponse>> getJobs() {
        String path = "/configuration/jobs";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<List<GetLanguagesResponse>> getLanguages() {
        String path = "/configuration/languages";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<List<String>> getPrimaryTranslations() {
        String path = "/configuration/primary_translations";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<List<GetTimezonesResponse>> getTimezones() {
        String path = "/configuration/timezones";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
