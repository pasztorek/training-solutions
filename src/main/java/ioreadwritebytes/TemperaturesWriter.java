package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {

    Temperatures temperatures;
    String pathString;

    public void writeTemperatures(Temperatures temperatures, String pathString){

        Path file = Path.of(pathString);
        //for(byte temp: temperatures.getData()){
        try {
            Files.write(file, temperatures.getData());
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write the file", ioe);
        }
    }

}
