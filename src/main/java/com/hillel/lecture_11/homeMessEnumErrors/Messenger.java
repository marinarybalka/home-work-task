package com.hillel.lecture_11.homeMessEnumErrors;

import java.lang.String;

public abstract class Messenger implements IMessenger {

    boolean connection = true;
    private String emotion;
    double size;

    public abstract void download();

    @Override
    public String writeMessage(String message) { return message; }

    @Override
    public String readMessage(String message) { return message; }

    @Override
    public void sendEmotion() {
        this.emotion = emotion;
        System.out.println("Emotion was sent successful");
        return;
        }

    @Override
    public void delete() { }

    public void switchConnection(boolean connection) { this.connection = connection; }

    public boolean checkConnection() {
        try {
            if (!this.connection) {
                throw new MyError("No connection");
            }

        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Check the connection");
            System.out.println("\n");
        }
        return this.connection;
    }

}
