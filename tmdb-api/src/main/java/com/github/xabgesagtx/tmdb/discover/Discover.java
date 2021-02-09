
package com.github.xabgesagtx.tmdb.discover;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.exceptions.TmdbApiException;

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
     * @param withCast
     *     A comma separated list of person ID's. Only include movies that have one of the ID's added as an actor.
     * @param releaseDate_lte
     *     Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value.
     * @param withCompanies
     *     A comma separated list of production company ID's. Only include movies that have one of the ID's added as a production company.
     * @param voteAverage_gte
     *     Filter and only include movies that have a rating that is greater or equal to the specified value.
     * @param year
     *     A filter to limit the results to a specific year (looking at all release dates).
     * @param withGenres
     *     Comma separated value of genre ids that you want to include in the results.
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param watchRegion
     *     An ISO 3166-1 code. Combine this filter with `with_watch_providers` in order to filter your results by a specific watch provider in a specific region.
     * @param withOriginalLanguage
     *     Specify an ISO 639-1 string to filter results by their original language value.
     * @param voteCount_gte
     *     Filter and only include movies that have a vote count that is greater or equal to the specified value.
     * @param certificationCountry
     *     Used in conjunction with the certification filter, use this to specify a country with a valid certification.
     * @param withoutKeywords
     *     Exclude items with certain keywords. You can comma and pipe seperate these values to create an 'AND' or 'OR' logic.
     * @param sortBy
     *     Choose from one of the many available sort options.
     * @param withReleaseType
     *     Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method.
     * @param releaseDate_gte
     *     Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value.
     * @param voteAverage_lte
     *     Filter and only include movies that have a rating that is less than or equal to the specified value.
     * @param withCrew
     *     A comma separated list of person ID's. Only include movies that have one of the ID's added as a crew member.
     * @param primaryReleaseDate_gte
     *     Filter and only include movies that have a primary release date that is greater or equal to the specified value.
     * @param certification_gte
     *     Filter and only include movies that have a certification that is greater than or equal to the specified value.
     * @param withRuntime_gte
     *     Filter and only include movies that have a runtime that is greater or equal to a value.
     * @param withWatchProviders
     *     A comma or pipe separated list of watch provider ID's. Combine this filter with `watch_region` in order to filter your results by a specific watch provider in a specific region.
     * @param voteCount_lte
     *     Filter and only include movies that have a vote count that is less than or equal to the specified value.
     * @param certification_lte
     *     Filter and only include movies that have a certification that is less than or equal to the specified value.
     * @param includeAdult
     *     A filter and include or exclude adult movies.
     * @param withKeywords
     *     A comma separated list of keyword ID's. Only includes movies that have one of the ID's added as a keyword.
     * @param certification
     *     Filter results with a valid certification from the 'certification_country' field.
     * @param includeVideo
     *     A filter to include or exclude videos.
     * @param primaryReleaseYear
     *     A filter to limit the results to a specific primary release year.
     * @param withoutGenres
     *     Comma separated value of genre ids that you want to exclude from the results.
     * @param withPeople
     *     A comma separated list of person ID's. Only include movies that have one of the ID's added as a either a actor or a crew member.
     * @param page
     *     Specify the page of results to query.
     * @param region
     *     Specify a ISO 3166-1 code to filter release dates. Must be uppercase.
     * @param withRuntime_lte
     *     Filter and only include movies that have a runtime that is less than or equal to a value.
     * @param primaryReleaseDate_lte
     *     Filter and only include movies that have a primary release date that is less than or equal to the specified value.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public MovieDiscoverResponse movieDiscover(String certification, String certificationCountry, String certification_gte, String certification_lte, Boolean includeAdult, Boolean includeVideo, String language, Integer page, LocalDate primaryReleaseDate_gte, LocalDate primaryReleaseDate_lte, Integer primaryReleaseYear, String region, LocalDate releaseDate_gte, LocalDate releaseDate_lte, Discover.MovieDiscoverSortByParam sortBy, Double voteAverage_gte, Double voteAverage_lte, Integer voteCount_gte, Integer voteCount_lte, String watchRegion, String withCast, String withCompanies, String withCrew, String withGenres, String withKeywords, String withOriginalLanguage, String withPeople, Integer withReleaseType, Integer withRuntime_gte, Integer withRuntime_lte, String withWatchProviders, String withoutGenres, String withoutKeywords, Integer year) {
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
        requestParams.put("region", region);
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public MovieDiscoverResponse movieDiscover() {
        return movieDiscover(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /**
     * <p>Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.</p> 
     * <p>Discover also supports a nice list of sort options. See below for all of the available options.</p> 
     * <p>Also note that a number of filters support being comma (<code>,</code>) or pipe (<code>|</code>) separated. Comma's are treated like an <code>AND</code> and query while pipe's are an <code>OR</code>.</p> 
     * <p>Some examples of what can be done with discover can be found <a href="https://www.themoviedb.org/documentation/api/discover">here</a>.</p> <a href="https://developers.themoviedb.org/#recent-changes">\ud83d\udd17</a> Recent Changes    <strong>Date</strong> <strong>Change</strong>     January 2, 2020 A new set of filters are available for watch provider filtering. Check out <code>with_watch_providers</code> and <code>watch_region</code>.
     * 
     * @param firstAirDate_gte
     *     Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the "include_null_first_air_dates" filter if you want to include items with no air date.
     * @param withCompanies
     *     A comma separated list of production company ID's. Only include movies that have one of the ID's added as a production company.
     * @param voteAverage_gte
     *     Filter and only include movies that have a rating that is greater or equal to the specified value.
     * @param firstAirDate_lte
     *     Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the "include_null_first_air_dates" filter if you want to include items with no air date.
     * @param timezone
     *     Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset.
     * @param withGenres
     *     Comma separated value of genre ids that you want to include in the results.
     * @param screenedTheatrically
     *     Filter results to include items that have been screened theatrically.
     * @param withRuntime_gte
     *     Filter and only include TV shows with an episode runtime that is greater than or equal to a value.
     * @param withWatchProviders
     *     A comma or pipe separated list of watch provider ID's. Combine this filter with `watch_region` in order to filter your results by a specific watch provider in a specific region.
     * @param airDate_gte
     *     Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value.
     * @param language
     *     Pass a ISO 639-1 value to display translated data for the fields that support it.
     * @param airDate_lte
     *     Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value.
     * @param watchRegion
     *     An ISO 3166-1 code. Combine this filter with `with_watch_providers` in order to filter your results by a specific watch provider in a specific region.
     * @param withOriginalLanguage
     *     Specify an ISO 639-1 string to filter results by their original language value.
     * @param withKeywords
     *     A comma separated list of keyword ID's. Only includes TV shows that have one of the ID's added as a keyword.
     * @param voteCount_gte
     *     Filter and only include movies that have a rating that is less than or equal to the specified value.
     * @param withNetworks
     *     Comma separated value of network ids that you want to include in the results.
     * @param includeNullFirstAirDates
     *     Use this filter to include TV shows that don't have an air date while using any of the "first_air_date" filters.
     * @param withoutGenres
     *     Comma separated value of genre ids that you want to exclude from the results.
     * @param withoutKeywords
     *     Exclude items with certain keywords. You can comma and pipe seperate these values to create an 'AND' or 'OR' logic.
     * @param firstAirDateYear
     *     Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the "include_null_first_air_dates" filter if you want to include items with no air date.
     * @param sortBy
     *     Choose from one of the many available sort options.
     * @param page
     *     Specify the page of results to query.
     * @param withRuntime_lte
     *     Filter and only include TV shows with an episode runtime that is less than or equal to a value.
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public TvDiscoverResponse tvDiscover(LocalDate airDate_gte, LocalDate airDate_lte, Integer firstAirDateYear, LocalDate firstAirDate_gte, LocalDate firstAirDate_lte, Boolean includeNullFirstAirDates, String language, Integer page, Boolean screenedTheatrically, Discover.TvDiscoverSortByParam sortBy, String timezone, Double voteAverage_gte, Integer voteCount_gte, String watchRegion, String withCompanies, String withGenres, String withKeywords, String withNetworks, String withOriginalLanguage, Integer withRuntime_gte, Integer withRuntime_lte, String withWatchProviders, String withoutGenres, String withoutKeywords) {
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
     * @throws TmdbApiException
     *     when an unexpected status code or any other issue interacting with the API occurs
     */
    public TvDiscoverResponse tvDiscover() {
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
