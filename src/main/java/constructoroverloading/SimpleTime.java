package constructoroverloading;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;

    }

    public SimpleTime(int hours){
        this.hours=hours;


    }
    public SimpleTime(SimpleTime time){
            this.hours= time.getHours();
            this.minutes=time.getMinutes();

    }

    public int difference(SimpleTime time){
        int parameterSum = (time.getHours()*60) + time.getMinutes();
        int currentSum = (this.hours*60)+this.minutes;

        return currentSum-parameterSum;
    }
    public String toString(){

        return hours + ":" + minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {

        return minutes ;
    }
}
