package com.hillel.lecture_10.HomeCalculator;

public class AccountCalculator extends Calculator {

    public double countPercentage(double amount , double procentage) {
        return super.div(super.mult(amount,  procentage), 100);
    }

    @Override
    public void calculate() {
        System.out.println("Calculation with Account Calculator");

    }
}
