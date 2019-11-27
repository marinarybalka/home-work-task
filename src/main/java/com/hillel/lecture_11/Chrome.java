package com.hillel.lecture_11;

public class Chrome extends Browser {

    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url: " + url);
        return "Open by Chrome";
    }

    @Override
    public String moveForward() {
        System.out.println("Move Forward");
        return "Move Forward by Chrome";
    }

    @Override
    public String moveBack() {
        System.out.println("Move Back");
        return "Move Back by Chrome";
    }

    @Override
    public void refresh() {
        System.out.println("Refresh by Chrome");
    }

    @Override
    public void download() {
        System.out.println("Download by Chrome");
    }
}
