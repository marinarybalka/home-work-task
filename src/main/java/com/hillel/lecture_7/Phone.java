package com.hillel.lecture_7;

public class Phone {

    private String model;
    private String brand;
    private String os;
    private double width;
    private double height;
    private int weight;

    public Phone() {

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
        if (model == null) {
            this.model = "Default phone";
        } else {
            this.model = model;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void call() {
        System.out.println("I call you from my phone: " + this.brand);
    }

//    @Override
//    public String toString();{
//        return "Phone{" +
//                "model=" + model + '\'' +
//                ", brand'" + brand + '\'' +
//

}

