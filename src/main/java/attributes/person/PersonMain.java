package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        Person ember1 = new Person("Laci"," 000123" );
        Address cim1 = new Address("Magyarorszag","Sopron", "Kocsi utca 10", "8000");
        ember1.moveTo(cim1);

        System.out.println(ember1.getAddress().addressToString());
        System.out.println(ember1.personToString());

    }
}
