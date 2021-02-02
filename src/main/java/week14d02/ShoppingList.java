package week14d02;

import week13d03.Teachers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    public void readFile(){

        List<String>  shoppinglist = new ArrayList<>();
        String line="";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Teachers.class.getResourceAsStream("/shoppinglist.txt")))){

            while((line = reader.readLine()) != null) {
                shoppinglist.add(line);
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

}
