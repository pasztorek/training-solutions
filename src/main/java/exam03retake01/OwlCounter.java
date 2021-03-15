package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owls = new HashMap<>();


    public void readFromFile(BufferedReader reader) {
        String line;


        try {
            while((line = reader.readLine()) != null) {

                String splitedLine[] = line.split("=");
                owls.put(splitedLine[0],Integer.parseInt(splitedLine[1]));

            }
        }

        catch (IOException io){
            throw new IllegalStateException(io);
        }

    }



    public int getNumberOfOwls(String s) {


    return owls.get(s);
    }
}
