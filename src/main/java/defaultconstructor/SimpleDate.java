package defaultconstructor;

import java.util.ArrayList;
import java.util.List;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day){

        List<Integer> months = List.of(31,28,31,30,31,30,31,31,30,31,30,31);
        boolean leapYear=false;

        if(year<=1900 || month>12 || day>31){
            throw new IllegalArgumentException("One or more given parameter cannot be applied!" + " " + year+ ", " + month+ ", " + day);
        }

        if (year % 4 == 0) {
            if ((year % 100 != 0 || year % 400 == 0)) {
                leapYear=true;
                if(day!=29){
                    throw new IllegalArgumentException("One or more given parameter cannot be applied!" + " " + year+ ", " + month+ ", " + day);
                }
            }
        }

        if(months.get(month-1)<=day && leapYear == false){
            throw new IllegalArgumentException("One or more given parameter cannot be applied!" + " " + year + ", " + month + ", " + day);
        }



        this.year=year;
        this.month=month;
        this.day=day;

    }

    public int getYear(){

        return year;
    }

    public int getMonth(){

        return month;
    }

    public int getDay(){

        return day;
    }

}
