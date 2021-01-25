
package com.github.xabgesagtx.tmdb.authentication;


public class Authentication {


    public CreateGuestSessionResponse createGuestSession() {
        String path = "/authentication/guest_session/new";
        return null;
    }

    public CreateRequestTokenResponse createRequestToken() {
        String path = "/authentication/token/new";
        return null;
    }

    public CreateSessionResponse createSession() {
        String path = "/authentication/session/new";
        return null;
    }

    public ValidateRequestTokenResponse validateRequestToken() {
        String path = "/authentication/token/validate_with_login";
        return null;
    }

    public CreateSessionFromV4AccessTokenResponse createSessionFromV4AccessToken() {
        String path = "/authentication/session/convert/4";
        return null;
    }

    public DeleteSessionResponse deleteSession() {
        String path = "/authentication/session";
        return null;
    }

}
