package com.hillel.lecture_4;

/**
 * Написать программу, которая выводит все символы (char) в промежутке от 135 до 255
 */

public class PrintChar {
    public static void main(String[] args) {
        for (int i = 135; i < 255; i++) {
            char ch = (char) i;

            System.out.printf(String.valueOf(ch));
        }
    }
}
