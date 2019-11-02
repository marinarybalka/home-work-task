package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {
        return Integer.parseInt(Integer.toBinaryString(value));
    }

    @Step
    public int fromBinaryToDecimal(int value) {
        return Integer.parseInt(Integer.toString(value),2);
    }
}


