package com.hillel.leture_10;
import com.hillel.lecture_10.HomeAbstractPlanets.Planet;
import com.hillel.lecture_10.HomeAbstractPlanets.PlanetEarth;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SunSystemTest {
    private Planet myPlanet = new Planet("MyPlanet");
    private PlanetEarth earth = new PlanetEarth("Earth", 10);

    @Test
    public void planetTest() {
        String expectedResult = "MyPlanet";
        assertEquals(myPlanet.getName(), expectedResult);
    }

    @Test
    public void earthTest() {
        String expectedResult = "Earth";
        assertEquals(earth.getName(), expectedResult);
        assertEquals(earth.getPopulation(), 10d);
    }
}
