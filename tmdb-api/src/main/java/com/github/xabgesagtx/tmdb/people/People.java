
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

    /**
     * <p>Get the primary person details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     July 17, 2018 Added the <code>known_for_department</code> field.   April 26, 2018 Added the <a href="https://developers.themoviedb.org/3/people/get-person-translations">translations</a> method.   November 9, 2016 Biographies are now translatable on TMDb. This means you can query person details with a language parameter.
     * 
     */
    public Optional<GetPersonDetailsResponse> getPersonDetails(int personId) {
        // /person/{person_id}
        String path = String.format("/person/%s", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the changes for a person. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     */
    public Optional<GetPersonChangesResponse> getPersonChanges(int personId) {
        // /person/{person_id}/changes
        String path = String.format("/person/%s/changes", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the movie credits for a person.</p>
     * 
     */
    public Optional<GetPersonMovieCreditsResponse> getPersonMovieCredits(int personId) {
        // /person/{person_id}/movie_credits
        String path = String.format("/person/%s/movie_credits", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the TV show credits for a person.</p> 
     * <p>You can query for some extra details about the credit with the <a href="https://developers.themoviedb.org/3/credits/get-credit-details">credit method</a>.</p>
     * 
     */
    public Optional<GetPersonTvCreditsResponse> getPersonTvCredits(int personId) {
        // /person/{person_id}/tv_credits
        String path = String.format("/person/%s/tv_credits", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the movie and TV credits together in a single response.</p>
     * 
     */
    public Optional<GetPersonCombinedCreditsResponse> getPersonCombinedCredits(int personId) {
        // /person/{person_id}/combined_credits
        String path = String.format("/person/%s/combined_credits", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the external ids for a person. We currently support the following external sources.</p>    <strong>External Sources</strong>     IMDB ID   Facebook   Freebase MID   Freebase ID   Instagram   TVRage ID   Twitter
     * 
     */
    public Optional<GetPersonExternalIdsResponse> getPersonExternalIds(int personId) {
        // /person/{person_id}/external_ids
        String path = String.format("/person/%s/external_ids", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images for a person.</p>
     * 
     */
    public Optional<GetPersonImagesResponse> getPersonImages(int personId) {
        // /person/{person_id}/images
        String path = String.format("/person/%s/images", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that this person has been tagged in.</p>
     * 
     */
    public Optional<GetTaggedImagesResponse> getTaggedImages(int personId) {
        // /person/{person_id}/tagged_images
        String path = String.format("/person/%s/tagged_images", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of translations that have been created for a person.</p>
     * 
     */
    public Optional<GetPersonTranslationsResponse> getPersonTranslations(int personId) {
        // /person/{person_id}/translations
        String path = String.format("/person/%s/translations", personId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the most newly created person. This is a live response and will continuously change.</p>
     * 
     */
    public Optional<GetLatestPersonResponse> getLatestPerson() {
        String path = "/person/latest";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of popular people on TMDb. This list updates daily.</p>
     * 
     */
    public Optional<GetPopularPeopleResponse> getPopularPeople() {
        String path = "/person/popular";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
