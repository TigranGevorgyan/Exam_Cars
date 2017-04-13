import cars.Car;
import cars.JeepCar;
import cars.SportCar;
import road.BadRoadBlock;
import road.Road;
import road.RoadBlocks;
import road.VeryBadRoadBlock;

import java.io.FileNotFoundException;
import java.util.Calendar;

/**
 * Created by Taron on 04/08/17.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        Road road = new Road();
//        road.makeRoad(300);
//
//        System.out.println(road.roadBloks.size());
//        for (RoadBlocks i : road.roadBloks)
//            System.out.println(i.getResistence());

        Game game = new Game(5,400);
        game.start();

//        Car[] cars = new Car[2];
//        cars[0] = new JeepCar();
//        cars[1] = new SportCar();

    }
}
