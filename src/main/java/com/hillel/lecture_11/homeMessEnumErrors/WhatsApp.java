package com.hillel.lecture_11.homeMessEnumErrors;

public class WhatsApp extends Messenger {


    @Override
    public void download() {
            System.out.println("Download by WhatsApp");
    }

    @Override
    public String writeMessage(String message) {
        System.out.println("Write the message by WhatsApp: " + message);
        return message;
    }

    @Override
    public String readMessage(String message) {
        System.out.println("Read the message by WhatsApp");
        return "Read more messages by WhatsApp";
    }

    @Override
    public void delete() {
        System.out.println("Delete by WhatsApp");
    }

}


