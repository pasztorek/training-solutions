package array;

public class ArrayMain {
    public static void main(String[] args) {

        String[] hetnapjai = {"Hétfő", "Kedd", "szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(hetnapjai[1]);
        System.out.println(hetnapjai.length);


        int[] hatvany = new int[5];
        int ketto =1;
        for (int i=0; i<=4; i++){

            hatvany[i] = (ketto*2);
            System.out.println(hatvany[i]);
            ketto = hatvany[i];
        }

        boolean[] igazhamis = new boolean[6];
        //igazhamis[0]=false;
        boolean actual =false;

        for (int i=0; i<=5; i++){
            igazhamis[i]=actual;
            System.out.println(igazhamis[i]);
            if (actual == false){
                actual=true;
            }
            else {actual =false;}

        }

    }



}
