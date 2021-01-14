package iowritestring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Register {

    public void newMark(Path name, int mark){

        if(!Files.exists(name)) {

            try {
                Files.writeString(name, Integer.toString(mark));
            } catch (IOException ioe) {
                throw new IllegalStateException("Nem tudom írni az állományt", ioe);
            }

        }
        else{
            try {
                Files.writeString(name, Integer.toString(mark)+"\n", StandardOpenOption.APPEND);
            } catch (IOException ioe) {
                throw new IllegalStateException("Nem tudom írni az állományt", ioe);
            }

        }

    }

    public void average(Path file){
        double result=0;
        List<String> results = new ArrayList<>();

        try {
        List<String> testList = Files.readAllLines(file);
        results = testList;

        for(String srt: results){
            result = result + Integer.parseInt(srt);
        }

            Double avg = result/results.size();

            Files.writeString(file, "average: "+avg.toString(), StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            throw new IllegalStateException("Nem tudom írni az állományt", ioe);
        }
    }
}
