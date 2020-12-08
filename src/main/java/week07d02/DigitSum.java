package week07d02;

public class DigitSum {

    public double sumOfDigits(int x){
        String number = Integer.toString(x);
        int pow = number.length()-1;
        double result = 0;
        double current=x;

        for(int i=number.length(); i>1; i--){
            result = result + Math.floor(current/Math.pow(10,pow));
            current = current%Math.pow(10,pow);
            pow--;
            if(pow==0){
                result=result+current;
            }
        }
        return result;
    }
}
