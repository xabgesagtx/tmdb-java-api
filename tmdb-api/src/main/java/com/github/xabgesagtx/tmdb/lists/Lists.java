
package com.github.xabgesagtx.tmdb.lists;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Lists {

    private final RestClient restClient;

    public Lists(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the details of a list.</p>
     * 
     * @param listId
     *     listId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetListDetailsResponse> getListDetails(String listId, String language) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the details of a list.</p>
     * 
     * @param listId
     *     listId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetListDetailsResponse> getListDetails(String listId) {
        return getListDetails(listId, null);
    }

    /**
     * <p>You can use this method to check if a movie has already been added to the list.</p>
     * 
     * @param listId
     *     listId
     * @param movieId
     *     movieId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public CheckItemStatusResponse checkItemStatus(String listId, int movieId) {
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
     * @param createListRequest
     *     createListRequest
     * @param sessionId
     *     sessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public CreateListResponse createList(CreateListRequest createListRequest, String sessionId) {
        String path = "/list";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , createListRequest);
    }

    /**
     * <p>Add a movie to a list.</p>
     * 
     * @param listId
     *     listId
     * @param addMovieRequest
     *     addMovieRequest
     * @param sessionId
     *     sessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public AddMovieResponse addMovie(String listId, AddMovieRequest addMovieRequest, String sessionId) {
        // /list/{list_id}/add_item
        String path = String.format("/list/%s/add_item", listId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , addMovieRequest);
    }

    /**
     * <p>Remove a movie from a list.</p>
     * 
     * @param listId
     *     listId
     * @param removeMovieRequest
     *     removeMovieRequest
     * @param sessionId
     *     sessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public RemoveMovieResponse removeMovie(String listId, RemoveMovieRequest removeMovieRequest, String sessionId) {
        // /list/{list_id}/remove_item
        String path = String.format("/list/%s/remove_item", listId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , removeMovieRequest);
    }

    /**
     * <p>Clear all of the items from a list.</p>
     * 
     * @param listId
     *     listId
     * @param confirm
     *     confirm
     * @param sessionId
     *     sessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public ClearListResponse clearList(String listId, boolean confirm, String sessionId) {
        // /list/{list_id}/clear
        String path = String.format("/list/%s/clear", listId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("confirm", confirm);
        requestParams.put("session_id", sessionId);
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , null);
    }

    /**
     * <p>Delete a list.</p>
     * 
     * @param listId
     *     listId
     * @param sessionId
     *     sessionId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public DeleteListResponse deleteList(String listId, String sessionId) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("session_id", sessionId);
        return restClient.delete(path, requestParams, new TypeReference<>() {


        }
        , null);
    }

}
