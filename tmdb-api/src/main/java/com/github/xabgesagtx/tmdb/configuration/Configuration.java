
package com.github.xabgesagtx.tmdb.configuration;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Configuration {

    private final RestClient restClient;

    public Configuration(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the system wide configuration information. Some elements of the API require some knowledge of this configuration data. The purpose of this is to try and keep the actual API responses as light as possible. It is recommended you cache this data within your application and check for updates every few days.</p> 
     * <p>This method currently holds the data relevant to building image URLs as well as the change key map.</p> 
     * <p>To build an image URL, you will need 3 pieces of data. The <code>base_url</code>, <code>size</code> and <code>file_path</code>. Simply combine them all and you will have a fully qualified URL. Here’s an example URL:</p> 
     * <pre><code>https://image.tmdb.org/t/p/w500/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg
     * </code></pre> 
     * <p>The configuration method also contains the list of change keys which can be useful if you are building an app that consumes data from the change feed.</p>
     * 
     */
    public Optional<GetApiConfigurationResponse> getApiConfiguration() {
        String path = "/configuration";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of countries (ISO 3166-1 tags) used throughout TMDb.</p>
     * 
     */
    public Optional<List<GetCountriesResponse>> getCountries() {
        String path = "/configuration/countries";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of the jobs and departments we use on TMDb.</p>
     * 
     */
    public Optional<List<GetJobsResponse>> getJobs() {
        String path = "/configuration/jobs";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of languages (ISO 639-1 tags) used throughout TMDb.</p>
     * 
     */
    public Optional<List<GetLanguagesResponse>> getLanguages() {
        String path = "/configuration/languages";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of the <em>officially</em> supported translations on TMDb.</p> 
     * <p>While it's technically possible to add a translation in any one of the <a href="https://developers.themoviedb.org/3/configuration/get-languages">languages</a> we have added to TMDb (we don't restrict content), the ones listed in this method are the ones we also support for localizing the website with which means they are what we refer to as the "primary" translations.</p> 
     * <p>These are all specified as <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF tags</a> to identify the languages we use on TMDb. There is one exception which is image languages. They are currently only designated by a ISO-639-1 tag. This is a planned upgrade for the future.</p> 
     * <p>We're always open to adding more if you think one should be added. You can ask about getting a new primary translation added by posting on <a href="https://www.themoviedb.org/talk/category/5047951f760ee3318900009a">the forums</a>.</p> 
     * <p>One more thing to mention, these are the translations that map to our website translation project. You can view and contribute to that project <a href="https://www.localeapp.com/projects/8267">here</a>.</p>
     * 
     */
    public Optional<List<String>> getPrimaryTranslations() {
        String path = "/configuration/primary_translations";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of timezones used throughout TMDb.</p>
     * 
     */
    public Optional<List<GetTimezonesResponse>> getTimezones() {
        String path = "/configuration/timezones";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
