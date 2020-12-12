package week07d05;

public class Motorcycle extends Vehicle{


    @Override
    public int getNumberOfGears() {
        return super.getNumberOfGears();
    }

    @Override
    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public Motorcycle() {
        transmissionType= TransmissionType.SEQUENTIAL;
    }
}
