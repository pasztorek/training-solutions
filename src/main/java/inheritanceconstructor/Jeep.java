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
        //super.fuel=super.fuel-(fuelRate*(km/100));
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
        return ((super.getFuel() + extraFuel) * super.getFuelRate() / 100) >= 0.0;
    }
}
