
package com.github.xabgesagtx.tmdb.tvepisodegroups;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTvEpisodeGroupDetailsResponse {

    @JsonProperty("description")
    String description;
    @JsonProperty("episode_count")
    Integer episodeCount;
    @JsonProperty("group_count")
    Integer groupCount;
    @JsonProperty("groups")
    List<GetTvEpisodeGroupDetailsResponse.Group> groups;
    @JsonProperty("id")
    String id;
    @JsonProperty("name")
    String name;
    @JsonProperty("network")
    GetTvEpisodeGroupDetailsResponse.Network network;
    @JsonProperty("type")
    Integer type;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Group {

        @JsonProperty("id")
        String id;
        @JsonProperty("name")
        String name;
        @JsonProperty("order")
        Integer order;
        @JsonProperty("episodes")
        List<GetTvEpisodeGroupDetailsResponse.Group.Episode> episodes;
        @JsonProperty("locked")
        Boolean locked;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Episode {

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
            @JsonProperty("show_id")
            Integer showId;
            @JsonProperty("still_path")
            String stillPath;
            @JsonProperty("vote_average")
            Integer voteAverage;
            @JsonProperty("vote_count")
            Integer voteCount;
            @JsonProperty("order")
            Integer order;

        }

    }

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Network {

        @JsonProperty("id")
        Integer id;
        @JsonProperty("logo_path")
        String logoPath;
        @JsonProperty("name")
        String name;
        @JsonProperty("origin_country")
        String originCountry;

    }

}
