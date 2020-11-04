package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {
        ArrayOfArraysMain szorzotabla = new ArrayOfArraysMain();
        szorzotabla.multiplicationTable(5);


    }

    public int[][] multiplicationTable(int size) {
        int[][] szorzo = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                szorzo[i][j] = i * j;

            }

        }
        return szorzo;
    }

    public int[][] getValues() {
        int[] napok= {31,29,31,30,31,30,31,31,30,31,30,31};
        int [][] naptar = new int[12][];
        for (int i=0; i<=napok.length; i++){
            naptar[i][napok[i]] = i;

        }
            return naptar;
    }
}