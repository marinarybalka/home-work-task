package com.hillel.lecture_10.Abstraction;

public class PetAnimal extends AbstractAnimal {

    @Override
    public void move() {
        System.out.println("Move slow");
    }

    @Override
    public void eat() {
        System.out.println("Eat a lot of food");

    }

    @Override
    public void sleep() {
        System.out.println("Sleep always!");
    }

    public void voice() {
        System.out.println("GAB GAB!");
    }
}
