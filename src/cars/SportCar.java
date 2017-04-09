package cars;

import engine.Engine;

/**
 * Created by Taron on 04/08/17.
 */
public class SportCar extends Car {

    public SportCar(String type, String name, int weight, Engine engine) {
        super(type, name, weight, engine);
    }

    @Override
    public int getModifiedSpeed() {
        return modifiedMethod();
    }
}
