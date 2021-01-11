package week11d01;

public class DivisorFinder {


    public int findDivisors(int n){
        String numberTostring = Integer.toString(n);
        int result=0;
        int div;

        for(int i=0; i<numberTostring.length(); i++){

            div = Integer.parseInt(numberTostring.substring(i,i+1));
                if(n%div==0){
                    result++;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        DivisorFinder div = new DivisorFinder();
        System.out.println(div.findDivisors(123));
    }
}
