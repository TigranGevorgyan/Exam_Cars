package engine;

/**
 * Created by Taron on 04/08/17.
 */
public class Engine {

    public String name;
    public int power;

    public Engine(int power, String name) {
        this.power = power;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
}
