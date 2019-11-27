package com.hillel.lecture_10.HomeAbstractPlanets;

public class Planet extends AstronomicalObject {

    public Planet(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " moves around Sun");

    }

    @Override
    public void collision() {
        System.out.println("There is a threat of collision with comets.");

    }
}
