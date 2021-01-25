
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
public class GetLatestTvResponse {

    @JsonProperty("backdrop_path")
    String backdropPath;
    @JsonProperty("created_by")
    Map<String, Object> createdBy;
    @JsonProperty("episode_run_time")
    List<Integer> episodeRunTime;
    @JsonProperty("first_air_date")
    String firstAirDate;
    @JsonProperty("genres")
    List<GetLatestTvResponse.Genre> genres;
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
    @JsonProperty("name")
    String name;
    @JsonProperty("networks")
    List<GetLatestTvResponse.Network> networks;
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
    Integer popularity;
    @JsonProperty("poster_path")
    String posterPath;
    @JsonProperty("production_companies")
    Map<String, Object> productionCompanies;
    @JsonProperty("seasons")
    List<GetLatestTvResponse.Season> seasons;
    @JsonProperty("status")
    String status;
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
    public static class Network {

        @JsonProperty("id")
        Integer id;
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
        @JsonProperty("poster_path")
        String posterPath;
        @JsonProperty("season_number")
        Integer seasonNumber;

    }

}
