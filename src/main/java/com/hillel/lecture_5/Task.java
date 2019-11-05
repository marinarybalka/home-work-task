package com.hillel.lecture_5;
import java.util.Random;
public class Task {

    public static void main(String[] args) {
        //  Task.evenOrOdd(8);
        //  Task.evenOrOdd(5);
        int[] data = {1, 3, 42, 36};
        int result = Task.sumOfArray(data);
        System.out.println("Result:" + result);
        String result2 = Task.unicodeArray(data);
        System.out.println("Result2:" + result2);
    }

    public static void evenOrOdd(int number) {
        if (number % 2 != 0 ) {
            System.out.println("number is even:" + number);
        } else {
            System.out.println("number is odd:" + number);
        }

    }

    public static int sumOfArray(int [] data) {
        int result = 0;
        for (int i = 0; data.length > i; i++) {
            result = result + data[i];
        }
        return result;
    }

    public static String unicodeArray (int[] data) {
        String result = "";

        char temp;
        for (int i =0; i < data.length; i++) {
            temp = (char) data [i];
            result += temp;
        }
        return result;
    }

}


