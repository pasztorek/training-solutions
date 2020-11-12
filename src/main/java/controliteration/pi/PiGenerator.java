package controliteration.pi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PiGenerator {

    private String vers = "Nem a régi s durva közelítés, mi szótól szóig így kijön betűiket számlálva. Ludolph eredménye már, ha itt végezzük húsz jegyen. De rendre kijő még tíz pontosan, Azt is bízvást ígérhetem.";
/*
    public static void main(String[] args) {
        PiGenerator pivers = new PiGenerator();
        List<String> karakterek = new ArrayList<>(Arrays.asList(" ", ".", ","));
        int szamlalo = 0;
        String pi = "";
        boolean tizedes = false;

        for (int i = 0; i < pivers.vers.length(); i++) {

            if (!karakterek.contains(pivers.vers.substring(i, i + 1))) {
                szamlalo = szamlalo + 1;

            }

            if (karakterek.contains(pivers.vers.substring(i, i + 1))) {
                pi = pi + szamlalo;
                szamlalo = 0;
                if (tizedes == false){
                    pi = pi +".";
                    tizedes=true;
                }
            }
        }
        System.out.println(pi);
        */

    public String getPi(){
        PiGenerator pivers = new PiGenerator();
        List<String> karakterek = new ArrayList<>(Arrays.asList(" ", ".", ","));
        int szamlalo = 0;
        String pi = "";
        boolean tizedes = false;

        for (int i = 0; i < pivers.vers.length(); i++) {

            if (!karakterek.contains(pivers.vers.substring(i, i + 1))) {
                szamlalo = szamlalo + 1;

            }

            if (karakterek.contains(pivers.vers.substring(i, i + 1))) {
                pi = pi + szamlalo;
                szamlalo = 0;
                if (tizedes == false){
                    pi = pi +".";
                    tizedes=true;
                }
            }
        }
        //System.out.println(pi);
        return pi;
    }
}
