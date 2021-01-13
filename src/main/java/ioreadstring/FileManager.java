package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path myFile;
    private List<Human> humans = new ArrayList<>();


    public FileManager(String path) {
        this.myFile = Path.of(path);
    }

    public Path getMyFile() {
        return myFile.getFileName();
    }

    public List<Human> getHumans(){
        return humans;
    }

    public void readFromFile(){

        try {
            List<String> names = Files.readAllLines(myFile);

            for(String name: names){
                String firstname = name.substring(0, name.indexOf(" "));
                String lastname = name.substring(name.indexOf(" "),name.length()-1);
                humans.add(new Human(firstname,lastname));
            }

         }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }
}
