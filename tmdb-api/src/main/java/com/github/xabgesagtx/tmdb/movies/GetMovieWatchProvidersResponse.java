
package com.github.xabgesagtx.tmdb.movies;

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
public class GetMovieWatchProvidersResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    GetMovieWatchProvidersResponse.Result results;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("AR")
        GetMovieWatchProvidersResponse.Result.Ar ar;
        @JsonProperty("AT")
        GetMovieWatchProvidersResponse.Result.At at;
        @JsonProperty("AU")
        GetMovieWatchProvidersResponse.Result.Au au;
        @JsonProperty("BE")
        GetMovieWatchProvidersResponse.Result.Be be;
        @JsonProperty("BR")
        GetMovieWatchProvidersResponse.Result.Br br;
        @JsonProperty("CA")
        GetMovieWatchProvidersResponse.Result.Ca ca;
        @JsonProperty("CH")
        GetMovieWatchProvidersResponse.Result.Ch ch;
        @JsonProperty("CL")
        GetMovieWatchProvidersResponse.Result.Cl cl;
        @JsonProperty("CO")
        GetMovieWatchProvidersResponse.Result.Co co;
        @JsonProperty("CZ")
        GetMovieWatchProvidersResponse.Result.Cz cz;
        @JsonProperty("DE")
        GetMovieWatchProvidersResponse.Result.De de;
        @JsonProperty("DK")
        GetMovieWatchProvidersResponse.Result.Dk dk;
        @JsonProperty("EC")
        GetMovieWatchProvidersResponse.Result.Ec ec;
        @JsonProperty("EE")
        GetMovieWatchProvidersResponse.Result.Ee ee;
        @JsonProperty("ES")
        GetMovieWatchProvidersResponse.Result.E es;
        @JsonProperty("FI")
        GetMovieWatchProvidersResponse.Result.Fi fi;
        @JsonProperty("FR")
        GetMovieWatchProvidersResponse.Result.Fr fr;
        @JsonProperty("GB")
        GetMovieWatchProvidersResponse.Result.Gb gb;
        @JsonProperty("GR")
        GetMovieWatchProvidersResponse.Result.Gr gr;
        @JsonProperty("HU")
        GetMovieWatchProvidersResponse.Result.Hu hu;
        @JsonProperty("ID")
        GetMovieWatchProvidersResponse.Result.Id id;
        @JsonProperty("IE")
        GetMovieWatchProvidersResponse.Result.Ie ie;
        @JsonProperty("IN")
        GetMovieWatchProvidersResponse.Result.In in;
        @JsonProperty("IT")
        GetMovieWatchProvidersResponse.Result.It it;
        @JsonProperty("JP")
        GetMovieWatchProvidersResponse.Result.Jp jp;
        @JsonProperty("KR")
        GetMovieWatchProvidersResponse.Result.Kr kr;
        @JsonProperty("LT")
        GetMovieWatchProvidersResponse.Result.Lt lt;
        @JsonProperty("LV")
        GetMovieWatchProvidersResponse.Result.Lv lv;
        @JsonProperty("MX")
        GetMovieWatchProvidersResponse.Result.Mx mx;
        @JsonProperty("MY")
        GetMovieWatchProvidersResponse.Result.My my;
        @JsonProperty("NL")
        GetMovieWatchProvidersResponse.Result.Nl nl;
        @JsonProperty("NO")
        GetMovieWatchProvidersResponse.Result.No no;
        @JsonProperty("NZ")
        GetMovieWatchProvidersResponse.Result.Nz nz;
        @JsonProperty("PE")
        GetMovieWatchProvidersResponse.Result.Pe pe;
        @JsonProperty("PH")
        GetMovieWatchProvidersResponse.Result.Ph ph;
        @JsonProperty("PL")
        GetMovieWatchProvidersResponse.Result.Pl pl;
        @JsonProperty("PT")
        GetMovieWatchProvidersResponse.Result.Pt pt;
        @JsonProperty("RO")
        GetMovieWatchProvidersResponse.Result.Ro ro;
        @JsonProperty("RU")
        GetMovieWatchProvidersResponse.Result.Ru ru;
        @JsonProperty("SE")
        GetMovieWatchProvidersResponse.Result.Se se;
        @JsonProperty("SG")
        GetMovieWatchProvidersResponse.Result.Sg sg;
        @JsonProperty("TH")
        GetMovieWatchProvidersResponse.Result.Th th;
        @JsonProperty("TR")
        GetMovieWatchProvidersResponse.Result.Tr tr;
        @JsonProperty("US")
        GetMovieWatchProvidersResponse.Result.U us;
        @JsonProperty("VE")
        GetMovieWatchProvidersResponse.Result.Ve ve;
        @JsonProperty("ZA")
        GetMovieWatchProvidersResponse.Result.Za za;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ar {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ar.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ar.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ar.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class At {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.At.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.At.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Au {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Au.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Au.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Au.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Be {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Be.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Be.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Be.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Br {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Br.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Br.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Br.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ca {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ca.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ca.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ca.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ch {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ch.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ch.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ch.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Cl {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Cl.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Cl.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Cl.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Co {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Co.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Co.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Co.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Cz {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Cz.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Cz.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Cz.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class De {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.De.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.De.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Dk {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Dk.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Dk.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Dk.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class E {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.E.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.E.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.E.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ec {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ec.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ec.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ec.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ee {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ee.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ee.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ee.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Fi {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Fi.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Fi.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Fi.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Fr {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Fr.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Fr.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Fr.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Gb {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Gb.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Gb.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Gb.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Gr {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Gr.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Gr.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Gr.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Hu {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Hu.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Hu.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Hu.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Id {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Id.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Id.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Id.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ie {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ie.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ie.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ie.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class In {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.In.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.In.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.In.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class It {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.It.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.It.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.It.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Jp {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Jp.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Jp.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Jp.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Kr {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Kr.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Kr.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Kr.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Lt {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Lt.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Lt.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Lv {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Lv.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Lv.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Mx {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Mx.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Mx.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Mx.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class My {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.My.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.My.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.My.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Nl {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Nl.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Nl.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Nl.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class No {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.No.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.No.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.No.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Nz {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Nz.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Nz.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Nz.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Pe {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Pe.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Pe.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Pe.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ph {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ph.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ph.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ph.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Pl {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Pl.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Pl.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Pl.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Pt {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Pt.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Pt.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Pt.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ro {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ro.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ru {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ru.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ru.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ru.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Se {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Se.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Se.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Se.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Sg {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Sg.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Sg.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Sg.Rent> rent;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Th {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Th.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Th.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Th.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Tr {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Tr.Buy> buy;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Tr.Rent> rent;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Tr.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class U {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.U.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.U.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.U.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ve {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Ve.Flatrate> flatrate;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Ve.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Ve.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Za {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetMovieWatchProvidersResponse.Result.Za.Rent> rent;
            @JsonProperty("buy")
            List<GetMovieWatchProvidersResponse.Result.Za.Buy> buy;
            @JsonProperty("flatrate")
            List<GetMovieWatchProvidersResponse.Result.Za.Flatrate> flatrate;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Buy {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Flatrate {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Rent {

                @JsonProperty("display_priority")
                Integer displayPriority;
                @JsonProperty("logo_path")
                String logoPath;
                @JsonProperty("provider_id")
                Integer providerId;
                @JsonProperty("provider_name")
                String providerName;

            }

        }

    }

}
