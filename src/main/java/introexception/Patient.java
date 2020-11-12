package introexception;

public class Patient {

    String name;
    String socialSecurityNumber;
    int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if(yearOfBirth < 1900 | name ==null) {
            throw new IllegalArgumentException("Wrong args!");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public static void main(String[] args) {
        Patient beteg = new Patient("1","12345", 1900);

    }


}
