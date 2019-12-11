package com.hillel.lecture_11.homeMessEnumErrors;

public interface IMessenger {


    String writeMessage(String message);

    String readMessage(String message);

    void sendEmotion();

    default void delete() {

    }

}
