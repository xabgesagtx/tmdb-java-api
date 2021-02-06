
package com.github.xabgesagtx.tmdb.authentication;

import com.github.xabgesagtx.tmdb.http.RestClient;

public class Authentication {

    private final RestClient restClient;

    public Authentication(RestClient restClient) {
        this.restClient = restClient;
    }

    public CreateGuestSessionResponse createGuestSession() {
        // /authentication/guest_session/new
        String path = String.format("/authentication/guest_session/new");
        return null;
    }

    public CreateRequestTokenResponse createRequestToken() {
        // /authentication/token/new
        String path = String.format("/authentication/token/new");
        return null;
    }

    public CreateSessionResponse createSession() {
        // /authentication/session/new
        String path = String.format("/authentication/session/new");
        return null;
    }

    public ValidateRequestTokenResponse validateRequestToken() {
        // /authentication/token/validate_with_login
        String path = String.format("/authentication/token/validate_with_login");
        return null;
    }

    public CreateSessionFromV4AccessTokenResponse createSessionFromV4AccessToken() {
        // /authentication/session/convert/4
        String path = String.format("/authentication/session/convert/4");
        return null;
    }

    public DeleteSessionResponse deleteSession() {
        // /authentication/session
        String path = String.format("/authentication/session");
        return null;
    }

}
