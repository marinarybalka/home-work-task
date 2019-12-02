package com.hillel.lecture_11.homeMessEnum;

public class MainUserInterface {

    public static void main(String[] args) {

        MyViber viber = new MyViber();
        Telegram telegram = new Telegram();
        WhatsApp whatsApp = new WhatsApp();

        PhoneUser testUser = new PhoneUser("Mark", viber, "Iphone");

        testUser.readInfo("Hello Mark!");
        testUser.fileDownload();
        testUser.sendSmile();
        testUser.voiceMessage();
        testUser.deleteMessage();
        testUser.writeeMessage("It is me, Mark... ");

    }
}
