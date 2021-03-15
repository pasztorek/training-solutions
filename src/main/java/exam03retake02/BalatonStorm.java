package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {


    public List<String> getStationsInStorm(BufferedReader reader) {
        List<String> result = new ArrayList<>();
        String line;
        String[] splitedAllomas=null;
        String[] splitedLevel=null;

        try{
        while( (line = reader.readLine()) != null   ){
            if(line.contains("allomas")){
                splitedAllomas = line.split("\"");
            }
            if(line.contains("level")){
                splitedLevel = line.split("\":");
                Character.getNumericValue(splitedLevel[1].charAt(1));
                if(Character.getNumericValue(splitedLevel[1].charAt(1))>=3){
                        result.add(splitedAllomas[3]);
                }
            }

            }

        }
        catch (IOException io){
            throw new IllegalStateException(io);
        }

        result.sort(Collator.getInstance(new Locale("hu", "HU")));

        return result;
    }
}
