package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {


    public void writeAsBytes(List<String> words, Path path) {

        try (OutputStream bos = new BufferedOutputStream(Files.newOutputStream(path))) {
            for(String srt: words){
                if(!(srt.substring(0,1).equals("_"))){
                    bos.write(srt.getBytes());
                }
            }
         }

    catch(IOException ioe){
                throw new IllegalStateException("Cannot read file", ioe);
            }

            }
        }
