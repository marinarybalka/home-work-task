package com.hillel.lecture_10.HomeCalculator;

public class EngineeredCalculator extends Calculator {

    public double getSinus(double amount) {
        return Math.sin(amount);
    }

    public double getCosinus(double amount) {
        return Math.cos(amount);
    }

    @Override
    public void calculate() {
        System.out.println("Calculation with Engineered Calculator");

    }
}
