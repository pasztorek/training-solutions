package iowriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    private Path file;

    public NameWriter(Path file) {
        this.file = file;
    }

    public void addAndWrite(String name){

        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardOpenOption.APPEND)){
            bw.write(name + "\n");
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read the file", ioe);
        }
    }
}
