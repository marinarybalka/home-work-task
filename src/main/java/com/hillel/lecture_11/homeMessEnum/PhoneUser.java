package com.hillel.lecture_11.homeMessEnum;

public class PhoneUser {

    private String name;
    private IMessenger messenger;
    private DownloadFile downloadFile;
    private String phoneModel;

    public PhoneUser(String name, IMessenger messenger, String phoneModel) {
        this.name = name;
        this.messenger = messenger;
        this.phoneModel = phoneModel;
    }

    public PhoneUser(String name, IMessenger messenger, DownloadFile downloadFile) {
        this.name = name;
        this.messenger = messenger;
        this.downloadFile = downloadFile;
    }


    public void fileDownload() {
        if (downloadFile == null) {
            System.out.println("Unsupported file type");
            return;
        }
        System.out.println("User " + name + " downloads file...");
        downloadFile.download();
    }

    public void sendSmile() {
        System.out.println("User " + name + " sends smile...");
        messenger.sendEmotion();
    }

    public void readInfo(String message) {
        System.out.println("User: " + name + " reads info from message");
        messenger.readMessage(message);
    }

    public void voiceMessage() {
        System.out.println("User: " + name + " sends voice message");
    }

    public void deleteMessage() {
        System.out.println("User: " + name + " deleted voice message");
        messenger.delete();
    }

    public void writeeMessage(String message) {
        System.out.println("User: " + name + " writes message... ");
        messenger.writeMessage(message);
    }

}
