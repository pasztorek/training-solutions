package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client kliens = new Client();
        kliens.setName("Gabi");
        kliens.setYear(20);
        kliens.setAddress("London");

        System.out.println(kliens.getName() + kliens.getYear() + kliens.getAddress());

        kliens.migrate("Barcelona");
        System.out.println(kliens.getName() + kliens.getYear() + kliens.getAddress());


    }

}
