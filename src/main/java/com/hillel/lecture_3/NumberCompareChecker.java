package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberCompareChecker {

    public String getGreatestNumber(int a, int b) {
        if (a > b){
            return "Number " + a+ " has greatest value!";
        }
        if (b > a){
            return "Number " + b+ " has greatest value!";
        }

        return "Numbers "+ a+" and "+ b+" are equals!";
    }
}
