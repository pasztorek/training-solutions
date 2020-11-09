package typeconversion.dataloss;

public class DataLoss {

    public static void main(String[] args) {
        long szaml = 1;
        long szam3 = 1;

        for (szaml = 1; szaml < Long.MAX_VALUE; szaml++) {
            szam3 = (long) (float) szaml;

            if (szaml != szam3) {
                System.out.println(szaml);
            }
        }
    }
    }