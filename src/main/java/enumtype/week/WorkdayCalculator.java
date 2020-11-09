package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {


    public List<DayType> naptipus (Day firstDay, int numberOfDays){
        List<DayType> napok = new ArrayList<>();
        Day d = firstDay;

                for(int i=0; i < numberOfDays; i++){
                    napok.add(d.getNaptipus());
                    d = nextDay(d);
        }

        return napok;
    }
    private Day nextDay(Day day){
        return Day.values()[day.ordinal()+1];
    }
}
