
package com.github.xabgesagtx.tmdb.find;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Find {

    private final RestClient restClient;

    public Find(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>The find method makes it easy to search for objects in our database by an external id. For example, an IMDB ID.</p> 
     * <p>This method will search all objects (movies, TV shows and people) and return the results in a single response.</p> 
     * <p>The supported external sources for each object are as follows.</p> <a href="https://developers.themoviedb.org/#media-databases">\ud83d\udd17</a> Media Databases     Movies TV Shows TV Seasons TV Episodes People     IMDb ID ✓ ✓ ✗ ✓ ✓   TVDB ID ✗ ✓ ✓ ✓ ✗   Freebase MID* ✗ ✓ ✓ ✓ ✓   Freebase ID* ✗ ✓ ✓ ✓ ✓   TVRage ID* ✗ ✓ ✓ ✓ ✓    <a href="https://developers.themoviedb.org/#social-ids">\ud83d\udd17</a> Social IDs     Movies TV Shows TV Seasons TV Episodes People     Facebook ✓ ✓ ✗ ✗ ✓   Instagram ✓ ✓ ✗ ✗ ✓   Twitter ✓ ✓ ✗ ✗ ✓    
     * <p>*Defunct or no longer available as a service.</p>
     * 
     * @param externalId
     *     externalId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param externalSource
     *     externalSource
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public FindByIdResponse findById(String externalId, Find.FindByIdExternalSourceParam externalSource, String language) {
        // /find/{external_id}
        String path = String.format("/find/%s", externalId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("external_source", externalSource);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>The find method makes it easy to search for objects in our database by an external id. For example, an IMDB ID.</p> 
     * <p>This method will search all objects (movies, TV shows and people) and return the results in a single response.</p> 
     * <p>The supported external sources for each object are as follows.</p> <a href="https://developers.themoviedb.org/#media-databases">\ud83d\udd17</a> Media Databases     Movies TV Shows TV Seasons TV Episodes People     IMDb ID ✓ ✓ ✗ ✓ ✓   TVDB ID ✗ ✓ ✓ ✓ ✗   Freebase MID* ✗ ✓ ✓ ✓ ✓   Freebase ID* ✗ ✓ ✓ ✓ ✓   TVRage ID* ✗ ✓ ✓ ✓ ✓    <a href="https://developers.themoviedb.org/#social-ids">\ud83d\udd17</a> Social IDs     Movies TV Shows TV Seasons TV Episodes People     Facebook ✓ ✓ ✗ ✗ ✓   Instagram ✓ ✓ ✗ ✗ ✓   Twitter ✓ ✓ ✗ ✗ ✓    
     * <p>*Defunct or no longer available as a service.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public FindByIdResponse findById(String externalId, Find.FindByIdExternalSourceParam externalSource) {
        return findById(externalId, externalSource, null);
    }

    public enum FindByIdExternalSourceParam {

        @JsonProperty("imdb_id")
        IMDB_ID("imdb_id"),
        @JsonProperty("freebase_mid")
        FREEBASE_MID("freebase_mid"),
        @JsonProperty("freebase_id")
        FREEBASE_ID("freebase_id"),
        @JsonProperty("tvdb_id")
        TVDB_ID("tvdb_id"),
        @JsonProperty("tvrage_id")
        TVRAGE_ID("tvrage_id"),
        @JsonProperty("facebook_id")
        FACEBOOK_ID("facebook_id"),
        @JsonProperty("twitter_id")
        TWITTER_ID("twitter_id"),
        @JsonProperty("instagram_id")
        INSTAGRAM_ID("instagram_id");
        private final String value;

        FindByIdExternalSourceParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

}
