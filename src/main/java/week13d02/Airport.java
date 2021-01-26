package week13d02;

import week13d01.getTown;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    List<String> Schedule = new ArrayList<>();

    public void readSchedule(){

        String line="";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getTown.class.getResourceAsStream("/cities.txt")))){

            while((line = reader.readLine()) != null) {
                Schedule.add(line);

            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public String getMostDirection() {
        int direction = 0;

        for (String str : Schedule) {
            String[] flight = str.split(" ");
            if (flight[1].equals("Arrival")) {
                direction++;
            }
        }
        if (direction > (Schedule.size() / 2)) {
            return "Arrival";
        }
        return "Departure";
    }


    public String getPlane(String code) {

        for (String str : Schedule) {
            String[] flight = str.split(" ");
            if (flight[0].equals(code)) {
                return str;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        Airport ap = new Airport();
        ap.readSchedule();
        System.out.println(ap.getMostDirection());
        System.out.println(ap.getPlane("CX8486"));
    }

}
