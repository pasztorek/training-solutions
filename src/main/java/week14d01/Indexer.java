package week14d01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indexer {


    public Map<Character, List<String>> index (List<String> names){
        Map<Character, List<String>> result = new HashMap<>();

        for(String str: names){
            result.put(str.charAt(0), new ArrayList<>());
        }

        for(Character chr: result.keySet()){
            List<String> namesPerChar = new ArrayList<>();

            for(String str: names){
                if(str.charAt(0) == chr){
                    namesPerChar.add(str);
                }
                result.put(chr, namesPerChar);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Indexer idx = new Indexer();
        idx.index(List.of("Aranka", "Amália", "Balázs", "Boldizsár", "Celília", "Dezső", "Dénes", "Elemér"));
    }

}
