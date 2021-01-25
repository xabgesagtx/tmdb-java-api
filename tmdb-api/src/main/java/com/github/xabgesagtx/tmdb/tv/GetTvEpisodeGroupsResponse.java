
package com.github.xabgesagtx.tmdb.tv;

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
public class GetTvEpisodeGroupsResponse {

    @JsonProperty("results")
    List<GetTvEpisodeGroupsResponse.Result> results;
    @JsonProperty("id")
    Integer id;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("description")
        String description;
        @JsonProperty("episode_count")
        Integer episodeCount;
        @JsonProperty("group_count")
        Integer groupCount;
        @JsonProperty("id")
        String id;
        @JsonProperty("name")
        String name;
        @JsonProperty("network")
        GetTvEpisodeGroupsResponse.Result.Network network;
        @JsonProperty("type")
        Integer type;

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

}
