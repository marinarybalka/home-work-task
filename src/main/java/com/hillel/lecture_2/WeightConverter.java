package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter {

    @Step
    public static void main(String[] args) {
        WeightConverter.kilogramsToPounds(10);
        WeightConverter.poundsToKilograms(25);

    }

    public static double kilogramsToPounds(double kilograms) {
        double pounds = kilograms * 2.20462;
        System.out.println(pounds +" pounds = " + kilograms + " kilograms");
        return pounds;
    }

    public static double poundsToKilograms(double pounds) {
        double kilograms = pounds / 2.2046;
        System.out.println(kilograms +" kilograms = " + pounds + " pounds");
        return kilograms;
    }

}

