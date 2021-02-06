
package com.github.xabgesagtx.tmdb.find;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Find {

    private final RestClient restClient;

    public Find(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>The find method makes it easy to search for objects in our database by an external id. For example, an IMDB ID.</p> 
     * <p>This method will search all objects (movies, TV shows and people) and return the results in a single response.</p> 
     * <p>The supported external sources for each object are as follows.</p> <a href="https://developers.themoviedb.org/#media-databases">\ud83d\udd17</a> Media Databases     Movies TV Shows TV Seasons TV Episodes People     IMDb ID ✓ ✓ ✗ ✓ ✓   TVDB ID ✗ ✓ ✓ ✓ ✗   Freebase MID* ✗ ✓ ✓ ✓ ✓   Freebase ID* ✗ ✓ ✓ ✓ ✓   TVRage ID* ✗ ✓ ✓ ✓ ✓    <a href="https://developers.themoviedb.org/#social-ids">\ud83d\udd17</a> Social IDs     Movies TV Shows TV Seasons TV Episodes People     Facebook ✓ ✓ ✗ ✗ ✓   Instagram ✓ ✓ ✗ ✗ ✓   Twitter ✓ ✓ ✗ ✗ ✓    
     * <p>*Defunct or no longer available as a service.</p>
     * 
     */
    public Optional<FindByIdResponse> findById(String externalId) {
        // /find/{external_id}
        String path = String.format("/find/%s", externalId);
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
