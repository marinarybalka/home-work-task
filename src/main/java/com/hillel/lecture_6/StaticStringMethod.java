package com.hillel.lecture_6;

public class StaticStringMethod {

    public static void main(String[] args) {
        String name = new String("Martin");
        int age = 30;

        String stringAge = String.valueOf(age);
        System.out.println(stringAge);

        System.out.println(String.format("Result %s, %s", 30.0, "Bob"));

//        String students = {"Mark", "Igor", "Anna"};

//        String join = String.join(",", students);
//        System.out.println("students: " + join);

    }

    public static void formatString(String[] args, int data) {

    }

    public static void formatString(int data, String... args) {

    }
}
