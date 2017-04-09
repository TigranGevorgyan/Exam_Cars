package cars;

import engine.Engine;
import road.RoadBlocks;

/**
 * Created by Taron on 04/08/17.
 */
public class JeepCar extends Car {


    public JeepCar(String type, String name, int weight, Engine engine) {
        super(type, name, weight, engine);
    }


    @Override
    public int getModifiedSpeed() {
        return modifiedMethod();
    }
}
