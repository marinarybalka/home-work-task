package com.hillel.lecture_11;

public class interfaceMain {

    public static void main(String[] args) {

        Chrome googleChrome = new Chrome();
        Firefox firefox = new Firefox();
        Safari safari = new Safari();

        User testUser = new User("Bob", googleChrome, googleChrome);

        testUser.searchInfo("gfshdjf");
        testUser.refresh();
        testUser.downloadFile();


    }
}
