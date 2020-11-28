package week05d05;

public class User {

    String firstName;
    String lastName;
    String email;

    public User(String firstName, String lastName, String email) {
        if (email.contains("@") && email.contains(".")) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        } else {
            throw new IllegalArgumentException("Nem megfelelő email formatum!");
        }

    }

    public String getFullName() {
        return lastName + " " + firstName;
    }
}
