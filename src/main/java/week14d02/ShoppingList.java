package week14d02;

import week13d03.Teachers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ShoppingList {

    List<String>  shoppinglist = new ArrayList<>();
    Map<String, List<String>> mappedList = new HashMap<>();

    public void readFile(){

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

    public void mapping(){
        String mapKey;
        String[] goods;
        List<String> mapGoods = new ArrayList<>();

        for(String srt: shoppinglist){
            mapKey = srt.substring(0,srt.indexOf(' '));

            goods = srt.substring(srt.indexOf(' ')+1, srt.length()).split(",");
            for(String good: goods){
                mapGoods.add(good);
            }
            mappedList.put(mapKey, new ArrayList<>(mapGoods));
            mapGoods.clear();
        }
     }

    public List <String> listByCode (String code){
        List<String> result = new ArrayList<>();
        result = mappedList.get(code);
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        ShoppingList sh = new ShoppingList();
        sh.readFile();
        sh.mapping();
        System.out.println(sh.listByCode("C123"));
    }

}
