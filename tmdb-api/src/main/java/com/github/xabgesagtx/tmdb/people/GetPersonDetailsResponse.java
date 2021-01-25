
package com.github.xabgesagtx.tmdb.people;

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
public class GetPersonDetailsResponse {

    @JsonProperty("birthday")
    String birthday;
    @JsonProperty("known_for_department")
    String knownForDepartment;
    @JsonProperty("deathday")
    String deathday;
    @JsonProperty("id")
    Integer id;
    @JsonProperty("name")
    String name;
    @JsonProperty("also_known_as")
    List<String> alsoKnownAs;
    @JsonProperty("gender")
    Integer gender;
    @JsonProperty("biography")
    String biography;
    @JsonProperty("popularity")
    Double popularity;
    @JsonProperty("place_of_birth")
    String placeOfBirth;
    @JsonProperty("profile_path")
    String profilePath;
    @JsonProperty("adult")
    Boolean adult;
    @JsonProperty("imdb_id")
    String imdbId;
    @JsonProperty("homepage")
    String homepage;

}
