
package com.github.xabgesagtx.tmdb.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Collections {

    private final RestClient restClient;

    public Collections(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get collection details by id.</p>
     * <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 16, 2018 Added the <a href="https://developers.themoviedb.org/3/collections/get-collection-translations">translations</a> method.
     * 
     * @param collectionId
     *     collectionId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCollectionDetailsResponse> getCollectionDetails(int collectionId, String language) {
        // /collection/{collection_id}
        String path = String.format("/collection/%s", collectionId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get collection details by id.</p>
     * <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 16, 2018 Added the <a href="https://developers.themoviedb.org/3/collections/get-collection-translations">translations</a> method.
     * 
     * @param collectionId
     *     collectionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCollectionDetailsResponse> getCollectionDetails(int collectionId) {
        return getCollectionDetails(collectionId, null);
    }

    /**
     * <p>Get the images for a collection by id.</p>
     * 
     * @param collectionId
     *     collectionId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCollectionImagesResponse> getCollectionImages(int collectionId, String language) {
        // /collection/{collection_id}/images
        String path = String.format("/collection/%s/images", collectionId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images for a collection by id.</p>
     * 
     * @param collectionId
     *     collectionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCollectionImagesResponse> getCollectionImages(int collectionId) {
        return getCollectionImages(collectionId, null);
    }

    /**
     * <p>Get the list translations for a collection by id.</p>
     * 
     * @param collectionId
     *     collectionId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCollectionTranslationsResponse> getCollectionTranslations(int collectionId, String language) {
        // /collection/{collection_id}/translations
        String path = String.format("/collection/%s/translations", collectionId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list translations for a collection by id.</p>
     * 
     * @param collectionId
     *     collectionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetCollectionTranslationsResponse> getCollectionTranslations(int collectionId) {
        return getCollectionTranslations(collectionId, null);
    }

}
