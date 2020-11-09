package operators;

public class Operators {

    public boolean isEven(int n){

        return n%2 == 0;
    }

    public String multiplyByPowerOfTwo(int a,int b){

        return Integer.toString(a << b);

    }
}
