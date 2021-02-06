
package com.github.xabgesagtx.tmdb.configuration;

import java.util.List;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Configuration {

    private final RestClient restClient;

    public Configuration(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetApiConfigurationResponse getApiConfiguration() {
        // /configuration
        String path = String.format("/configuration");
        return null;
    }

    public List<GetCountriesResponse> getCountries() {
        // /configuration/countries
        String path = String.format("/configuration/countries");
        return null;
    }

    public List<GetJobsResponse> getJobs() {
        // /configuration/jobs
        String path = String.format("/configuration/jobs");
        return null;
    }

    public List<GetLanguagesResponse> getLanguages() {
        // /configuration/languages
        String path = String.format("/configuration/languages");
        return null;
    }

    public List<String> getPrimaryTranslations() {
        // /configuration/primary_translations
        String path = String.format("/configuration/primary_translations");
        return null;
    }

    public List<GetTimezonesResponse> getTimezones() {
        // /configuration/timezones
        String path = String.format("/configuration/timezones");
        return null;
    }

}
