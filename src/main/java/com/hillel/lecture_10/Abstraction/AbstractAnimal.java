package com.hillel.lecture_10.Abstraction;

public abstract class AbstractAnimal {

    public abstract void move();

    public abstract void eat();

    public abstract void sleep();

    public void live() {
        System.out.println("I am happy animal!");
    }
}
