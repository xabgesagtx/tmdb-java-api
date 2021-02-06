
package com.github.xabgesagtx.tmdb.lists;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Lists {

    private final RestClient restClient;

    public Lists(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetListDetailsResponse getListDetails(String listId) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        return null;
    }

    public CheckItemStatusResponse checkItemStatus(String listId) {
        // /list/{list_id}/item_status
        String path = String.format("/list/%s/item_status", listId);
        return null;
    }

    public CreateListResponse createList() {
        // /list
        String path = String.format("/list");
        return null;
    }

    public AddMovieResponse addMovie(String listId) {
        // /list/{list_id}/add_item
        String path = String.format("/list/%s/add_item", listId);
        return null;
    }

    public RemoveMovieResponse removeMovie(String listId) {
        // /list/{list_id}/remove_item
        String path = String.format("/list/%s/remove_item", listId);
        return null;
    }

    public ClearListResponse clearList(String listId) {
        // /list/{list_id}/clear
        String path = String.format("/list/%s/clear", listId);
        return null;
    }

    public DeleteListResponse deleteList(String listId) {
        // /list/{list_id}
        String path = String.format("/list/%s", listId);
        return null;
    }

}
