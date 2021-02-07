
package com.github.xabgesagtx.tmdb.discover;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    public Optional<MovieDiscoverResponse> movieDiscover(String certification, String certificationCountry, String certification_gte, String certification_lte, Boolean includeAdult, Boolean includeVideo, String language, Integer page, LocalDate primaryReleaseDate_gte, LocalDate primaryReleaseDate_lte, Integer primaryReleaseYear, LocalDate releaseDate_gte, LocalDate releaseDate_lte, Discover.MovieDiscoverSortByParam sortBy, Double voteAverage_gte, Double voteAverage_lte, Integer voteCount_gte, Integer voteCount_lte, String watchRegion, String withCast, String withCompanies, String withCrew, String withGenres, String withKeywords, String withOriginalLanguage, String withPeople, Integer withReleaseType, Integer withRuntime_gte, Integer withRuntime_lte, String withWatchProviders, String withoutGenres, String withoutKeywords, Integer year) {
        String path = "/discover/movie";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("with_release_type", withReleaseType);
        requestParams.put("with_watch_providers", withWatchProviders);
        requestParams.put("year", year);
        requestParams.put("primary_release_date.gte", primaryReleaseDate_gte);
        requestParams.put("with_cast", withCast);
        requestParams.put("watch_region", watchRegion);
        requestParams.put("with_genres", withGenres);
        requestParams.put("language", language);
        requestParams.put("sort_by", sortBy);
        requestParams.put("with_keywords", withKeywords);
        requestParams.put("include_adult", includeAdult);
        requestParams.put("with_runtime.lte", withRuntime_lte);
        requestParams.put("with_people", withPeople);
        requestParams.put("with_runtime.gte", withRuntime_gte);
        requestParams.put("with_original_language", withOriginalLanguage);
        requestParams.put("primary_release_date.lte", primaryReleaseDate_lte);
        requestParams.put("vote_average.gte", voteAverage_gte);
        requestParams.put("vote_average.lte", voteAverage_lte);
        requestParams.put("vote_count.gte", voteCount_gte);
        requestParams.put("with_crew", withCrew);
        requestParams.put("release_date.lte", releaseDate_lte);
        requestParams.put("with_companies", withCompanies);
        requestParams.put("vote_count.lte", voteCount_lte);
        requestParams.put("release_date.gte", releaseDate_gte);
        requestParams.put("certification", certification);
        requestParams.put("without_keywords", withoutKeywords);
        requestParams.put("certification_country", certificationCountry);
        requestParams.put("primary_release_year", primaryReleaseYear);
        requestParams.put("certification.lte", certification_lte);
        requestParams.put("include_video", includeVideo);
        requestParams.put("certification.gte", certification_gte);
        requestParams.put("page", page);
        requestParams.put("without_genres", withoutGenres);
        return restClient.get(path, requestParams, new TypeReference<>() {


        }
        );
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
        return movieDiscover(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /**
     * <p>Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.</p> 
     * <p>Discover also supports a nice list of sort options. See below for all of the available options.</p> 
     * <p>Also note that a number of filters support being comma (<code>,</code>) or pipe (<code>|</code>) separated. Comma's are treated like an <code>AND</code> and query while pipe's are an <code>OR</code>.</p> 
     * <p>Some examples of what can be done with discover can be found <a href="https://www.themoviedb.org/documentation/api/discover">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     January 2, 2020 A new set of filters are available for watch provider filtering. Check out <code>with_watch_providers</code> and <code>watch_region</code>.
     * 
     */
    public Optional<TvDiscoverResponse> tvDiscover(LocalDate airDate_gte, LocalDate airDate_lte, Integer firstAirDateYear, LocalDate firstAirDate_gte, LocalDate firstAirDate_lte, Boolean includeNullFirstAirDates, String language, Integer page, Boolean screenedTheatrically, Discover.TvDiscoverSortByParam sortBy, String timezone, Double voteAverage_gte, Integer voteCount_gte, String watchRegion, String withCompanies, String withGenres, String withKeywords, String withNetworks, String withOriginalLanguage, Integer withRuntime_gte, Integer withRuntime_lte, String withWatchProviders, String withoutGenres, String withoutKeywords) {
        String path = "/discover/tv";
        Map<String, Object> requestParams = new HashMap<>();
        requestParams.put("vote_count.gte", voteCount_gte);
        requestParams.put("with_watch_providers", withWatchProviders);
        requestParams.put("timezone", timezone);
        requestParams.put("watch_region", watchRegion);
        requestParams.put("with_genres", withGenres);
        requestParams.put("language", language);
        requestParams.put("with_companies", withCompanies);
        requestParams.put("sort_by", sortBy);
        requestParams.put("first_air_date.gte", firstAirDate_gte);
        requestParams.put("with_keywords", withKeywords);
        requestParams.put("air_date.gte", airDate_gte);
        requestParams.put("first_air_date_year", firstAirDateYear);
        requestParams.put("without_keywords", withoutKeywords);
        requestParams.put("first_air_date.lte", firstAirDate_lte);
        requestParams.put("with_runtime.lte", withRuntime_lte);
        requestParams.put("air_date.lte", airDate_lte);
        requestParams.put("with_networks", withNetworks);
        requestParams.put("with_runtime.gte", withRuntime_gte);
        requestParams.put("with_original_language", withOriginalLanguage);
        requestParams.put("page", page);
        requestParams.put("vote_average.gte", voteAverage_gte);
        requestParams.put("without_genres", withoutGenres);
        requestParams.put("screened_theatrically", screenedTheatrically);
        requestParams.put("include_null_first_air_dates", includeNullFirstAirDates);
        return restClient.get(path, requestParams, new TypeReference<>() {


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
        return tvDiscover(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public enum MovieDiscoverSortByParam {

        @JsonProperty("popularity.asc")
        POPULARITYASC("popularity.asc"),
        @JsonProperty("popularity.desc")
        POPULARITYDESC("popularity.desc"),
        @JsonProperty("release_date.asc")
        RELEASE_DATEASC("release_date.asc"),
        @JsonProperty("release_date.desc")
        RELEASE_DATEDESC("release_date.desc"),
        @JsonProperty("revenue.asc")
        REVENUEASC("revenue.asc"),
        @JsonProperty("revenue.desc")
        REVENUEDESC("revenue.desc"),
        @JsonProperty("primary_release_date.asc")
        PRIMARY_RELEASE_DATEASC("primary_release_date.asc"),
        @JsonProperty("primary_release_date.desc")
        PRIMARY_RELEASE_DATEDESC("primary_release_date.desc"),
        @JsonProperty("original_title.asc")
        ORIGINAL_TITLEASC("original_title.asc"),
        @JsonProperty("original_title.desc")
        ORIGINAL_TITLEDESC("original_title.desc"),
        @JsonProperty("vote_average.asc")
        VOTE_AVERAGEASC("vote_average.asc"),
        @JsonProperty("vote_average.desc")
        VOTE_AVERAGEDESC("vote_average.desc"),
        @JsonProperty("vote_count.asc")
        VOTE_COUNTASC("vote_count.asc"),
        @JsonProperty("vote_count.desc")
        VOTE_COUNTDESC("vote_count.desc");
        private final String value;

        MovieDiscoverSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public enum TvDiscoverSortByParam {

        @JsonProperty("vote_average.desc")
        VOTE_AVERAGEDESC("vote_average.desc"),
        @JsonProperty("vote_average.asc")
        VOTE_AVERAGEASC("vote_average.asc"),
        @JsonProperty("first_air_date.desc")
        FIRST_AIR_DATEDESC("first_air_date.desc"),
        @JsonProperty("first_air_date.asc")
        FIRST_AIR_DATEASC("first_air_date.asc"),
        @JsonProperty("popularity.desc")
        POPULARITYDESC("popularity.desc"),
        @JsonProperty("popularity.asc")
        POPULARITYASC("popularity.asc");
        private final String value;

        TvDiscoverSortByParam(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

}
