import cars.Car;
import cars.JeepCar;
import cars.SportCar;
import engine.Engine;
import road.Road;
import road.RoadBlocks;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Taron on 04/08/17.
 */
public class Game {

    public int carsCount;
    public int roadLenght;
    public Garage garage = new Garage();
    ArrayList<String> cars = new ArrayList<>();
    ArrayList<Car> carsarrayList = new ArrayList<>();
    Car[] carArray;
    Road road = new Road();

    public Game(int carsCount, int roadLenght) {
        this.carsCount = carsCount;
        this.roadLenght = roadLenght;
        carArray = new Car[carsCount];
    }


    public void makesCars() throws FileNotFoundException {
        garage.getCars();
        garage.getEngines();
        for (int i = 0; i < carsCount; ) {
            int randomCarIndex = ThreadLocalRandom.current().nextInt(0, garage.carArrayList.size());
            if (!(cars.contains(garage.getCar(randomCarIndex)))) {
                cars.add(garage.getCar(randomCarIndex));
                i++;
            }
        }
        for (int i = 0; i < cars.size(); i++) {
            int randomEngineIndex = ThreadLocalRandom.current().nextInt(0, garage.engineArrayList.size());
            cars.set(i, cars.get(i) + ", " + garage.getEngine(randomEngineIndex));
        }
        System.out.println("Cars are maked.");
        for (String str : cars)
            System.out.println(str);
    }

    public void category() throws FileNotFoundException {
        for (int i = 0; i < cars.size(); i++) {
            String[] array = cars.get(i).split(",");
            if (array[0].equals("S"))
            carsarrayList.add(new SportCar(array[0], array[1], Integer.parseInt(array[2].trim()),
                    new Engine(Integer.parseInt(array[4].trim()), array[3])));
            else
                carsarrayList.add(new JeepCar(array[0], array[1], Integer.parseInt(array[2].trim()),
                        new Engine(Integer.parseInt(array[4].trim()), array[3])));
        }
    }

    public void motion() {

        while (continueLoop()) {
            for (int i = 0; i < carsarrayList.size(); i++) {
                if(carsarrayList.get(i).getPassedRoad() < roadLenght) {
                    carsarrayList.get(i).iteration ++;
                    carsarrayList.get(i).setPassedRoad(carsarrayList.get(i).getPassedRoad() + carsarrayList.get(i).getModifiedSpeed());
                    StringBuilder builder = new StringBuilder();
                    builder.append(carsarrayList.get(i).getType()).append(".").append(carsarrayList.get(i).getName()).append(", ")
                            .append(carsarrayList.get(i).getWeight()).append(",").append(carsarrayList.get(i).engine.getName())
                            .append(", speed: ").append(carsarrayList.get(i).getModifiedSpeed())
                            .append(", passed road: " + carsarrayList.get(i).getPassedRoad());
                    System.out.println(builder);
                }
            }
        }
        for (int i = 0; i < carsarrayList.size(); i++){
            System.out.println("-----------------------------");
            System.out.println(carsarrayList.get(i).getName() + " time is: " + carsarrayList.get(i).iteration * 10);
        }
    }

    public boolean continueLoop() {
        int count = 0;
        boolean answer = true;
        for (int i = 0; i < carsarrayList.size(); i++) {
            if (carsarrayList.get(i).getPassedRoad() < roadLenght)
                answer = true;
            else {
                count++;
                if (count == carsarrayList.size())
                    answer =  false;
                else answer =  true;
            }
        }
        return answer;
    }

    public void sorting(){
        Collections.sort(carsarrayList,new ItarationSorting());
        for (int i = 0; i < carsarrayList.size(); i++){
            System.out.println(carsarrayList.get(i));
        }
    }

    public void start() throws FileNotFoundException {
        makesCars();
        System.out.println("---------------------------");
        road.makeRoad(roadLenght);
        category();
        System.out.println("----------------------------");
        motion();
        System.out.println(road.getRoadBloks().size());
        System.out.println("------------------------------");
        sorting();
    }

}
