package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix ="Hello ";
        String name ="John Doe";
        String message = prefix + name;
        message = message + "444";

        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        String elso = "";
        String masodik = "";
        String osszefuz = elso + masodik;
        System.out.println(osszefuz.length());
        System.out.println(osszefuz);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String abc = "Abcde";

        System.out.println(abc.length());
        System.out.println(abc.substring(0,1) + " , " + abc.substring(2,3));
        System.out.println(abc.substring(0,3));
    }
}
