package com.hillel.lecture_11.homeMessEnum;

public interface IMessenger {

    String writeMessage(String message);

    String readMessage(String message);

    String sendEmotion();

    void delete();

}
