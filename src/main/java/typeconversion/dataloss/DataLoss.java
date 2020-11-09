package typeconversion.dataloss;

public class DataLoss {

    public static void main(String[] args) {
        long szaml = 1;
        float szam3 = (long) (float) szaml;
        System.out.println(Long.MAX_VALUE);

        for (szaml = 1; szaml < Long.MAX_VALUE; szaml++) {
            szaml = (long) szam3;

            if (szaml != szam3) {

                System.out.println(szaml);
            }
        }
    }
    }