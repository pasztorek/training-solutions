package inheritanceconstructor;

public class Jeep extends Car{

    double extraFuel;
    double extraCapacity;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel){
            super(fuelRate,fuel,tankCapacity);
            this.extraFuel=extraFuel;
            this.extraCapacity=extraCapacity;
    }

    public void modifyFuelAmount(double fuel){

    }

    public void drive(int km) {
        if(!enoughFuelJeep(km)){
            throw new RuntimeException("Not enough fuel available!");
        }

        super.modifyFuelAmount(extraFuel-(getFuelRate()*(km/100)));
        if((extraFuel-(getFuelRate()*(km/100))<=0)){
            extraFuel=0.0;
        }
    }


    public double calculateRefillAmount(){

        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public boolean enoughFuelJeep(int km){
        double a = super.getFuel()+extraFuel;
        double b = super.getFuelRate()*(km/100);

        return a>b;
    }
}
