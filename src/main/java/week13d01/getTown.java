package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class getTown {

    public String getLongestTownName(){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getTown.class.getResourceAsStream("/iranyitoszamok-varosok-2021.csv")))){



        }
            catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);

            }
        return null;
    }

}
