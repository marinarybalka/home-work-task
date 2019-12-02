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
        testUser.sendImage();
        System.out.println("\n");

        PhoneUser testUser1 = new PhoneUser("Maya", telegram, "Xiaomi");
        testUser1.readInfo("Hi Anna");
        testUser1.writeeMessage("I am not Anna. I am Maya");
        testUser1.sendSmile();
        testUser1.deleteMessage();
        System.out.println("\n");

        PhoneUser testUser2 = new PhoneUser("Roman", whatsApp,"Samsung");
        testUser2.writeeMessage("Hi! Send me the photo from party, please");
        testUser2.readInfo("Hi! Where is you PLEASE?");
        testUser2.voiceMessage();
        testUser2.fileDownload();
        testUser2.sendSmile();
        System.out.println("\n");









    }
}
