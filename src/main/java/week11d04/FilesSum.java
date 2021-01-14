package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int sumNumbers(){
        StringBuilder path = new StringBuilder("number");

        Path file = Path.of(path.toString());
        int sum=0;

        try {

            String szam = Files.readString(file);
            sum = Integer.parseInt(szam);

        }catch (IOException e){
            throw new IllegalArgumentException("Nem tudom olvasni a fileokat");
        }

        return sum;
    }

    public static void main(String[] args) {
        FilesSum fs = new FilesSum();
        System.out.println(fs.sumNumbers());
    }
}
