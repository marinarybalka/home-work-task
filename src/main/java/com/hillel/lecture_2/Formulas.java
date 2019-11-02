package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public static void main(String[] args) {

        Formulas.calculate9Formula(25);
        Formulas.calculate10Formula(26);
        Formulas.calculate11Formula(27);
        Formulas.calculate12Formula(28);
        Formulas.calculate13Formula(29);

    }

    @Step
    public static double calculate9Formula(double x) {
        double result = 1.1f*Math.exp(-x)+Math.abs(Math.cos(Math.sqrt(Math.PI*x)))-(3f/8f);
        System.out.println(result + "- Formula 9");
        return result;
    }

    @Step
    public static double calculate10Formula(double x) {
        double result = 1.0 / 3.0 * Math.sqrt(Math.abs(Math.sin(x))) * Math.cbrt(Math.pow(Math.E, 0.12 * x));
        System.out.println(result + "- Formula 10");
        return result;
    }

    @Step
    public static double calculate11Formula(double x) {
        double result = 2 * Math.PI * x - Math.abs(Math.sin(Math.sqrt(10.5 * x))) * 1.0 / (Math.cbrt(Math.pow(x,2)) + 1.0 / 7.0);
        System.out.println(result + "- Formula 11");
        return result;
    }

    @Step
    public static double calculate12Formula(double x) {
        double result = Math.log(Math.sqrt(Math.abs(2 - x)) + 1.2) * 1 / (2 + Math.pow(Math.E, -x)) + Math.cbrt(2 / x);
        System.out.println(result + "- Formula 12");
        return result;
    }

    @Step
    public static double calculate13Formula(double x) {
        double result = (Math.pow(Math.exp(-2 + x), (1/2)))*(1/(Math.sqrt(Math.pow(x, 2)+Math.pow(x, 4)+Math.log(Math.abs(x-3.14d)))));
        System.out.println(result + "- Formula 13");
        return result;
    }

}
