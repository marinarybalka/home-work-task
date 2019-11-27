package com.hillel.lecture_10.HomeAbstractPlanets;

import java.util.ArrayList;

public class SpaceSystem extends Galaxy {
    ArrayList<AstronomicalObject> planets = new ArrayList<AstronomicalObject>();
    public void addPlanet(AstronomicalObject planet) {
        this.planets.add(planet);
    }

    @Override
    public void describe() {
        for (int i = 0; i < this.planets.size(); i++) {
            System.out.println(this.planets.get(i).getName());
        }
    }
}
