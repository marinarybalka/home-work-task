package com.hillel.lecture_10;

public class YahooSearchSite extends SearchSite {

    private static final String YAHOO_URL = "https://www.yahoo.com/";

    public YahooSearchSite() { super(YAHOO_URL); }

    @Override
    public void search(String query) {
        autorize();
        System.out.println(String.format("%s -> Search for %s", this.getClass().getSimpleName(), query));
    }

    private  void autorize() {
        System.out.println(String.format("%s -> Login to Login", this.getClass().getSimpleName()));
    }
}
