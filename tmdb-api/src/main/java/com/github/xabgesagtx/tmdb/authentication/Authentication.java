
package com.github.xabgesagtx.tmdb.authentication;

import java.util.Collections;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

public class Authentication {

    private final RestClient restClient;

    public Authentication(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>This method will let you create a new guest session. Guest sessions are a type of session that will let a user rate movies and TV shows but not require them to have a TMDb user account. More information about user authentication can be found <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p> 
     * <p>Please note, you should only generate a single guest session per user (or device) as you will be able to attach the ratings to a TMDb user account in the future. There is also IP limits in place so you should always make sure it's the end user doing the guest session actions.</p> 
     * <p>If a guest session is not used for the first time within 24 hours, it will be automatically deleted.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public CreateGuestSessionResponse createGuestSession() {
        String path = "/authentication/guest_session/new";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Create a temporary request token that can be used to validate a TMDb user login. More details about how this works can be found <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public CreateRequestTokenResponse createRequestToken() {
        String path = "/authentication/token/new";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
    }

    /**
     * <p>You can use this method to create a fully valid session ID once a user has validated the request token. More information about how this works can be found <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p>
     * 
     * @param createSessionRequest
     *     createSessionRequest
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public CreateSessionResponse createSession(CreateSessionRequest createSessionRequest) {
        String path = "/authentication/session/new";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , createSessionRequest);
    }

    /**
     * <p>This method allows an application to validate a request token by entering a username and password.</p> 
     * <p>Not all applications have access to a web view so this can be used as a substitute.</p> 
     * <p>Please note, the preferred method of validating a request token is to have a user authenticate the request via the TMDb website. You can read about that method <a href="https://developers.themoviedb.org/3/authentication/how-do-i-generate-a-session-id">here</a>.</p> 
     * <p>If you decide to use this method please <strong>use HTTPS</strong>.</p>
     * 
     * @param validateRequestTokenRequest
     *     validateRequestTokenRequest
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public ValidateRequestTokenResponse validateRequestToken(ValidateRequestTokenRequest validateRequestTokenRequest) {
        String path = "/authentication/token/validate_with_login";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , validateRequestTokenRequest);
    }

    /**
     * <p>Use this method to create a v3 session ID if you already have a valid v4 access token. The v4 token needs to be authenticated by the user. Your standard "read token" will not validate to create a session ID.</p>
     * 
     * @param createSessionFromV4AccessTokenRequest
     *     createSessionFromV4AccessTokenRequest
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public CreateSessionFromV4AccessTokenResponse createSessionFromV4AccessToken(CreateSessionFromV4AccessTokenRequest createSessionFromV4AccessTokenRequest) {
        String path = "/authentication/session/convert/4";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.post(path, requestParams, new TypeReference<>() {


        }
        , createSessionFromV4AccessTokenRequest);
    }

    /**
     * <p>If you would like to delete (or "logout") from a session, call this method with a valid session ID.</p>
     * 
     * @param deleteSessionRequest
     *     deleteSessionRequest
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public DeleteSessionResponse deleteSession(DeleteSessionRequest deleteSessionRequest) {
        String path = "/authentication/session";
        Map<String, Object> requestParams = Collections.emptyMap();
        return restClient.delete(path, requestParams, new TypeReference<>() {


        }
        , deleteSessionRequest);
    }

}
