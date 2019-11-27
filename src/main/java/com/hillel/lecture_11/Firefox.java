package com.hillel.lecture_11;

public class Firefox implements IBrowsers, FileDownload {

    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url: " + url);
        return "Open by Firefox";
    }

    @Override
    public String moveForward() {
        System.out.println("Move Forward");
        return "Move Forward by Firefox";
    }

    @Override
    public String moveBack() {
        System.out.println("Move Back");
        return "Move Back by Firefox";
    }

    @Override
    public void refresh() {
        System.out.println("Refresh by Firefox");
    }

    @Override
    public void download() {
        System.out.println("Download by Firefox");
    }
}
