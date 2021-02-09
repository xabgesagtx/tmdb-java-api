
package com.github.xabgesagtx.tmdb.people;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class People {

    private final RestClient restClient;

    public People(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Get the primary person details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     July 17, 2018 Added the <code>known_for_department</code> field.   April 26, 2018 Added the <a href="https://developers.themoviedb.org/3/people/get-person-translations">translations</a> method.   November 9, 2016 Biographies are now translatable on TMDb. This means you can query person details with a language parameter.
     * 
     * @param appendToResponse
     *     Append requests within the same namespace to the response.
     * @param personId
     *     personId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonDetailsResponse> getPersonDetails(int personId, String appendToResponse, String language) {
        // /person/{person_id}
        String path = String.format("/person/%s", personId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("append_to_response", appendToResponse);
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the primary person details by id.</p> 
     * <p>Supports <code>append_to_response</code>. Read more about this <a href="https://developers.themoviedb.org/3/getting-started/append-to-response">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     July 17, 2018 Added the <code>known_for_department</code> field.   April 26, 2018 Added the <a href="https://developers.themoviedb.org/3/people/get-person-translations">translations</a> method.   November 9, 2016 Biographies are now translatable on TMDb. This means you can query person details with a language parameter.
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonDetailsResponse> getPersonDetails(int personId) {
        return getPersonDetails(personId, null, null);
    }

    /**
     * <p>Get the changes for a person. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     * @param endDate
     *     Filter the results with a end date.
     * @param personId
     *     personId
     * @param page
     *     Specify which page to query.
     * @param startDate
     *     Filter the results with a start date.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetPersonChangesResponse getPersonChanges(int personId, LocalDate endDate, Integer page, LocalDate startDate) {
        // /person/{person_id}/changes
        String path = String.format("/person/%s/changes", personId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("end_date", endDate);
        requestParams.put("page", page);
        requestParams.put("start_date", startDate);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the changes for a person. By default only the last 24 hours are returned.</p> 
     * <p>You can query up to 14 days in a single query by using the <code>start_date</code> and <code>end_date</code> query parameters.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetPersonChangesResponse getPersonChanges(int personId) {
        return getPersonChanges(personId, null, null, null);
    }

    /**
     * <p>Get the movie credits for a person.</p>
     * 
     * @param personId
     *     personId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonMovieCreditsResponse> getPersonMovieCredits(int personId, String language) {
        // /person/{person_id}/movie_credits
        String path = String.format("/person/%s/movie_credits", personId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the movie credits for a person.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonMovieCreditsResponse> getPersonMovieCredits(int personId) {
        return getPersonMovieCredits(personId, null);
    }

    /**
     * <p>Get the TV show credits for a person.</p> 
     * <p>You can query for some extra details about the credit with the <a href="https://developers.themoviedb.org/3/credits/get-credit-details">credit method</a>.</p>
     * 
     * @param personId
     *     personId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonTvCreditsResponse> getPersonTvCredits(int personId, String language) {
        // /person/{person_id}/tv_credits
        String path = String.format("/person/%s/tv_credits", personId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the TV show credits for a person.</p> 
     * <p>You can query for some extra details about the credit with the <a href="https://developers.themoviedb.org/3/credits/get-credit-details">credit method</a>.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonTvCreditsResponse> getPersonTvCredits(int personId) {
        return getPersonTvCredits(personId, null);
    }

    /**
     * <p>Get the movie and TV credits together in a single response.</p>
     * 
     * @param personId
     *     personId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonCombinedCreditsResponse> getPersonCombinedCredits(int personId, String language) {
        // /person/{person_id}/combined_credits
        String path = String.format("/person/%s/combined_credits", personId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the movie and TV credits together in a single response.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonCombinedCreditsResponse> getPersonCombinedCredits(int personId) {
        return getPersonCombinedCredits(personId, null);
    }

    /**
     * <p>Get the external ids for a person. We currently support the following external sources.</p>    <strong>External Sources</strong>     IMDB ID   Facebook   Freebase MID   Freebase ID   Instagram   TVRage ID   Twitter
     * 
     * @param personId
     *     personId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonExternalIdsResponse> getPersonExternalIds(int personId, String language) {
        // /person/{person_id}/external_ids
        String path = String.format("/person/%s/external_ids", personId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the external ids for a person. We currently support the following external sources.</p>    <strong>External Sources</strong>     IMDB ID   Facebook   Freebase MID   Freebase ID   Instagram   TVRage ID   Twitter
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonExternalIdsResponse> getPersonExternalIds(int personId) {
        return getPersonExternalIds(personId, null);
    }

    /**
     * <p>Get the images for a person.</p>
     * 
     * @param personId
     *     personId
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonImagesResponse> getPersonImages(int personId) {
        // /person/{person_id}/images
        String path = String.format("/person/%s/images", personId);
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that this person has been tagged in.</p>
     * 
     * @param personId
     *     personId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTaggedImagesResponse getTaggedImages(int personId, String language, Integer page) {
        // /person/{person_id}/tagged_images
        String path = String.format("/person/%s/tagged_images", personId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the images that this person has been tagged in.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetTaggedImagesResponse getTaggedImages(int personId) {
        return getTaggedImages(personId, null, null);
    }

    /**
     * <p>Get a list of translations that have been created for a person.</p>
     * 
     * @param personId
     *     personId
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonTranslationsResponse> getPersonTranslations(int personId, String language) {
        // /person/{person_id}/translations
        String path = String.format("/person/%s/translations", personId);
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.getOpt(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get a list of translations that have been created for a person.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public Optional<GetPersonTranslationsResponse> getPersonTranslations(int personId) {
        return getPersonTranslations(personId, null);
    }

    /**
     * <p>Get the most newly created person. This is a live response and will continuously change.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetLatestPersonResponse getLatestPerson(String language) {
        String path = "/person/latest";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the most newly created person. This is a live response and will continuously change.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetLatestPersonResponse getLatestPerson() {
        return getLatestPerson(null);
    }

    /**
     * <p>Get the list of popular people on TMDb. This list updates daily.</p>
     * 
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param page
     *     Specify which page to query.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetPopularPeopleResponse getPopularPeople(String language, Integer page) {
        String path = "/person/popular";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("language", language);
        requestParams.put("page", page);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Get the list of popular people on TMDb. This list updates daily.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public GetPopularPeopleResponse getPopularPeople() {
        return getPopularPeople(null, null);
    }

}
