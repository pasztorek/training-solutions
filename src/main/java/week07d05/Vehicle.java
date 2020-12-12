package week07d05;

public class Vehicle {

    TransmissionType transmissionType = TransmissionType.MANUAL;
    int numberOfGears = 5;

    public int getNumberOfGears(){
        return this.numberOfGears;
    }

    public TransmissionType getTransmissionType(){
        return this.transmissionType;
    }
}
