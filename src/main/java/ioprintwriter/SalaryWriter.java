package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {
    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path fileName) {


        for(String srt: names){
            String title = "";

            if(srt.contains(".")) {
                title = srt.substring(0, srt.indexOf("."));
            }

            try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(fileName))) {

                if (title.equals("Dr")) {
                    pw.write(srt + ":" + 500_000);
                } else if (title.equals("Mr") || title.equals("Mrs")) {
                    pw.write(srt + ":" + 200_000);
                }

            else {
                pw.write(srt + ":" + 100_000);
            }
                    }

                catch (IOException ioe) {
                throw new IllegalArgumentException();
               }
            }

        }


}
