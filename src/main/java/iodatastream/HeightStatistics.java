package iodatastream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> hights, Path path){

        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            dos.writeInt(hights.size());

            for(int high:hights){
                dos.writeInt(high);
            }
        }

        catch(IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}

