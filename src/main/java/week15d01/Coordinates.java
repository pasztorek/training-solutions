package week15d01;

import java.util.HashMap;
import java.util.Map;

public class Coordinates {

    Map<Integer, Integer> coordinates = new HashMap<>();
    Integer max=0;
    Map.Entry<Integer, Integer> result = null;

    public Map.Entry<Integer, Integer> max(){
        for(Map.Entry<Integer, Integer> map : coordinates.entrySet()){
            if (map.getValue() > max){
                max=map.getValue();
                result=map;

            }
        }

        return result;
    }


    public static void main(String[] args) {
        Coordinates cor = new Coordinates();

        cor.coordinates.put(1,1);
        cor.coordinates.put(2,2);
        cor.coordinates.put(3,3);
        cor.coordinates.put(4,4);
        cor.coordinates.put(5,5);
        cor.coordinates.put(6,6);
        cor.coordinates.put(7,7);

        System.out.println(cor.max());
    }

}
