package week13d05;

public class WordChecker {


    public int counter(String word){
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        int counter =0;
        for(int i=0; i<alphabet.length(); i++) {

            if (word.toLowerCase().contains(alphabet.substring(i, i + 1))) {
                alphabet = alphabet.replace(alphabet.substring(i, i + 1), "0");
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        WordChecker wc = new WordChecker();
        System.out.println((wc.counter("elegemvan")));
    }

}
