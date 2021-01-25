
package com.github.xabgesagtx.tmdb.people;

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
public class GetLatestPersonResponse {

    @JsonProperty("adult")
    Boolean adult;
    @JsonProperty("also_known_as")
    Map<String, Object> alsoKnownAs;
    @JsonProperty("biography")
    String biography;
    @JsonProperty("birthday")
    String birthday;
    @JsonProperty("deathday")
    String deathday;
    @JsonProperty("gender")
    Integer gender;
    @JsonProperty("homepage")
    String homepage;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("imdb_id")
    String imdbId;
    @JsonProperty("name")
    String name;
    @JsonProperty("place_of_birth")
    String placeOfBirth;
    @JsonProperty("popularity")
    Double popularity;
    @JsonProperty("profile_path")
    String profilePath;

}
