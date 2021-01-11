package week11d01;

public class DivisorFinder {


    public int findDivisors(int n){
        String numberTostring = Integer.toString(n);
        int number=0;

        for(int i=0; i<numberTostring.length(); i++){
            number = number + Integer.parseInt(numberTostring.substring(i,i+1));

        }

        return number;
    }

    public static void main(String[] args) {
        DivisorFinder div = new DivisorFinder();
        System.out.println(div.findDivisors(123));
    }
}
