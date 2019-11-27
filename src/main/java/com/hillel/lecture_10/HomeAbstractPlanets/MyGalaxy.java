package com.hillel.lecture_10.HomeAbstractPlanets;

public class MyGalaxy {

    public static void main(String[] args) {

        Star sun = new Star("Sun");
        Star moon = new Star("Moon");
        Planet mars = new Planet("Mars");
        PlanetEarth earth = new PlanetEarth("Ears", 50);
        SpaceSystem sunSystem = new SpaceSystem();
        Galaxy myGalaxy = new Galaxy();
        myGalaxy.addSystem(sunSystem);
        sunSystem.addPlanet(sun);
        sunSystem.addPlanet(moon);
        sunSystem.addPlanet(earth);
        sunSystem.addPlanet(mars);

        myGalaxy.describe();

    }

}
