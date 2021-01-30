package week13d05;

public class WorldChecker {


    public int counter(String world){
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        int counter =0;
        for(int i=0; i<alphabet.length(); i++) {

            if (world.contains(alphabet.substring(i, i + 1))) {
                alphabet = alphabet.replace(alphabet.substring(i, i + 1), "0");
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        WorldChecker wc = new WorldChecker();
        System.out.println((wc.counter("elegemvan")));
    }

}
