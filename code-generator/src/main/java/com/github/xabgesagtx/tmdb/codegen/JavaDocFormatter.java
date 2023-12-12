package com.github.xabgesagtx.tmdb.codegen;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;

public class JavaDocFormatter {

    private final String baseUrl;


    public JavaDocFormatter(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    String format(String text) {
        Document doc = Jsoup.parse(StringUtils.defaultString(text), baseUrl);
        doc.select("a").forEach(e -> {
            String absUrl = e.absUrl("href");
            e.attr("href", absUrl);
        });
        return Jsoup.clean(doc.select("body").html(), Safelist.basic().removeEnforcedAttribute("a", "rel"));
    }
}
