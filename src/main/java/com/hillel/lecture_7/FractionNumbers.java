package com.hillel.lecture_7;

import io.qameta.allure.Step;

public class FractionNumbers {
    public FractionNumbers(int x, int y) {
        this.number1 = x;
        this.number2 = y;
    }
    private int number1;
    private int number2;

    @Step
    public int plus() {
        return this.number1 + this.number2;
    }

    @Step
    public int minus() {
        return this.number1 - this.number2;
    }

    @Step
    public int multiply() {
        return this.number1 * this.number2;
    }

    @Step
    public int divide() {
        return this.number1 / this.number2;
    }

    @Step
    public String toString() {
        System.out.println("Class contains: " + this.number1 + " and " + this.number2);
        return "Class contains: " + this.number1 + " and " + this.number2;
    }
}
