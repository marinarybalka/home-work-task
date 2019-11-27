package com.hillel.lecture_10.Abstraction;

public class AbstractMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.move();
        dog.eat();
        dog.sleep();
        dog.live();
        dog.voice();

        Wolf wolf = new Wolf();
        wolf.move();
        wolf.eat();
        wolf.sleep();
        dog.live();

    }
}
