package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {

    @Step
    public static void main(String[] args) {
        SpeedConverter.speedKmToMi(4);
        SpeedConverter.speedMiToKm(7);
    }

    public static double speedKmToMi(double milesPerHour) {
        double kilometresPerHour = milesPerHour * 0.6214;

        System.out.println(kilometresPerHour +" KilometresPerHour = " + milesPerHour + " MilesPerHour");
        return kilometresPerHour;
    }

    public static double speedMiToKm(double kilometresPerHour) {
        double milesPerHour = kilometresPerHour / 0.6214;

        System.out.println(milesPerHour +" MilesPerHour = " + kilometresPerHour + " KilometersPerHour");
        return milesPerHour;
    }

}
