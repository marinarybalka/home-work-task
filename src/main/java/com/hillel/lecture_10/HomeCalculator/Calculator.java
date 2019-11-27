package com.hillel.lecture_10.HomeCalculator;

public abstract class Calculator {

    public abstract void calculate();

    public double add(double a , double b) {
        return a + b;
    }

    public double sub(double a , double b) {
        return a - b;
    }

    public double mult(double a , double b) {
        return a * b;
    }

    public double div(double a , double b) {
        return a / b;
    }
}
