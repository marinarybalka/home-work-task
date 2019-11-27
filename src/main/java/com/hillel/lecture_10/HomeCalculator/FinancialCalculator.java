package com.hillel.lecture_10.HomeCalculator;

public class FinancialCalculator extends Calculator {

    public double convertRate(double amount , double rate) {
        return super.mult(amount, rate);
    }

    @Override
    public void calculate() {
        System.out.println("Calculation with Financial Calculator");
    }
}
