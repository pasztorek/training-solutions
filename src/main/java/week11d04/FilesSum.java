package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int sumNumbers(){
        StringBuilder path = new StringBuilder("number");

        int sum=0;

        for(int i=0; i<100; i++) {
            if(i<10){
                path.append("0");
                path.append(i);
                path.append(".txt");
            }
            else {
                path.append(i);
                path.append(".txt");
            }

            Path file = Path.of(path.toString());

            if(Files.isRegularFile(file)){

            try {
                String szam = Files.readString(file);
                sum = sum + Integer.parseInt(szam);

            } catch (IOException e) {
                throw new IllegalArgumentException("Nem tudom olvasni a fileokat");
            }
            }
            path = new StringBuilder("number");
        }
        return sum;
    }

    public static void main(String[] args) {
        FilesSum fs = new FilesSum();
        System.out.println(fs.sumNumbers());
    }
}
