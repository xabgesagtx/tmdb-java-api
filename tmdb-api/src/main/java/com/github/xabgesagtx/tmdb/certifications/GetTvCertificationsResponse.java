
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
public class GetTvCertificationsResponse {

    @JsonProperty("certifications")
    GetTvCertificationsResponse.Certification certifications;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Certification {

        @JsonProperty("US")
        List<GetTvCertificationsResponse.Certification.U> us;
        @JsonProperty("CA")
        List<GetTvCertificationsResponse.Certification.Ca> ca;
        @JsonProperty("AU")
        List<GetTvCertificationsResponse.Certification.Au> au;
        @JsonProperty("FR")
        List<GetTvCertificationsResponse.Certification.Fr> fr;
        @JsonProperty("RU")
        List<GetTvCertificationsResponse.Certification.Ru> ru;
        @JsonProperty("DE")
        List<GetTvCertificationsResponse.Certification.De> de;
        @JsonProperty("TH")
        List<GetTvCertificationsResponse.Certification.Th> th;
        @JsonProperty("KR")
        List<GetTvCertificationsResponse.Certification.Kr> kr;
        @JsonProperty("GB")
        List<GetTvCertificationsResponse.Certification.Gb> gb;
        @JsonProperty("BR")
        List<GetTvCertificationsResponse.Certification.Br> br;

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
        public static class Kr {

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
        public static class Ru {

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
        public static class Th {

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
