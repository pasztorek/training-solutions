package week15d05;

import week15d04.Covid19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GameOfT {

    public void readFile(String file){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Covid19.class.getResourceAsStream(file)))){
            String line;

            while((line = reader.readLine()) != null) {

            }
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        GameOfT got = new GameOfT();
        got.readFile("battels.csv");
    }
}
