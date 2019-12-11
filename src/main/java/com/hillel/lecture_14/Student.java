package com.hillel.lecture_14;

public class Student {

    private String name;
    private int rate;
    private int age;

    public Student(String name, int rate, int age) {
        this.name = name;
        this.rate = rate;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getAge() {
        return age;
    }
}
