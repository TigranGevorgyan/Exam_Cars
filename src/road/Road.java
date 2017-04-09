package road;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Taron on 04/08/17.
 */
public class Road {

    ArrayList<RoadBlocks> road = new ArrayList<>();

    public ArrayList<RoadBlocks> makeRoad(int lenght){
        for (int i = 0; i < lenght; i++){
            int random = ThreadLocalRandom.current().nextInt(0, 4);
            switch (random){
                case 0:
                    road.add(new GoodRoadBlock());
                    break;
                case 1:
                    road.add(new NormalRoadBlock());
                    break;
                case 2:
                    road.add(new BadRoadBlock());
                    break;
                case 3:
                    road.add(new VeryBadRoadBlock());
                    break;
            }
        }
        System.out.println("Road are maked.");
        System.out.println("Road lenght is: " + lenght);
        return road;
    }

    public int getResistence(){
        return 0;
    }

}
