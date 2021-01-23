package ioreadbytes;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

public int readBytesAndFindAs(String file){

    Path data = Path.of(file);
    int size;
    int counter=0;

    try (InputStream is = new BufferedInputStream(Files.newInputStream(data))) {

        byte[] buffer = new byte[1000];

        while ((size = is.read(buffer)) > 0){
        for(int i=0; i<size; i++){
            if(buffer[i] == 'a'){
                counter++;
            }
        }
        }
    }
    catch (IOException ioe) {
        throw new IllegalStateException("Cannot read the file", ioe);
    }
    return counter;

         }
}