package literals;

public class LiteralsMain{


    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        System.out.println(a+b);

        double quotient = 3/4;
        quotient = 3.0/4.0;
        System.out.println(quotient);

        long big = 3_244_444_444L;

        String s ="árvíztűrőtükörfúrógép!";

        String world = "title".toUpperCase();
        System.out.println(world);

        System.out.println(Integer.toString(1,2));
        System.out.println(Integer.toString(2,2));

    }

}
