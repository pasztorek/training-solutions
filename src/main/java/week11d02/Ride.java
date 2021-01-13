package week11d02;

public class Ride {

    private int day;
    private int counter;
    private long distance;

    public int getDay() {
        return day;
    }

    public int getCounter() {
        return counter;
    }

    public long getDistance() {
        return distance;
    }

    public Ride(int day, int counter, long distance) {
        this.day = day;
        this.counter = counter;
        this.distance = distance;
    }
}
