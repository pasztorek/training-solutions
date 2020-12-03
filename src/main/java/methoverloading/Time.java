package methoverloading;

import java.time.LocalTime;

public class Time {


    private int hours;
    private int minutes;
    private int seconds;


    public Time(int hours, int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;

    }

    public Time(int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;

    }

    public Time(int hours){
        this.hours=hours;


    }

    public Time(Time time){
        this.hours=time.hours;
        this.minutes=time.minutes;
        this.seconds=time.seconds;
    }


    public boolean isEqual(Time time){

        LocalTime parameter = LocalTime.of(time.hours,time.minutes,time.seconds);
        LocalTime init = LocalTime.of(this.hours,this.minutes,this.seconds);

        return parameter.equals(init);
    }

    public boolean isEqual(int hours, int minutes, int seconds) {

        LocalTime parameter = LocalTime.of(hours,minutes,seconds);
        LocalTime init = LocalTime.of(this.hours,this.minutes,this.seconds);

        return parameter.equals(init);
    }

    public boolean isEarlier(Time time){

        LocalTime parameter = LocalTime.of(time.hours,time.minutes,time.seconds);
        LocalTime init = LocalTime.of(this.hours,this.minutes,this.seconds);
        int compare = parameter.compareTo(init);

        return compare>0;
    }

    public boolean isEarlier(int hours, int minutes, int seconds){

        LocalTime parameter = LocalTime.of(hours,minutes,seconds);
        LocalTime init = LocalTime.of(this.hours,this.minutes,this.seconds);
        int compare = parameter.compareTo(init);

        return compare>0;
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
