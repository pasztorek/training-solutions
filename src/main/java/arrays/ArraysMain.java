package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain tombok = new ArraysMain();
        System.out.println(tombok.numberOfDaysAsString());
        System.out.println(tombok.daysOfWeek());

    }

   public String numberOfDaysAsString(){
        int[] napok= {31,29,31,30,31,30,31,31,30,31,30,31};
        return Arrays.toString(napok);
    }

    public List<String> daysOfWeek(){
            List<String> napok =  Arrays.asList("Hétfő", "Kedd","Szerda","Csütörtök","Péntek","Szombat","Vasárnap");


            return napok;
    }
}
