package cars;

import engine.Engine;
import road.Road;
import road.RoadBlocks;

import java.util.ArrayList;

/**
 * Created by Taron on 04/08/17.
 */
public abstract class Car {
    public static Road road = new Road();
    public String type;
    public String name;
    public int weight;
    public Engine engine;
    public int passedRoad;
    public int iteration;

    public Car() {
    }

    public Car(String type, String name, int weight, Engine engine) {
        this.type = type;
        this.engine = engine;
        this.weight = weight;
        this.name = name;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public int getPassedRoad() {
        return passedRoad;
    }

    public void setPassedRoad(int passedRoad) {
        this.passedRoad = passedRoad;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSpeed() {
            return (engine.power * 100) / weight;
    }

    public abstract int getModifiedSpeed();

    @Override
    public String toString() {
        return type + ". " + name + ", " + weight + ", time " + iteration * 10;
    }
}
