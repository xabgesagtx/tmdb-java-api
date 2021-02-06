
package com.github.xabgesagtx.tmdb.discover;

import java.util.Collections;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;

public class Discover {

    private final RestClient restClient;

    public Discover(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * <p>Discover movies by different types of data like average rating, number of votes, genres and certifications. You can get a valid list of certifications from the <a href="https://developers.themoviedb.org/3/certifications/get-movie-certifications">certifications list</a> method.</p> 
     * <p>Discover also supports a nice list of sort options. See below for all of the available options.</p> 
     * <p>Please note, when using <code>certification</code> \ <code>certification.lte</code> you must also specify <code>certification_country</code>. These two parameters work together in order to filter the results. You can only filter results with the countries we have added to our <a href="https://developers.themoviedb.org/3/certifications/get-movie-certifications">certifications list</a>.</p> 
     * <p>If you specify the <code>region</code> parameter, the regional release date will be used instead of the primary release date. The date returned will be the first date based on your query (ie. if a <code>with_release_type</code> is specified). It's important to note the order of the release types that are used. Specifying "2|3" would return the limited theatrical release date as opposed to "3|2" which would return the theatrical date.</p> 
     * <p>Also note that a number of filters support being comma (<code>,</code>) or pipe (<code>|</code>) separated. Comma's are treated like an <code>AND</code> and query while pipe's are an <code>OR</code>.</p> 
     * <p>Some examples of what can be done with discover can be found <a href="https://www.themoviedb.org/documentation/api/discover">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     January 2, 2020 A new set of filters are available for watch provider filtering. Check out <code>with_watch_providers</code> and <code>watch_region</code>.
     * 
     */
    public Optional<MovieDiscoverResponse> movieDiscover() {
        String path = "/discover/movie";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

    /**
     * <p>Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.</p> 
     * <p>Discover also supports a nice list of sort options. See below for all of the available options.</p> 
     * <p>Also note that a number of filters support being comma (<code>,</code>) or pipe (<code>|</code>) separated. Comma's are treated like an <code>AND</code> and query while pipe's are an <code>OR</code>.</p> 
     * <p>Some examples of what can be done with discover can be found <a href="https://www.themoviedb.org/documentation/api/discover">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     January 2, 2020 A new set of filters are available for watch provider filtering. Check out <code>with_watch_providers</code> and <code>watch_region</code>.
     * 
     */
    public Optional<TvDiscoverResponse> tvDiscover() {
        String path = "/discover/tv";
        return restClient.get(path, Collections.emptyMap(), new TypeReference<>() {


        }
        );
    }

}
