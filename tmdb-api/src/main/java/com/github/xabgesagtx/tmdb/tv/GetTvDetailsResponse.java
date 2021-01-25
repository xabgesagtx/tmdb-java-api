
package com.github.xabgesagtx.tmdb.tv;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTvDetailsResponse {

    @JsonProperty("backdrop_path")
    String backdropPath;
    @JsonProperty("created_by")
    List<GetTvDetailsResponse.CreatedBy> createdBy;
    @JsonProperty("episode_run_time")
    List<Integer> episodeRunTime;
    @JsonProperty("first_air_date")
    String firstAirDate;
    @JsonProperty("genres")
    List<GetTvDetailsResponse.Genre> genres;
    @JsonProperty("homepage")
    String homepage;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("in_production")
    Boolean inProduction;
    @JsonProperty("languages")
    List<String> languages;
    @JsonProperty("last_air_date")
    String lastAirDate;
    @JsonProperty("last_episode_to_air")
    GetTvDetailsResponse.LastEpisodeToAir lastEpisodeToAir;
    @JsonProperty("name")
    String name;
    @JsonProperty("next_episode_to_air")
    Map<String, Object> nextEpisodeToAir;
    @JsonProperty("networks")
    List<GetTvDetailsResponse.Network> networks;
    @JsonProperty("number_of_episodes")
    Integer numberOfEpisodes;
    @JsonProperty("number_of_seasons")
    Integer numberOfSeasons;
    @JsonProperty("origin_country")
    List<String> originCountry;
    @JsonProperty("original_language")
    String originalLanguage;
    @JsonProperty("original_name")
    String originalName;
    @JsonProperty("overview")
    String overview;
    @JsonProperty("popularity")
    Double popularity;
    @JsonProperty("poster_path")
    String posterPath;
    @JsonProperty("production_companies")
    List<GetTvDetailsResponse.ProductionCompany> productionCompanies;
    @JsonProperty("production_countries")
    List<GetTvDetailsResponse.ProductionCountry> productionCountries;
    @JsonProperty("seasons")
    List<GetTvDetailsResponse.Season> seasons;
    @JsonProperty("spoken_languages")
    List<GetTvDetailsResponse.SpokenLanguage> spokenLanguages;
    @JsonProperty("status")
    String status;
    @JsonProperty("tagline")
    String tagline;
    @JsonProperty("type")
    String type;
    @JsonProperty("vote_average")
    Double voteAverage;
    @JsonProperty("vote_count")
    Integer voteCount;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreatedBy {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("credit_id")
        String creditId;
        @JsonProperty("name")
        String name;
        @JsonProperty("gender")
        Integer gender;
        @JsonProperty("profile_path")
        String profilePath;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Genre {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LastEpisodeToAir {

        @JsonProperty("air_date")
        String airDate;
        @JsonProperty("episode_number")
        Integer episodeNumber;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("production_code")
        String productionCode;
        @JsonProperty("season_number")
        Integer seasonNumber;
        @JsonProperty("still_path")
        String stillPath;
        @JsonProperty("vote_average")
        Double voteAverage;
        @JsonProperty("vote_count")
        Integer voteCount;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Network {

        @JsonProperty("name")
        String name;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("logo_path")
        String logoPath;
        @JsonProperty("origin_country")
        String originCountry;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductionCompany {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("logo_path")
        String logoPath;
        @JsonProperty("name")
        String name;
        @JsonProperty("origin_country")
        String originCountry;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductionCountry {

        @JsonProperty("iso_3166_1")
        String iso31661;
        @JsonProperty("name")
        String name;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Season {

        @JsonProperty("air_date")
        String airDate;
        @JsonProperty("episode_count")
        Integer episodeCount;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("name")
        String name;
        @JsonProperty("overview")
        String overview;
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("season_number")
        Integer seasonNumber;

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SpokenLanguage {

        @JsonProperty("english_name")
        String englishName;
        @JsonProperty("iso_639_1")
        String iso6391;
        @JsonProperty("name")
        String name;

    }

}
