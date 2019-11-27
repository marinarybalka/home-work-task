package com.hillel.lecture_11;

public class Safari implements IBrowsers {
    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url: " + url);
        return "Open by Safari";
    }

    @Override
    public String moveForward() {
        System.out.println("Move Forward");
        return "Move Forward by Safari";
    }

    @Override
    public String moveBack() {
        System.out.println("Move Back");
        return "Move Back by Safari";
    }

    @Override
    public void refresh() {
        System.out.println("Refresh by Safari");
    }
}
