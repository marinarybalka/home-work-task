package com.hillel.lecture_11.homeMessEnumErrors;

public class MyViber extends Messenger {

    @Override
    public void download() {
        System.out.println("Download by MyViber");

    }

    @Override
    public String writeMessage(String message) {
        if (super.checkConnection()) {
            System.out.println("Problems with connection, sending later");
        }
        return message;
    }

    @Override
    public String readMessage(String message) {
        System.out.println("Read the message by MyViber");
        return "Read more messages by MyViber";
    }


    @Override
    public void delete() {
        System.out.println("Delete by MyViber");
    }

}
