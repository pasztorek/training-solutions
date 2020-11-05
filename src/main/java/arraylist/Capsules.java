package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> kapszula = new ArrayList<>();


    public static void main(String[] args) {

        Capsules kap = new Capsules();
        kap.addLast("piros");
        kap.addLast("kék");
        kap.addLast("zöld");
        kap.addLast("feher");
        System.out.println(kap.getColors());


    }

   public void addLast(String szin){
            kapszula.add(szin);

   }
    public void addFirst(String szin){
        kapszula.add(0,szin);

    }

    public void removeFirst(String szin){
        kapszula.add(0,szin);

    }

    public void removeLast(String szin){
        kapszula.add(szin);

    }
    public List<String> getColors(){
        return kapszula;

    }

/*
    addFirst(String)
    removeFirst()
    removeLast()
    List<String> getColors()
*/
}
