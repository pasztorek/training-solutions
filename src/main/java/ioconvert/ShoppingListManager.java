package ioconvert;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> goods){

        try (Writer writer = new OutputStreamWriter(new BufferedOutputStream(os))) {
            for (String good : goods) {
                writer.write(good +"\n");
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

    public List<String> loadShoppingList(InputStream is){
        List<String> result = new ArrayList<>();

        try (BufferedReader read = new BufferedReader(new InputStreamReader(is))) {
            String line;

            while ((line = read.readLine()) != null) {
                    result.add(line);
            }

        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return result;

    }

}


