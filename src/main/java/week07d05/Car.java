package week07d05;

public class Car extends Vehicle {


    @Override
    public int getNumberOfGears() {
        return super.getNumberOfGears();
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public Car() {
        transmissionType = TransmissionType.AUTOMATIC;
    }
}
