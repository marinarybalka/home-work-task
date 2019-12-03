package com.hillel.lecture_11.homeMessEnum;

public class UserHomeTask {

    private String name;
    private IMessenger messenger;
    private DownloadFile downloadFile;
    private SendFile sendFile;

    public UserHomeTask(String name, IMessenger messenger) {
        this.name = name;
        this.messenger = messenger;
    }

    public UserHomeTask(String name, IMessenger messenger, SendFile sendFile) {
        this.name = name;
        this.messenger = messenger;
        this.sendFile = sendFile;
    }

    public void sendImage() {
        if (sendFile == null) {
            System.out.println("Unsupported file type");
            return;
        }
        System.out.println("User " + name + " send greeting card...");
        sendFile.send();
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
