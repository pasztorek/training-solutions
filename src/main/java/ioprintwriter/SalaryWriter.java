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

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(fileName))) {

            for (String srt : names) {
                String title = "";

                if (srt.contains(".")) {
                    title = srt.substring(0, srt.indexOf("."));
                }


                if (title.equals("Dr")) {
                    pw.print(srt);
                    pw.print(": ");
                    pw.println(500_000);

                } else if (title.equals("Mr") || title.equals("Mrs")) {
                    pw.print(srt);
                    pw.print(": ");
                    pw.println(200_000);
                } else {
                    pw.print(srt);
                    pw.print(": ");
                    pw.println(100_000);
                }
            }
        }
                catch (IOException ioe) {
                throw new IllegalStateException();
               }


        }


}
