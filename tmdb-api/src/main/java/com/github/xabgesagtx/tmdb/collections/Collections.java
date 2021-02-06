
package com.github.xabgesagtx.tmdb.collections;

import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Collections {

    private final RestClient restClient;

    public Collections(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetCollectionDetailsResponse> getCollectionDetails(int collectionId) {
        // /collection/{collection_id}
        String path = String.format("/collection/%s", collectionId);
        return restClient.get(path, java.util.Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetCollectionImagesResponse> getCollectionImages(int collectionId) {
        // /collection/{collection_id}/images
        String path = String.format("/collection/%s/images", collectionId);
        return restClient.get(path, java.util.Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetCollectionTranslationsResponse> getCollectionTranslations(int collectionId) {
        // /collection/{collection_id}/translations
        String path = String.format("/collection/%s/translations", collectionId);
        return restClient.get(path, java.util.Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
