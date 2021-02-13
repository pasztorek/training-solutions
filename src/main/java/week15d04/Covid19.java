package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Covid19 {
    Map<String, Integer> filtered = new HashMap<>();
    Map<String, Integer> ordered = new LinkedHashMap<>();

    public void readFile(String file){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Covid19.class.getResourceAsStream(file)))){
            String line;

            while((line = reader.readLine()) != null) {

                String week;
                int cases;
                String[] data;

                if (line.contains("Hungary")) {
                    data = line.split(",");
                    week = data[1];


                    if(!line.substring(line.indexOf("e,")+2, line.length()).isEmpty()){
                        cases = Integer.parseInt(data[2]);
                        filtered.put(week,cases);
                    }

                }
            }
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public Map<String, Integer> ordering(){
        Map.Entry<String, Integer> maximum = null;
        int max = 0;


        for(int i=0; i<3; i++){
        for(Map.Entry<String, Integer> entry: filtered.entrySet()) {

            if (entry.getValue() > max) {
                max= entry.getValue();
                maximum = entry;

            }

            }
            ordered.put(maximum.getKey(), maximum.getValue());
            filtered.remove(maximum.getKey());
            max =0;
        }

        return ordered;
    }

    public static void main(String[] args) {
        Covid19 c19 = new Covid19();
        c19.readFile("/data.csv");
        System.out.println(c19.ordering().toString());

    }
}