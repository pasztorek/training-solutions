package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Covid19 {
    Map<String, Double> filtered = new HashMap<>();
    Map<String, Double> ordered = new LinkedHashMap<>();

    public void readFile(String file){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Covid19.class.getResourceAsStream(file)))){
            String line;

            while((line = reader.readLine()) != null) {

                String week;
                double cases;

                if (line.contains("Hungary")) {
                    week = line.substring(line.indexOf('-') + 1, line.indexOf('-') + 3);

                    if(!line.substring(line.indexOf("e,")+2, line.length()).isEmpty()){
                        cases = Double.parseDouble(line.substring(line.indexOf("e,")+2, line.length()));
                        filtered.put(week,cases);
                    }

                }
            }
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public Map<String, Double> ordering(){
        Map.Entry<String, Double> maximum = null;
        Double max = 0.0;


        for(int i=0; i<3; i++){
        for(Map.Entry<String, Double> entry: filtered.entrySet()) {

            if (entry.getValue() > max) {
                max= entry.getValue();
                maximum = entry;

            }

            }
            ordered.put(maximum.getKey(), maximum.getValue());
            filtered.remove(maximum.getKey());
            max =0.0;
        }

        return ordered;
    }

    public static void main(String[] args) {
        Covid19 c19 = new Covid19();
        c19.readFile("/data.csv");
        System.out.println(c19.ordering().toString());

    }
}