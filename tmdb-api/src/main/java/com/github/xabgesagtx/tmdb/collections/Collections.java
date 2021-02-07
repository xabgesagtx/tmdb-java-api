
package com.github.xabgesagtx.tmdb.collections;

import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Collections {

    private final RestClient restClient;

    public Collections(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get collection details by id.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     March 16, 2018 Added the <a href="https://developers.themoviedb.org/3/collections/get-collection-translations">translations</a> method.
     * 
     */
    public Optional<GetCollectionDetailsResponse> getCollectionDetails(int collectionId) {
        // /collection/{collection_id}
        String path = String.format("/collection/%s", collectionId);
        Map<String, Object> requestParams = java.util.Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images for a collection by id.</p>
     * 
     */
    public Optional<GetCollectionImagesResponse> getCollectionImages(int collectionId) {
        // /collection/{collection_id}/images
        String path = String.format("/collection/%s/images", collectionId);
        Map<String, Object> requestParams = java.util.Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list translations for a collection by id.</p>
     * 
     */
    public Optional<GetCollectionTranslationsResponse> getCollectionTranslations(int collectionId) {
        // /collection/{collection_id}/translations
        String path = String.format("/collection/%s/translations", collectionId);
        Map<String, Object> requestParams = java.util.Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

}
