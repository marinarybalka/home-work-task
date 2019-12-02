package com.hillel.lecture_11.homeMessEnum;

public class MyViber extends Messenger {

    @Override
    public void download() {
        System.out.println("Download by MyViber");

    }

    @Override
    public String writeMessage(String message) {
        System.out.println("Write the message by MyViber: " + message);
        return message;
    }

    @Override
    public String readMessage(String message) {
        System.out.println("Read the message by MyViber");
        return "Read more messages by MyViber";
    }

    @Override
    public String sendEmotion() {
        System.out.println("Send emotion by MyViber");
        return "More emotions by MyViber";
    }

    @Override
    public void delete() {
        System.out.println("Delete by MyViber");
    }

}
