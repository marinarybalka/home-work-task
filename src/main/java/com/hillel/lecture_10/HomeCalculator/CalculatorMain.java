package com.hillel.lecture_10.HomeCalculator;

public class CalculatorMain {

    public static void main(String[] args) {

        AccountCalculator accountCalculator = new AccountCalculator();
        FinancialCalculator financialCalculator = new FinancialCalculator();
        EngineeredCalculator engineeredCalculator = new EngineeredCalculator();
        ProgrammedCalculator programmedCalculator = new ProgrammedCalculator();

        programmedCalculator.calculate();
        System.out.println(programmedCalculator.getFibonacciSum(10));
        financialCalculator.calculate();
        System.out.println(financialCalculator.convertRate(50, 26));
        engineeredCalculator.calculate();
        System.out.println(engineeredCalculator.getCosinus(35));
        System.out.println(engineeredCalculator.getSinus(45));
        accountCalculator.calculate();
        System.out.println(accountCalculator.countPercentage(400, 10));

    }
}
