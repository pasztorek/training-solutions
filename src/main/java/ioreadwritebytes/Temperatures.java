package ioreadwritebytes;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public double getYearAverage(){
        double sum=0;

        for(byte temp: data){
            sum =sum + (double)temp;
        }
        return sum/365;
    }

    public double getMonthAverage(){
        double sum=0;

        for(int i=335; i<365; i++) {
            sum = sum + (double) data[i];
        }

        return sum/30;
    }

    public byte[] getData() {
        return data;
    }
}
