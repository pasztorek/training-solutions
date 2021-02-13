package week15d05;

import week15d04.Covid19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class GameOfT {

    Map<String, Integer> numOfBattles = new HashMap<>();

    public void readFile(String file){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(GameOfT.class.getResourceAsStream(file)))){
            String line;
            String[] battle;

            while((line = reader.readLine()) != null) {
                battle = line.split(",");

                for(int i=5; i<13; i++){
                    System.out.println(battle[i]);


                }


            }
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        GameOfT got = new GameOfT();
        got.readFile("/battles.csv");
    }
}
