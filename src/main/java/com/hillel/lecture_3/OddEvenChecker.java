package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {

    public static String checkNumber(int mark) {
        System.out.println("BUY");
        if(mark % 2 == 0) {
            return "Even Number";
        } else {
            return "Odd Number";
        }
    }

}
