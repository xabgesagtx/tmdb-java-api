
package com.github.xabgesagtx.tmdb.certifications;

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
public class GetMovieCertificationsResponse {

    @JsonProperty("certifications")
    GetMovieCertificationsResponse.Certification certifications;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Certification {

        @JsonProperty("US")
        List<GetMovieCertificationsResponse.Certification.U> us;
        @JsonProperty("CA")
        List<GetMovieCertificationsResponse.Certification.Ca> ca;
        @JsonProperty("DE")
        List<GetMovieCertificationsResponse.Certification.De> de;
        @JsonProperty("GB")
        List<GetMovieCertificationsResponse.Certification.Gb> gb;
        @JsonProperty("AU")
        List<GetMovieCertificationsResponse.Certification.Au> au;
        @JsonProperty("BR")
        List<GetMovieCertificationsResponse.Certification.Br> br;
        @JsonProperty("FR")
        List<GetMovieCertificationsResponse.Certification.Fr> fr;
        @JsonProperty("NZ")
        List<GetMovieCertificationsResponse.Certification.Nz> nz;
        @JsonProperty("IN")
        List<GetMovieCertificationsResponse.Certification.In> in;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Au {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Br {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ca {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class De {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Fr {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Gb {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class In {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Nz {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class U {

            @JsonProperty("certification")
            String certification;
            @JsonProperty("meaning")
            String meaning;
            @JsonProperty("order")
            Integer order;

        }

    }

}
