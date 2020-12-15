package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    static List<Integer> lottoSzamok = new ArrayList<>();

    public static  List<Integer> getNumbers(){
        Random rnd = new Random();
        int actual;

        while (lottoSzamok.size()<5) {
            actual = rnd.nextInt(90) + 1;
            if(!lottoSzamok.contains(actual)){
                lottoSzamok.add(actual);
            }
        }
        return lottoSzamok;
    }

}
