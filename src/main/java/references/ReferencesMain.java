package references;

public class ReferencesMain {

    public static void main(String[] args) {
        Person ember1;
        Person ember2;
        Person ember3 = new Person("Gabi", 43);
        ember1 = ember3;
        ember2 = ember1;
        ember2.setName("Robi");

        System.out.println(ember1.getName());
        System.out.println(ember2.getName());
        System.out.println(ember3.getName());

        int szam1 = 24;
        int szam2 = szam1;
        szam2 += 1;


        System.out.println(szam1);
        System.out.println(szam2);

        Person ember4 = new Person("Zita",40);
        ember3 = ember4;

        System.out.println(ember3.getName());
        System.out.println(ember4.getName());
    }
}
