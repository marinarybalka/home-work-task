package com.hillel.lecture_10;

public class GoogleSearchSite extends SearchSite {

    private static final String GOOGLE_URL = "https://wwww.google.com/";

    public GoogleSearchSite() { super(GOOGLE_URL); }

    public void showHits() {
        System.out.println(String.format("%s -> Maybe you search for Java Virtual Machine", this.getClass().getSimpleName()));
        System.out.println(String.format("Maybe you search for JDK", this.getClass().getSimpleName()));
        System.out.println(String.format("Maybe you search for JDR", this.getClass().getSimpleName()));
    }

    public void search(String java) {
    }
}
