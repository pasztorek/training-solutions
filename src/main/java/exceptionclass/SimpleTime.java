package exceptionclass;

public class SimpleTime {

    int hour;
    int minute;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public SimpleTime(int hour, int minute) {
        if(minute >=60){
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }

        if(hour>=24){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }

        this.hour = hour;
        this.minute = minute;

    }

    public SimpleTime(String time) {

        if (time == null) {
            throw new InvalidTimeException("Time is null");
        }

        if(!time.contains(":")){
            throw new InvalidTimeException("Time is not hh:mm");
        }

        try {
            Integer.parseInt(time.substring(0,2));
        } catch (NumberFormatException e){
            throw new InvalidTimeException("Time is not hh:mm");
        }

        String[] timeString = time.split(":");

        if(Integer.parseInt(timeString[1]) >=60){
        throw new InvalidTimeException("Minute is invalid (0-59)");

        }

        if(Integer.parseInt(timeString[0]) >=24){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }

        this.hour=Integer.parseInt(timeString[0]);
        this.minute=Integer.parseInt(timeString[1]);

    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

}
