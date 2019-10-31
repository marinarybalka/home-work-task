package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {


    @Step
    public static void main(String[] args) {
        TemperatureConverter.celsiusToFahrenheit(10);
        TemperatureConverter.fahrenheitToCelsius(122);
        TemperatureConverter.celsiusToKelvin(5);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9d / 5d) * celsius + 32;
        System.out.println(celsius +" ºC = " + fahrenheit + " ºF");
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5d / 9d) * (fahrenheit - 32);
        System.out.println(fahrenheit +" ºF = " + celsius + " ºC");
        return celsius;
    }

    public static double celsiusToKelvin(double celsius) {
        double kalvin = 273.16 + celsius;
        System.out.println(celsius +" ºF = " + kalvin + " ºC");
        return kalvin;
    }

}
