package com.hillel.lecture_11.homeMessEnum;

public class MainUser {

    public static void main(String[] args) {

        MyViber viber = new MyViber();
        Telegram telegram = new Telegram();
        WhatsApp whatsApp = new WhatsApp();

        System.out.println(OSPhone.ANDROID.getOwner());
        System.out.println(OSPhone.ANDROID.getModel());

        UserHomeTask testUser = new UserHomeTask("Mark", viber);
        testUser.readInfo("Hello Mark!");
        testUser.fileDownload();
        testUser.writeeMessage("It is me, Mark... ");
        testUser.sendImage();
        System.out.println("\n");

        System.out.println(OSPhone.IOS.getOwner());
        System.out.println(OSPhone.IOS.getModel());

        UserHomeTask testUser1 = new UserHomeTask("Maya", telegram);
        testUser1.readInfo("Hi Anna");
        testUser1.writeeMessage("I am not Anna. I am Maya");
        testUser1.sendSmile();
        testUser1.deleteMessage();
        System.out.println("\n");

        System.out.println(OSPhone.WINDOWS.getOwner());
        System.out.println(OSPhone.WINDOWS.getModel());

        UserHomeTask testUser2 = new UserHomeTask("Roman", whatsApp);
        testUser2.writeeMessage("Hi! Send me the photo from party, please");
        testUser2.readInfo("Hi! Where is you PLEASE?");
        testUser2.voiceMessage();
        System.out.println("\n");


    }
}
