package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IndexCounter {


    public int getNumber(){
        Path index = Path.of("index.html");
        int counter=0;
        try (BufferedReader reader = Files.newBufferedReader(index)) {
            String line;

            while((line = reader.readLine()) != null) {
                       if(line.toLowerCase().contains("koronavírus") || line.toLowerCase().contains("koronavirus")){
                    counter++;
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return counter;
    }
    public static void main(String[] args) {
        IndexCounter ic = new IndexCounter();
        System.out.println(ic.getNumber());
    }
}
