package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {
    public double linearEquation(int a, int b) {
        if (a == 0) {
            return 0;
        } else {
            return (double) - ( b / a);
        }
    }
}
