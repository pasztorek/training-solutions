package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class SecretData {


    public static void main(String[] args) {
          char c;

        Path file = Path.of("secret.dat");

        try {
            byte[] bytes = Files.readAllBytes(file);
            for(byte word: bytes){

             word = (byte) (word+10);
             c = (char) word;
             System.out.print(c);

            }
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }
}
