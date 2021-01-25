
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
public class GetTvWatchProvidersResponse {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("results")
    GetTvWatchProvidersResponse.Result results;

    @Value
    @Builder
    @Jacksonized
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty("AR")
        GetTvWatchProvidersResponse.Result.Ar ar;
        @JsonProperty("AT")
        GetTvWatchProvidersResponse.Result.At at;
        @JsonProperty("AU")
        GetTvWatchProvidersResponse.Result.Au au;
        @JsonProperty("BE")
        GetTvWatchProvidersResponse.Result.Be be;
        @JsonProperty("BR")
        GetTvWatchProvidersResponse.Result.Br br;
        @JsonProperty("CA")
        GetTvWatchProvidersResponse.Result.Ca ca;
        @JsonProperty("CH")
        GetTvWatchProvidersResponse.Result.Ch ch;
        @JsonProperty("CL")
        GetTvWatchProvidersResponse.Result.Cl cl;
        @JsonProperty("CO")
        GetTvWatchProvidersResponse.Result.Co co;
        @JsonProperty("CZ")
        GetTvWatchProvidersResponse.Result.Cz cz;
        @JsonProperty("DE")
        GetTvWatchProvidersResponse.Result.De de;
        @JsonProperty("DK")
        GetTvWatchProvidersResponse.Result.Dk dk;
        @JsonProperty("EC")
        GetTvWatchProvidersResponse.Result.Ec ec;
        @JsonProperty("ES")
        GetTvWatchProvidersResponse.Result.E es;
        @JsonProperty("FI")
        GetTvWatchProvidersResponse.Result.Fi fi;
        @JsonProperty("FR")
        GetTvWatchProvidersResponse.Result.Fr fr;
        @JsonProperty("GB")
        GetTvWatchProvidersResponse.Result.Gb gb;
        @JsonProperty("HU")
        GetTvWatchProvidersResponse.Result.Hu hu;
        @JsonProperty("IE")
        GetTvWatchProvidersResponse.Result.Ie ie;
        @JsonProperty("IN")
        GetTvWatchProvidersResponse.Result.In in;
        @JsonProperty("IT")
        GetTvWatchProvidersResponse.Result.It it;
        @JsonProperty("JP")
        GetTvWatchProvidersResponse.Result.Jp jp;
        @JsonProperty("MX")
        GetTvWatchProvidersResponse.Result.Mx mx;
        @JsonProperty("NL")
        GetTvWatchProvidersResponse.Result.Nl nl;
        @JsonProperty("NO")
        GetTvWatchProvidersResponse.Result.No no;
        @JsonProperty("NZ")
        GetTvWatchProvidersResponse.Result.Nz nz;
        @JsonProperty("PE")
        GetTvWatchProvidersResponse.Result.Pe pe;
        @JsonProperty("PL")
        GetTvWatchProvidersResponse.Result.Pl pl;
        @JsonProperty("PT")
        GetTvWatchProvidersResponse.Result.Pt pt;
        @JsonProperty("RO")
        GetTvWatchProvidersResponse.Result.Ro ro;
        @JsonProperty("RU")
        GetTvWatchProvidersResponse.Result.Ru ru;
        @JsonProperty("SE")
        GetTvWatchProvidersResponse.Result.Se se;
        @JsonProperty("TR")
        GetTvWatchProvidersResponse.Result.Tr tr;
        @JsonProperty("US")
        GetTvWatchProvidersResponse.Result.U us;
        @JsonProperty("VE")
        GetTvWatchProvidersResponse.Result.Ve ve;
        @JsonProperty("ZA")
        GetTvWatchProvidersResponse.Result.Za za;

        @Value
        @Builder
        @Jacksonized
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Ar {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Ar.Flatrate> flatrate;

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
        public static class At {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.At.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.At.Flatrate> flatrate;

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
        public static class Au {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Au.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Au.Flatrate> flatrate;

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
        public static class Be {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Be.Flatrate> flatrate;

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
        public static class Br {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Br.Flatrate> flatrate;

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
        public static class Ca {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Ca.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Ca.Buy> buy;

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
        public static class Ch {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Ch.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Ch.Buy> buy;

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
        public static class Cl {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Cl.Flatrate> flatrate;

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
        public static class Co {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Co.Flatrate> flatrate;

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
        public static class Cz {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Cz.Flatrate> flatrate;

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
        public static class De {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.De.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.De.Flatrate> flatrate;

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
        public static class Dk {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Dk.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Dk.Flatrate> flatrate;

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
        public static class E {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.E.Flatrate> flatrate;

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
        public static class Ec {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Ec.Flatrate> flatrate;

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
        public static class Fi {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Fi.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Fi.Flatrate> flatrate;

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
        public static class Fr {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Fr.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Fr.Buy> buy;

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
        public static class Gb {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Gb.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Gb.Buy> buy;

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
        public static class Hu {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Hu.Flatrate> flatrate;

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
        public static class Ie {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Ie.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Ie.Flatrate> flatrate;

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
        public static class In {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.In.Flatrate> flatrate;

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
        public static class It {

            @JsonProperty("link")
            String link;
            @JsonProperty("ads")
            List<GetTvWatchProvidersResponse.Result.It.Ad> ads;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.It.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.It.Buy> buy;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Ad {

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
        public static class Jp {

            @JsonProperty("link")
            String link;
            @JsonProperty("rent")
            List<GetTvWatchProvidersResponse.Result.Jp.Rent> rent;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Jp.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Jp.Buy> buy;

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
        public static class Mx {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Mx.Flatrate> flatrate;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Mx.Buy> buy;

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
        public static class Nl {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Nl.Flatrate> flatrate;

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
        public static class No {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.No.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.No.Flatrate> flatrate;

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
        public static class Nz {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Nz.Flatrate> flatrate;

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
        public static class Pe {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Pe.Flatrate> flatrate;

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
        public static class Pl {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Pl.Flatrate> flatrate;
            @JsonProperty("ads")
            List<GetTvWatchProvidersResponse.Result.Pl.Ad> ads;

            @Value
            @Builder
            @Jacksonized
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Ad {

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
        public static class Pt {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Pt.Flatrate> flatrate;

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
        public static class Ro {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Ro.Flatrate> flatrate;

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
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Ru.Flatrate> flatrate;
            @JsonProperty("free")
            List<GetTvWatchProvidersResponse.Result.Ru.Free> free;

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
            public static class Free {

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
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.Se.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Se.Flatrate> flatrate;

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
        public static class Tr {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Tr.Flatrate> flatrate;

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
        public static class U {

            @JsonProperty("link")
            String link;
            @JsonProperty("buy")
            List<GetTvWatchProvidersResponse.Result.U.Buy> buy;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.U.Flatrate> flatrate;

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
        public static class Ve {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Ve.Flatrate> flatrate;

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
        public static class Za {

            @JsonProperty("link")
            String link;
            @JsonProperty("flatrate")
            List<GetTvWatchProvidersResponse.Result.Za.Flatrate> flatrate;

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

    }

}
