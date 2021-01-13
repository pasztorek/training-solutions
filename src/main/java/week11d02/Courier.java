package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {

        if(rides.size()>0){

            if(ride.getDay() < rides.get(rides.size()-1).getDay()){
                throw new IllegalArgumentException("Nem jó paraméter");
            }

            if((ride.getDay() == rides.get(rides.size()-1).getDay()) && (ride.getCounter() < rides.get(rides.size()-1).getCounter())){
                throw new IllegalArgumentException("Nem jó paraméter");
            }
        }

        rides.add(ride);
    }

    public int getFirstHoliday() {

        for(int i=0; i<rides.size(); i++){
            if((rides.get(i+1).getDay()-rides.get(i).getDay()) > 1){
                return rides.get(i).getDay()+1;
            }
        }

        return 0;
    }
}
