package week09d02;

public class FibCalculator {

    public long sumEvens(int bound) {
        long first = 0;
        long second = 1;
        long newfib = 0;
        long result = 0;

        while (newfib <= bound) {
            if ((first + second) % 2 == 0) {
                result = result + first + second;
            }

            newfib = first + second;
            first = second;
            second = newfib;

        }
        return result;
    }

    public static void main(String[] args) {
        FibCalculator fib = new FibCalculator();

        fib.sumEvens(10);

    }
}