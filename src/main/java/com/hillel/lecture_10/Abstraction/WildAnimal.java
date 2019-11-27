package com.hillel.lecture_10.Abstraction;

public class WildAnimal extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("Move fast if you are hungry!");
    }

    @Override
    public void eat() {
        System.out.println("Eat fresh meat!");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep herd!");
    }
}
