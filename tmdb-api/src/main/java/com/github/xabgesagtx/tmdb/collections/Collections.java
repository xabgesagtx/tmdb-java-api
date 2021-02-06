
package com.github.xabgesagtx.tmdb.collections;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Collections {

    private final RestClient restClient;

    public Collections(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetCollectionDetailsResponse getCollectionDetails(Integer collectionId) {
        // /collection/{collection_id}
        String path = String.format("/collection/%s", collectionId);
        return null;
    }

    public GetCollectionImagesResponse getCollectionImages(Integer collectionId) {
        // /collection/{collection_id}/images
        String path = String.format("/collection/%s/images", collectionId);
        return null;
    }

    public GetCollectionTranslationsResponse getCollectionTranslations(Integer collectionId) {
        // /collection/{collection_id}/translations
        String path = String.format("/collection/%s/translations", collectionId);
        return null;
    }

}
