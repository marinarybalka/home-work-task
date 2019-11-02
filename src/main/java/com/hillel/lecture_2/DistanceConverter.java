package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    @Step
    public static void main(String[] args) {
        DistanceConverter.metersToInches(50);
        DistanceConverter.inchesToMeters(10);
        DistanceConverter.milesToKilometres(4);
        DistanceConverter.kilometresToMiles(9);

    }

    @Step
    public static double metersToInches(double metrs) {
        double inches = metrs * 39.37;
        System.out.println(metrs +" metrs = " + inches + " inches");
        return inches;
    }

    public static double inchesToMeters(double inches) {
        double metrs = inches / 39.37;
        System.out.println(inches +" inches = " + metrs + " metrs");
        return metrs;
    }

    public static double milesToKilometres(double kilometres) {
        double miles = kilometres * 1.609;
        System.out.println(miles +" miles = " + kilometres + " kilometres");
        return miles;
    }

    public static double kilometresToMiles(double miles) {
        double kilometres = miles  / 1.609;
        System.out.println(kilometres +" kilometres = " + miles + " miles");
        return kilometres;
    }
}

