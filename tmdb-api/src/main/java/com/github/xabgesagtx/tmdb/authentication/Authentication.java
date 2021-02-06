
package com.github.xabgesagtx.tmdb.authentication;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Authentication {

    private final RestClient restClient;

    public Authentication(RestClient restClient) {
        this.restClient = restClient;
    }

    public Optional<CreateGuestSessionResponse> createGuestSession() {
        String path = "/authentication/guest_session/new";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<CreateRequestTokenResponse> createRequestToken() {
        String path = "/authentication/token/new";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<CreateSessionResponse> createSession() {
        String path = "/authentication/session/new";
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<ValidateRequestTokenResponse> validateRequestToken() {
        String path = "/authentication/token/validate_with_login";
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<CreateSessionFromV4AccessTokenResponse> createSessionFromV4AccessToken() {
        String path = "/authentication/session/convert/4";
        return restClient.post(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    public Optional<DeleteSessionResponse> deleteSession() {
        String path = "/authentication/session";
        return restClient.delete(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
