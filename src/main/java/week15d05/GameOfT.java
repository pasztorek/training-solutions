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
            reader.readLine();

            while((line = reader.readLine()) != null) {
                battle = line.split(",");

                for(int i=5; i<13; i++){
                    if(battle[i]!="" && (numOfBattles.containsKey(battle[i]))) {
                        numOfBattles.put(battle[i], (numOfBattles.get(battle[i])+1));
                    }

                    else {
                        numOfBattles.put(battle[i], 1);
                    }
                }
            }
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String mostBattled(){
        String result="";
        Integer max=0;

        for(Map.Entry<String, Integer> battle: numOfBattles.entrySet()){

            if(battle.getValue()>max){

                max=battle.getValue();
                result=battle.getKey();
            }
        }
        return result;
    }


    public static void main(String[] args) {
        GameOfT got = new GameOfT();
        got.readFile("/battles.csv");
        System.out.println(got.mostBattled());

    }
}
