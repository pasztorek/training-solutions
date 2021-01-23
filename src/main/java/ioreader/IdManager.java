package ioreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    private final List<String> ids = new ArrayList<>();

    public void readIdsFromFile(String IdFile) {

        Path file = Path.of(IdFile);
        String line;

        try (BufferedReader reader = Files.newBufferedReader(file))
        {
            while( (line = reader.readLine()) != null) {
                ids.add(line);
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

     List<String> getIds() {
        return new ArrayList<>(ids);
    }
}


