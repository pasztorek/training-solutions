package introinheritance;

public class Person {

    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void migrate(String newAddress){
        address = newAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
