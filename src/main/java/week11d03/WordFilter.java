package week11d03;

import exceptionclass.InvalidTimeException;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {


    public List<String> wordsWithChar(List<String> words, char c){

        if(Character.toString(c)=="" || words == null){
            throw new IllegalArgumentException("Nem jó paraméter");
        }


        String convertedchar = String.valueOf(c);
        List<String> result = new ArrayList<>();

        for(String str: words){
            if(str.contains(convertedchar)){
                result.add(str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        WordFilter wf = new WordFilter();
        System.out.println(wf.wordsWithChar(List.of("alma","körte","barack","narancs","kiwi"),'a'));
    }

}
