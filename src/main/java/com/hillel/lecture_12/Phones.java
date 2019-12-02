package com.hillel.lecture_12;

public enum Phones {

    IPHONE("11 Pro", "Aple"),
    SAMSUNG("Galaxy S10", "Samsung"),
    XIAOMI("Readmy note 10", "Xiaomi"),
    OPPO("K3", "OPPO");

    private String model;
    private String producer;


    Phones(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String getModel() { return model; }

    public String getProducer() { return producer; }
}

