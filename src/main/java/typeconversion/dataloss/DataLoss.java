package typeconversion.dataloss;

public class DataLoss {

    public static void main(String[] args) {
        long szaml = 1;
        float szam3 = (long) (float) szaml;
        System.out.println(Long.MAX_VALUE);

        for(szaml=1; szaml<Long.MAX_VALUE; szaml++) {
            szam3 = (long) (float) szaml;

            if (szaml != szam3) ;

        }

    }
}