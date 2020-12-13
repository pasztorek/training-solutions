package inheritanceconstructor;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;


    public Car(double fuelRate, double fuel, double tankCapacity){

        if(fuel>tankCapacity){
           throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }

        this.fuelRate=fuelRate;
        this.fuel=fuel;
        this.tankCapacity=tankCapacity;

    }

    public void modifyFuelAmount(double fuel){
        this.fuel+=fuel;

    }

    public void drive(int km){
        if(!enoughFuel(km)){
            throw new RuntimeException("Not enough fuel available!");
        }
        fuel=fuel-(fuelRate*(km/100));
    }

    public double calculateRefillAmount(){

        return tankCapacity-fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public boolean enoughFuel(int km){
        if(fuel-(fuelRate*(km/100))>=0.0){
            return true;
        }
        return false;
    }

}
