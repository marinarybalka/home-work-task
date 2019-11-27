package com.hillel.lecture_10;

public class InheritanceMain2 {

    public static void main(String[] args) {
        SearchSite google = new GoogleSearchSite();
        google.search("Java");

        SearchSite duckduckgo = new DuckduckgoSearch();
        duckduckgo.search("Java");

        SearchSite yahoo = new YahooSearchSite();
        yahoo.search("Java");
    }
}
