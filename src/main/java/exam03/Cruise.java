package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();



    public void bookPassenger(Passenger passenger){

        if(boat.getMaxPassengers()<=passengers.size()){
            throw new IllegalArgumentException("Nincs már hely");
        }
        this.passengers.add(passenger);

    }

    public double getPriceForPassenger(Passenger passenger){

        return passenger.getCruiseClass().getPriceRate()*basicPrice;
    }

    public Passenger findPassengerByName(String name){
        for(Passenger psg: passengers){
            if(psg.getName().equals(name)){
                return psg;
            }
        }
        return null;
    }

    public List<String> getPassengerNamesOrdered(){
        List<String> result = new ArrayList<>();

        for(Passenger psg: passengers){
            result.add(psg.getName());
        }
        Collections.sort(result);

        return result;
    }


    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
