package com.hillel.lecture_4;

public class WhileLoopExample {

    public static void main(String[] args) {

//        boolean isStarted = true;
//
//        while (true) {
//            System.out.println("hey");
//            isStarted = false;
//
//
//        }

           int min = 1;
           int max = 10;

//        while (min <= max) {
//            System.out.println("min:" + min + ", max: " + max);
//           // min = min + 1;
//           // min++;
//            max--;

        boolean isStarted = true;
        while (isStarted) {
            System.out.println("min:" + min + ", max: " + max);
            if (min==5) {
                isStarted = false;
            }
            min++;

        }

    }
}
