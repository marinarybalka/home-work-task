package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class PassFailChecker {

    public static String checkNumber(int mark) {
        System.out.println("DONE");
        if(mark >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}
