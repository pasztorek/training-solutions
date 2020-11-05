package finalmodifier;

public class Gentleman {

    private final  String MESSAGE_PREFIX = "Hello";

    public static void main(String[] args) {

        Gentleman koszones = new Gentleman();
        System.out.println(koszones.sayHello(" Gabi"));



    }

    public String sayHello(String name){

        return MESSAGE_PREFIX + name;

    }
}
