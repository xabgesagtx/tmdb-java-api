
package com.github.xabgesagtx.tmdb.lists;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>You can use this method to check if a movie has already been added to the list.</p>
     * 
     */
    public Optional<CheckItemStatusResponse> checkItemStatus(String listId, int movieId) {
        // /list/{list_id}/item_status
        String path = String.format("/list/%s/item_status", listId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("movie_id", movieId);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Create a list.</p>
     * 
     */
    public Optional<CreateListResponse> createList(CreateListRequest createListRequest) {
        String path = "/list";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , createListRequest);
    }

    /**
     * <p>Add a movie to a list.</p>
     * 
     */
    public Optional<AddMovieResponse> addMovie(String listId, AddMovieRequest addMovieRequest) {
        // /list/{list_id}/add_item
        String path = String.format("/list/%s/add_item", listId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , addMovieRequest);
    }

    /**
     * <p>Remove a movie from a list.</p>
     * 
     */
    public Optional<RemoveMovieResponse> removeMovie(String listId, RemoveMovieRequest removeMovieRequest) {
        // /list/{list_id}/remove_item
        String path = String.format("/list/%s/remove_item", listId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , removeMovieRequest);
    }

    /**
     * <p>Clear all of the items from a list.</p>
     * 
     */
    public Optional<ClearListResponse> clearList(String listId, boolean confirm) {
        // /list/{list_id}/clear
        String path = String.format("/list/%s/clear", listId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("confirm", confirm);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , null);
    }

    /**
     * <p>Delete a list.</p>
     * 
     */
    public Optional<DeleteListResponse> deleteList(String listId) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.delete(path, requestParams, new TypeReference<>() {


        }
        , null);
    }

}
