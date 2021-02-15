package exam03;

import java.io.BufferedReader;
import java.io.IOException;


public class Histogram {

    public Histogram() {
    }

    public String createHistogram(BufferedReader br) {
        String result ="";

       try  {
            String line;
            int number=0;


            while ((line = br.readLine()) != null) {
               number =Integer.parseInt(line);
               for (int i=0; i<number; i++){
                   result =  result + "*";
               }

                result =  result + "\n";
            }


        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        return result;
    }

}