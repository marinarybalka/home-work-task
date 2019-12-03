package com.hillel.lecture_11.homeMessEnum;

public enum OSPhone {

    ANDROID("Mark", "Samsung G9"),
    IOS("Maya","iPhone X"),
    WINDOWS("Roman", "Microsoft Lumia 950");

    private String model;
    private String owner;

    OSPhone(String owner, String model) {
        this.model = model;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

