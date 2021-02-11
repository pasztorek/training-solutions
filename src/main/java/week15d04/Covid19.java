package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Covid19 {
    Map<String, Double> result = new HashMap<>();

    public void readFile(String file){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Covid19.class.getResourceAsStream(file)))){
            String line;

            while((line = reader.readLine()) != null) {

                String week;
                double cases;

                if (line.contains("Hungary")) {
                    week = line.substring(line.indexOf('-') + 1, line.indexOf('-') + 3);
                    cases = Double.parseDouble(line.substring(line.indexOf("e,")+2, line.length()));
                    result.put(week,cases);
                }
            }
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        Covid19 c19 = new Covid19();
        c19.readFile("/data.csv");

    }
}