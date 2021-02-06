
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

    /**
     * <p>Get the details of a list.</p>
     * 
     */
    public Optional<GetListDetailsResponse> getListDetails(String listId) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>You can use this method to check if a movie has already been added to the list.</p>
     * 
     */
    public Optional<CheckItemStatusResponse> checkItemStatus(String listId) {
        // /list/{list_id}/item_status
        String path = String.format("/list/%s/item_status", listId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Create a list.</p>
     * 
     */
    public Optional<CreateListResponse> createList() {
        String path = "/list";
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Add a movie to a list.</p>
     * 
     */
    public Optional<AddMovieResponse> addMovie(String listId) {
        // /list/{list_id}/add_item
        String path = String.format("/list/%s/add_item", listId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Remove a movie from a list.</p>
     * 
     */
    public Optional<RemoveMovieResponse> removeMovie(String listId) {
        // /list/{list_id}/remove_item
        String path = String.format("/list/%s/remove_item", listId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Clear all of the items from a list.</p>
     * 
     */
    public Optional<ClearListResponse> clearList(String listId) {
        // /list/{list_id}/clear
        String path = String.format("/list/%s/clear", listId);
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Delete a list.</p>
     * 
     */
    public Optional<DeleteListResponse> deleteList(String listId) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        return restClient.delete(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
