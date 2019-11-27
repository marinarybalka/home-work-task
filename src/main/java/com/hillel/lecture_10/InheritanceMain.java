package com.hillel.lecture_10;

public class InheritanceMain {

    public static void main(String[] args) {

        SearchSite searchSite = new SearchSite("https://wwww.google.com/");
        searchSite.search ("Java");

        SearchSite duckduckgoSite = new SearchSite("https://wwww.duckduckgo.com/");
        duckduckgoSite.search ("Automation");

        GoogleSearchSite googleSearchSite = new GoogleSearchSite();
        googleSearchSite.search("Java");
        googleSearchSite.showHits();

        DuckduckgoSearch duckduckgoSearch = new DuckduckgoSearch();
        duckduckgoSearch.search("Automation");

        YahooSearchSite yahooSearchSite = new YahooSearchSite();
        yahooSearchSite.search("Selenium");


    }
}
