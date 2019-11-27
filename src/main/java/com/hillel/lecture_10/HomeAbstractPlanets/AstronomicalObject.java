package com.hillel.lecture_10.HomeAbstractPlanets;

public abstract class AstronomicalObject {

    private String name;

    protected AstronomicalObject(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract void collision();

    public String getName() {
        return this.name;
    }

}
