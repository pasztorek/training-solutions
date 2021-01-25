package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class getTown {

    public String getLongestTownName(){
            String longestTown="";
            String line;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getTown.class.getResourceAsStream("/iranyitoszamok-varosok-2021.csv")))){



            while((line = reader.readLine()) != null) {

                String[] town = line.split(";");

                if(longestTown.length() < town[1].length()){
                    longestTown = town[1];

                }
                // System.out.println(line);
            }
        }
            catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
            }
        return longestTown;
    }

    public static void main(String[] args) {
        getTown gt = new getTown();
        System.out.println(gt.getLongestTownName());
    }
}
