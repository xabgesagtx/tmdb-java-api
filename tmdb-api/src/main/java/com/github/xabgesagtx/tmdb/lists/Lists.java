
package com.github.xabgesagtx.tmdb.lists;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Lists {

    private final RestClient restClient;

    public Lists(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetListDetailsResponse> getListDetails(String listId) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<CheckItemStatusResponse> checkItemStatus(String listId) {
        // /list/{list_id}/item_status
        String path = String.format("/list/%s/item_status", listId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<CreateListResponse> createList() {
        String path = "/list";
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<AddMovieResponse> addMovie(String listId) {
        // /list/{list_id}/add_item
        String path = String.format("/list/%s/add_item", listId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<RemoveMovieResponse> removeMovie(String listId) {
        // /list/{list_id}/remove_item
        String path = String.format("/list/%s/remove_item", listId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<ClearListResponse> clearList(String listId) {
        // /list/{list_id}/clear
        String path = String.format("/list/%s/clear", listId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<DeleteListResponse> deleteList(String listId) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        return restClient.delete(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
