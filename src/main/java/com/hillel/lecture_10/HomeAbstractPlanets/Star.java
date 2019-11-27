package com.hillel.lecture_10.HomeAbstractPlanets;

public class Star extends AstronomicalObject {


    protected Star(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("moves around Sun");

    }


    @Override
    public void collision() {


    }
}
