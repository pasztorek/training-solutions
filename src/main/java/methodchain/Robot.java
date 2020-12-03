package methodchain;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimut;
    private List<NavigationPoint> NavigationList = new ArrayList<>();

    public Robot go(int meter){
        distance = distance+meter;
        return this;
    }

    public Robot rotate(int angle){
        azimut=azimut+angle;

        return this;
    }

    public Robot registerNavigationPoint(){

            NavigationList.add(new NavigationPoint(distance,azimut));
            return this;
    }

    public List<NavigationPoint> getNavigationList() {
        return NavigationList;
    }

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }
}
