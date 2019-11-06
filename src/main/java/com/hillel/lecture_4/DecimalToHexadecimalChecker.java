package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {


    @Step
    public String fromDecimalToHexadecimal(int value) {
        return Integer.toHexString(value).toUpperCase();
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {
        return Integer.parseInt(value,16);
    }
}

