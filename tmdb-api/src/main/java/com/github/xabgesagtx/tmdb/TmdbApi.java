
package com.github.xabgesagtx.tmdb;

import java.net.http.HttpClient;
import com.github.xabgesagtx.tmdb.account.Account;
import com.github.xabgesagtx.tmdb.authentication.Authentication;
import com.github.xabgesagtx.tmdb.certifications.Certifications;
import com.github.xabgesagtx.tmdb.changes.Changes;
import com.github.xabgesagtx.tmdb.collections.Collections;
import com.github.xabgesagtx.tmdb.companies.Companies;
import com.github.xabgesagtx.tmdb.configuration.Configuration;
import com.github.xabgesagtx.tmdb.credits.Credits;
import com.github.xabgesagtx.tmdb.discover.Discover;
import com.github.xabgesagtx.tmdb.find.Find;
import com.github.xabgesagtx.tmdb.genres.Genres;
import com.github.xabgesagtx.tmdb.guestsessions.GuestSessions;
import com.github.xabgesagtx.tmdb.http.RestClient;
import com.github.xabgesagtx.tmdb.http.RestClientImpl;
import com.github.xabgesagtx.tmdb.keywords.Keywords;
import com.github.xabgesagtx.tmdb.lists.Lists;
import com.github.xabgesagtx.tmdb.movies.Movies;
import com.github.xabgesagtx.tmdb.networks.Networks;
import com.github.xabgesagtx.tmdb.people.People;
import com.github.xabgesagtx.tmdb.reviews.Reviews;
import com.github.xabgesagtx.tmdb.search.Search;
import com.github.xabgesagtx.tmdb.trending.Trending;
import com.github.xabgesagtx.tmdb.tv.TV;
import com.github.xabgesagtx.tmdb.tvepisodegroups.TVEpisodeGroups;
import com.github.xabgesagtx.tmdb.tvepisodes.TVEpisodes;
import com.github.xabgesagtx.tmdb.tvseasons.TVSeasons;

public class TmdbApi {

    private final Account account;
    private final Authentication authentication;
    private final Certifications certifications;
    private final Changes changes;
    private final Collections collections;
    private final Companies companies;
    private final Configuration configuration;
    private final Credits credits;
    private final Discover discover;
    private final Find find;
    private final Genres genres;
    private final GuestSessions guestSessions;
    private final Keywords keywords;
    private final Lists lists;
    private final Movies movies;
    private final Networks networks;
    private final Trending trending;
    private final People people;
    private final Reviews reviews;
    private final Search search;
    private final TV tv;
    private final TVSeasons tvSeasons;
    private final TVEpisodes tvEpisodes;
    private final TVEpisodeGroups tvEpisodeGroups;

    public TmdbApi(RestClient restClient) {
        account = new Account(restClient);
        authentication = new Authentication(restClient);
        certifications = new Certifications(restClient);
        changes = new Changes(restClient);
        collections = new Collections(restClient);
        companies = new Companies(restClient);
        configuration = new Configuration(restClient);
        credits = new Credits(restClient);
        discover = new Discover(restClient);
        find = new Find(restClient);
        genres = new Genres(restClient);
        guestSessions = new GuestSessions(restClient);
        keywords = new Keywords(restClient);
        lists = new Lists(restClient);
        movies = new Movies(restClient);
        networks = new Networks(restClient);
        trending = new Trending(restClient);
        people = new People(restClient);
        reviews = new Reviews(restClient);
        search = new Search(restClient);
        tv = new TV(restClient);
        tvSeasons = new TVSeasons(restClient);
        tvEpisodes = new TVEpisodes(restClient);
        tvEpisodeGroups = new TVEpisodeGroups(restClient);
    }

    public TmdbApi(String apiKey) {
        this(new RestClientImpl(apiKey));
    }

    public TmdbApi(String apiKey, HttpClient httpClient) {
        this(new RestClientImpl(apiKey, httpClient));
    }

    public Account account() {
        return account;
    }

    public Authentication authentication() {
        return authentication;
    }

    public Certifications certifications() {
        return certifications;
    }

    public Changes changes() {
        return changes;
    }

    public Collections collections() {
        return collections;
    }

    public Companies companies() {
        return companies;
    }

    public Configuration configuration() {
        return configuration;
    }

    public Credits credits() {
        return credits;
    }

    public Discover discover() {
        return discover;
    }

    public Find find() {
        return find;
    }

    public Genres genres() {
        return genres;
    }

    public GuestSessions guestSessions() {
        return guestSessions;
    }

    public Keywords keywords() {
        return keywords;
    }

    public Lists lists() {
        return lists;
    }

    public Movies movies() {
        return movies;
    }

    public Networks networks() {
        return networks;
    }

    public Trending trending() {
        return trending;
    }

    public People people() {
        return people;
    }

    public Reviews reviews() {
        return reviews;
    }

    public Search search() {
        return search;
    }

    public TV tv() {
        return tv;
    }

    public TVSeasons tvSeasons() {
        return tvSeasons;
    }

    public TVEpisodes tvEpisodes() {
        return tvEpisodes;
    }

    public TVEpisodeGroups tvEpisodeGroups() {
        return tvEpisodeGroups;
    }

}
