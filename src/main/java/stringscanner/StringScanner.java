package stringscanner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        String del;
        del = delimiter;

        if (delimiter == null && !intString.contains(" ")) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

        if (delimiter == null) {
            del = " ";
        }

        Scanner szoveg = new Scanner(intString).useDelimiter(del);
        int sum = 0;

        while (szoveg.hasNext()) {
            try {

               sum = sum + (Integer.parseInt(szoveg.next()));
            } catch (IllegalArgumentException ex) {
                throw new IllegalArgumentException ("Incorrect parameter string!", ex);
            }

        }
        return sum;
    }


    public int readAndSumValues(String intString){
        Scanner szoveg = new Scanner(intString);
        int sum=0;

        while (szoveg.hasNext()){
            sum = sum+(Integer.parseInt(szoveg.next()));
        }

        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word){
            if(text == null || text.equals("")){
            throw new IllegalArgumentException ("Incorrect parameter string!");
        }

        if(text.trim().equals("")){
            throw new IllegalArgumentException ("Incorrect parameter string!");
        }

        if(word == null || word.equals("")){
            throw new IllegalArgumentException ("Incorrect parameter string!");
        }

        Scanner sor = new Scanner(text);
        String eredmeny= "";


        while(sor.hasNextLine()){
            String line = sor.nextLine();
            if(line.contains(word)) {
               // System.out.println(line);
                eredmeny = eredmeny + line;
                eredmeny = eredmeny+"\n";
            }
        }
        return eredmeny.trim();
    }
}
