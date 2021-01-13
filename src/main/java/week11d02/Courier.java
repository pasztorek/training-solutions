package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public int getFirstHoliday() {
    //    int lastDay=rides.get(0).getDay();

        for(int i=0; i<rides.size(); i++){
            if((rides.get(i+1).getDay()-rides.get(i).getDay()) > 1){
                return i+1;
            }
        }
        return 99;
    }
}
