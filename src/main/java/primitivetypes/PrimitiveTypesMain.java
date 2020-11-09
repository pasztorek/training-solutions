package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {
        PrimitiveTypes szam = new PrimitiveTypes();
        System.out.println(szam.toBinaryString(10));
        System.out.println(Integer.toBinaryString(10));

        System.out.println(szam.toBinaryString(10 ).equals(Integer.toBinaryString(10)));

        Integer sz1 = new Integer(1);
        Integer sz2 = new Integer(2);

        System.out.println(sz1+sz2);
    }
}
