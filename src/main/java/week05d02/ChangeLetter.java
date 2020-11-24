package week05d02;

import java.lang.reflect.Array;

public class ChangeLetter {


    public String changeVowels(String inputText) {
        char[] words = {'a', 'o', 'u', 'e', 'i', 'A', 'O', 'U', 'E', 'I'};
        String result = "";
        Boolean match = false;
        for (int i = 0; i < inputText.length(); i++) {
            for (int j = 0; j < words.length; j++) {
                if (inputText.charAt(i) == words[j]) {
                    match =true;
                }
            }
            if (match==true){
                result = result + "*";
                match=false;
            }
            else{
                result = result + inputText.charAt(i);
                match=false;
            }
        }
        return result;
    }
}
