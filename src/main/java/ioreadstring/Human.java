package ioreadstring;

public class Human {

    private String FirstName;
    private String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Human(String firstname, String lastname) {
        FirstName = firstname;
        LastName = lastname;
    }
}
