import cars.Car;

import java.util.Comparator;

/**
 * Created by Taron on 04/08/17.
 */
public class ItarationSorting implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.iteration - o2.iteration;
    }
}
