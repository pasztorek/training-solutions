package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {


    public Temperatures readTemperatures(String file){

        byte[] temps;

        Path filePath = Path.of(file);

        try {
            temps = Files.readAllBytes(filePath);
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read the file", ioe);
        }

        return new Temperatures(temps);
    }

}
