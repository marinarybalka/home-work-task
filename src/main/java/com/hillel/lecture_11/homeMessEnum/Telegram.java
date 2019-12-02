package com.hillel.lecture_11.homeMessEnum;

public class Telegram extends Messenger {

    @Override
    public void download() {
        System.out.println("Download by Telegram");

    }

    @Override
    public String writeMessage(String message) {
        System.out.println("Write the message by Telegram: " + message);
        return message;
    }

    @Override
    public String readMessage(String message) {
        System.out.println("Read the message by Telegram");
        return "Read more messages by Telegram";
    }

    @Override
    public String sendEmotion() {
        System.out.println("Send emotion by Telegram");
        return "More emotions by Telegram";
    }

    @Override
    public void delete() {
        System.out.println("Delete by Telegram");
    }
}
