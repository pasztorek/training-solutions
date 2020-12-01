package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {

    public String selector(List<String> input){
        String result="[";

        if(input==null){
            throw new IllegalArgumentException("Nincs lista!");
        }

        for(int i=0; i<input.size(); i++){
            if(i%2>0) {
                result = result + (input.get(i));
            }
        }
            result=result+"]";
        if (input.size()==0){
            result="";
        }

        return result;
    }


    public static void main(String[] args) {
        List<String> words =  Arrays.asList("alma","körte","szilva","narancs");
        ListSelector select = new ListSelector();
        System.out.println(select.selector(words));

    }
}
