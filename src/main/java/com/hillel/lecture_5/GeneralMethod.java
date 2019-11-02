package com.hillel.lecture_5;

public class GeneralMethod {

    public static void main(String[] args) {
        GeneralMethod.celsiusToKelvin(10D);
        GeneralMethod.celsiusToKelvin(15d, 23d);

    }

    public static void celsiusToKelvin(double celsius) {
        double result = celsius + 273.16;
        System.out.println("Celsius to Kelvin:" + result);

    }

    public static void celsiusToKelvin(double celsius, double kelvin) {
        double result = celsius + kelvin;
        System.out.println("Celsius to Kelvin:" + result);

    }

}
