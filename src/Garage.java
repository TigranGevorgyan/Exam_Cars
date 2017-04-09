import cars.Car;
import engine.Engine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Taron on 04/08/17.
 */
public class Garage {

    ArrayList<String> carArrayList = new ArrayList<>();
    ArrayList<String> engineArrayList = new ArrayList<>();
    ArrayList<Car> arrayList = new ArrayList<>();

    public void getCars() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\projects\\Exam\\src\\car.txt"));
        while (scanner.hasNext())
            carArrayList.add(scanner.nextLine());
    }


    public void getEngines() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("D:\\projects\\Exam\\src\\engine.txt"));
        while (scanner.hasNext())
            engineArrayList.add(scanner.nextLine());
    }

    public String getCar(int index) {
        return carArrayList.get(index);
    }

    public String getEngine(int index) {
        return engineArrayList.get(index);
    }
}
