package cars;

import engine.Engine;
import road.Road;
import road.RoadBlocks;

/**
 * Created by Taron on 04/08/17.
 */
public class JeepCar extends Car {

    public JeepCar() {
    }

    public JeepCar(String type, String name, int weight, Engine engine) {
        super(type, name, weight, engine);
    }

    @Override
    public int getModifiedSpeed() {
        if(getPassedRoad() < road.getRoadBloks().size()) {
            if (road.getRoadBloks().get(getPassedRoad()).getResistence() != 1 && getPassedRoad() <= road.getRoadBloks().size())
                return getSpeed() / road.getRoadBloks().get(getPassedRoad()).getResistence() * 2;
            else return getSpeed();
        }
        else return getSpeed();
    }


}
