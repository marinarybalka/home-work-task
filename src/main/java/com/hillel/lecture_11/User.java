package com.hillel.lecture_11;

public class User {

    private String name;
    private Browser browser1;
    private IBrowsers browser;
    private FileDownload fileDownload;

    public User(String name, Browser browser) {
        this.name = name;
        this.browser = browser;
    }

    public User(String name, IBrowsers browser) {
        this.name = name;
        this.browser = browser;
    }

    public User(String name, IBrowsers browser, FileDownload fileDownload) {
        this.name = name;
        this.browser = browser;
        this.fileDownload = fileDownload;
    }

    public void searchInfo(String url) {
        System.out.println("User: " + name + " search info...");
        browser.navigateToUrl(url);
    }

    public void refresh() {
        System.out.println("User " + name + " refresh page...");
        browser.refresh();
    }

    public void downloadFile() {
        if (fileDownload == null) {
            System.out.println("Unsupported browser type");
            return;
        }
        System.out.println("User " + name + " download file...");
        fileDownload.download();
    }
}
