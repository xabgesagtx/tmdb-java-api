
package com.github.xabgesagtx.tmdb.lists;


public class Lists {


    public GetListDetailsResponse getListDetails() {
        String path = "/list/{list_id}";
        return null;
    }

    public CheckItemStatusResponse checkItemStatus() {
        String path = "/list/{list_id}/item_status";
        return null;
    }

    public CreateListResponse createList() {
        String path = "/list";
        return null;
    }

    public AddMovieResponse addMovie() {
        String path = "/list/{list_id}/add_item";
        return null;
    }

    public RemoveMovieResponse removeMovie() {
        String path = "/list/{list_id}/remove_item";
        return null;
    }

    public ClearListResponse clearList() {
        String path = "/list/{list_id}/clear";
        return null;
    }

    public DeleteListResponse deleteList() {
        String path = "/list/{list_id}";
        return null;
    }

}
