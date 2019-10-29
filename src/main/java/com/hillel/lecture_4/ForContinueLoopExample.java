package com.hillel.lecture_4;

public class ForContinueLoopExample {
    public static void main(String[] args) {
        String[] students = {"Steve", "Igor", "Anna", "Victor", "Bob"};

        for (int i = 0;i < students.length; i++) {
            System.out.println("i:"+ i);
            String student = students[i];

            if (students.equals("Victor")) {
                continue;
            }
            System.out.println("Student:"+ student);
        }

    }

}
