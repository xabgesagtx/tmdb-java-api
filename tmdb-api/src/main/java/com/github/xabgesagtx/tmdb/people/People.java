
package com.github.xabgesagtx.tmdb.people;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class People {

    private final RestClient restClient;

    public People(RestClient restClient) {
        this.restClient = restClient;
    }

    public GetPersonDetailsResponse getPersonDetails(Integer personId) {
        // /person/{person_id}
        String path = String.format("/person/%s", personId);
        return null;
    }

    public GetPersonChangesResponse getPersonChanges(Integer personId) {
        // /person/{person_id}/changes
        String path = String.format("/person/%s/changes", personId);
        return null;
    }

    public GetPersonMovieCreditsResponse getPersonMovieCredits(Integer personId) {
        // /person/{person_id}/movie_credits
        String path = String.format("/person/%s/movie_credits", personId);
        return null;
    }

    public GetPersonTvCreditsResponse getPersonTvCredits(Integer personId) {
        // /person/{person_id}/tv_credits
        String path = String.format("/person/%s/tv_credits", personId);
        return null;
    }

    public GetPersonCombinedCreditsResponse getPersonCombinedCredits(Integer personId) {
        // /person/{person_id}/combined_credits
        String path = String.format("/person/%s/combined_credits", personId);
        return null;
    }

    public GetPersonExternalIdsResponse getPersonExternalIds(Integer personId) {
        // /person/{person_id}/external_ids
        String path = String.format("/person/%s/external_ids", personId);
        return null;
    }

    public GetPersonImagesResponse getPersonImages(Integer personId) {
        // /person/{person_id}/images
        String path = String.format("/person/%s/images", personId);
        return null;
    }

    public GetTaggedImagesResponse getTaggedImages(Integer personId) {
        // /person/{person_id}/tagged_images
        String path = String.format("/person/%s/tagged_images", personId);
        return null;
    }

    public GetPersonTranslationsResponse getPersonTranslations(Integer personId) {
        // /person/{person_id}/translations
        String path = String.format("/person/%s/translations", personId);
        return null;
    }

    public GetLatestPersonResponse getLatestPerson() {
        // /person/latest
        String path = String.format("/person/latest");
        return null;
    }

    public GetPopularPeopleResponse getPopularPeople() {
        // /person/popular
        String path = String.format("/person/popular");
        return null;
    }

}
