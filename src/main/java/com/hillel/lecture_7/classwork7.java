package com.hillel.lecture_7;

public class classwork7 {

    public static void main(String[] args) {
        Phone phone = new Phone();
//        iPhone.call();

        phone.setBrand("iPhone");
        phone.setModel("11 Pro");
        phone.setOs("iOS");
        phone.setHeight(10.5);
        phone.setWidth(5.5);
        phone.setWidth(120);

        System.out.println(phone.getBrand());
        System.out.println(phone.getModel());
        System.out.println(phone.getOs());
        System.out.println(phone.getHeight());
        System.out.println(phone.getWidth());
        System.out.println(phone.getWeight());

        Phone samsung = new Phone();
        samsung.setBrand("Samsung");
        samsung.setModel("Galaxy S10");
        samsung.setOs("Android");
        samsung.setHeight(2.7);
        samsung.setWidth(6.3);
        samsung.setWeight(130);

//        System.out.println(samsung.getBrand());
//        System.out.println(samsung.getModel());
//        System.out.println(samsung.getOs());
//        System.out.println(samsung.getHeight());
//        System.out.println(samsung.getWidth());
//        System.out.println(samsung.getWeight());

    }

}