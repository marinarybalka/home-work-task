package com.hillel.lecture_4;

public class ForEachLoopExample {

    public static void main(String[] args) {


        int[] numbers = {1, 23, 43567, 32, 23489, 8};

        for (int number : numbers) {
            System.out.println("number:" + number);
            if (number == 32) {
                System.out.println("hey");
            }
        }
    }
}

