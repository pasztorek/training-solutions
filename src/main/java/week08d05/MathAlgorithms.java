package week08d05;

public class MathAlgorithms {

    public static  int greatestCommonDivisor(int number1, int number2){
        int swap;
        int result=0;

        if(number2>number1) {
            swap=number1;
            number1=number2;
            number2=swap;
        }

            for(int i=1; i<=number2; i++){
                if((number1%i)+(number2%i)==0){
                   result=i;
                }

            }
        return result;
    }
}
