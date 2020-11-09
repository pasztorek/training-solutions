package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        Operators a = new Operators();

        System.out.println( a.isEven(4));

        System.out.println(Integer.toBinaryString(16));
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toBinaryString(16 >> 1));
        System.out.println(Integer.toBinaryString(16 << 1));
        System.out.println(Integer.toBinaryString(13 >> 1));
        System.out.println(Integer.toBinaryString(13 << 1));

        System.out.println(a.multiplyByPowerOfTwo(8,2));

    }
}
