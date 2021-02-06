
package com.github.xabgesagtx.tmdb.people;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class People {

    private final RestClient restClient;

    public People(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<GetPersonDetailsResponse> getPersonDetails(int personId) {
        // /person/{person_id}
        String path = String.format("/person/%s", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPersonChangesResponse> getPersonChanges(int personId) {
        // /person/{person_id}/changes
        String path = String.format("/person/%s/changes", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPersonMovieCreditsResponse> getPersonMovieCredits(int personId) {
        // /person/{person_id}/movie_credits
        String path = String.format("/person/%s/movie_credits", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPersonTvCreditsResponse> getPersonTvCredits(int personId) {
        // /person/{person_id}/tv_credits
        String path = String.format("/person/%s/tv_credits", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPersonCombinedCreditsResponse> getPersonCombinedCredits(int personId) {
        // /person/{person_id}/combined_credits
        String path = String.format("/person/%s/combined_credits", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPersonExternalIdsResponse> getPersonExternalIds(int personId) {
        // /person/{person_id}/external_ids
        String path = String.format("/person/%s/external_ids", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPersonImagesResponse> getPersonImages(int personId) {
        // /person/{person_id}/images
        String path = String.format("/person/%s/images", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetTaggedImagesResponse> getTaggedImages(int personId) {
        // /person/{person_id}/tagged_images
        String path = String.format("/person/%s/tagged_images", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPersonTranslationsResponse> getPersonTranslations(int personId) {
        // /person/{person_id}/translations
        String path = String.format("/person/%s/translations", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetLatestPersonResponse> getLatestPerson() {
        String path = "/person/latest";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<GetPopularPeopleResponse> getPopularPeople() {
        String path = "/person/popular";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
