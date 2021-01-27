package week13d03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teachers {

    List<String> Schedule = new ArrayList<>();

    public void readSchedule(){

        String line="";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Teachers.class.getResourceAsStream("/beosztas.txt")))){

            while((line = reader.readLine()) != null) {
                Schedule.add(line);
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public int Hours(String name){
        int sum=0;

        for(int i=0; i<Schedule.size(); i=i+4) {
            if (Schedule.get(i).equals(name)){
                sum = sum + Integer.parseInt(Schedule.get(i+3));
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Teachers tch = new Teachers();
        tch.readSchedule();
        System.out.println(tch.Hours("Bagoly Barbara"));

    }

}
