package com.hillel.lecture_10.HomeAbstractPlanets;

import java.util.ArrayList;

public class Galaxy {
    ArrayList<SpaceSystem> systems = new ArrayList<SpaceSystem>();

    public void addSystem(SpaceSystem systems) {
        this.systems.add(systems);
    }

    public void describe() {
        for (int i = 0; i < this.systems.size(); i++) {
            this.systems.get(i).describe();
        }
    }
}
