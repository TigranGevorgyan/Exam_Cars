package cars;

import engine.Engine;

/**
 * Created by Taron on 04/08/17.
 */
public class SportCar extends Car {

    public SportCar() {
    }

    public SportCar(String type, String name, int weight, Engine engine) {
        super(type, name, weight, engine);
    }

    @Override
    public int getModifiedSpeed() {
        if(getPassedRoad() < road.getRoadBloks().size()) {
            if (road.getRoadBloks().get(getPassedRoad()).getResistence() != 1)
                return getSpeed() / road.getRoadBloks().get(getPassedRoad()).getResistence() / 2;
            else return getSpeed();
        }
        else return getSpeed();
    }


}
