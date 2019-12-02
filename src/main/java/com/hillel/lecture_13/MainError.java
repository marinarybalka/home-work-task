package com.hillel.lecture_13;

import java.io.IOError;

public class MainError {

    public static void main(String[] args) {
        System.out.println("Start app");
        try {
            int result = calculation(2, 3);
            System.out.println(result);
        } catch (IOError error) {
            error.printStackTrace();
        }
        System.out.println("Stop app");
    }

    public static int calculation(int a, int b){
        if (a < 0) {
            throw new AssertionError("because a < 0");
        }
        return a + b;
    }
}
