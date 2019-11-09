package com.hillel.lecture_7;

public class App {
    public static void main(String[] args) {

        FractionNumbers numbers = new FractionNumbers(1, 2);
        int x = numbers.plus();
        System.out.println(x);

        int y = numbers.multiply();
        System.out.println(y);

        numbers.toString();
    }

}
