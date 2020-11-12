package introexception;

public class Patient {

    String name;
    String socialSecurityNumber;
    int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if(yearOfBirth < 1900 | name == null) {
            throw new IllegalArgumentException("Wrong args!");
        }



        if(!new SsnValidator().isValidSsn(socialSecurityNumber)) {
            throw new IllegalArgumentException("Invalid Social Security Number: " + socialSecurityNumber);
        }

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public static void main(String[] args) {
        Patient beteg = new Patient("1","123456788", 1900);
        SsnValidator taj = new SsnValidator();
        //taj.isValidSsn("123456788");

    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
