package com.hillel.lecture_10.HomeAbstractPlanets;

public class PlanetEarth extends Planet {

    private final double population;

    public PlanetEarth(String name, double population) {
        super(name);
        this.population = population;
    }

    public double getPopulation() {
        return this.population;
    }
}
