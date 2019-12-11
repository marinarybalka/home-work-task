package com.hillel.lecture_11.homeMessEnumErrors;


public class MainUserErrorEx {

    public static void main(String[] args){

        MyViber viber = new MyViber();
        Telegram telegram = new Telegram();
        WhatsApp whatsApp = new WhatsApp();

        System.out.println(OSPhone.ANDROID.getOwner());
        System.out.println(OSPhone.ANDROID.getModel());

        UserHomeTask testUser = new UserHomeTask("Mark", viber);
        testUser.readInfo("Hello");
        viber.switchConnection(false);
        viber.writeMessage("dddd");
        viber.switchConnection(true);
        viber.writeMessage("dddd");
        System.out.println("\n");

        System.out.println(OSPhone.IOS.getOwner());
        System.out.println(OSPhone.IOS.getModel());

        UserHomeTask testUser1 = new UserHomeTask("Maya", telegram);
        testUser1.readInfo("Hi Anna");
        testUser1.writeMessage("I am not Anna. I am Maya");
        testUser1.sendSmile();
        testUser1.deleteMessage();
        testUser1.voiceMessage();
        System.out.println("\n");

        System.out.println(OSPhone.WINDOWS.getOwner());
        System.out.println(OSPhone.WINDOWS.getModel());

        UserHomeTask testUser2 = new UserHomeTask("Roman", whatsApp);
        System.out.println("Open WhatsApp");
        testUser2.fileDownload();


    }
}
