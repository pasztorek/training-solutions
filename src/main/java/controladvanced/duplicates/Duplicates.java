package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    List<Integer> szamsor =  List.of(3,3,3,5,6,7,8,8,6,7,9,9);
    int Ered[] = new int[12];


    public static void main(String[] args) {
        Duplicates szamlalo = new Duplicates();
        szamlalo.findDuplicates();

        for(int k=0; k<szamlalo.Ered.length; k++) {
            System.out.println(  szamlalo.szamsor.get(k).toString() + "*" + szamlalo.Ered[k]);
        }
    }
    public int[] findDuplicates(){
       String eredmeny=null;
        for(int i=0; i<szamsor.size(); i++){
            int erteki= szamsor.get(i);
            for(int j=0; j<szamsor.size(); j++){
                int ertekj = szamsor.get(j);
                if(erteki == ertekj){
                     Ered[i]=Ered[i]+1;
                }
            }

        }
        return Ered;
    }

}
