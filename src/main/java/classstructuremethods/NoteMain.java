package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {

        Note jegyzet = new Note();
        jegyzet.setName("Gábor ");
        jegyzet.setTopic("Java ");
        jegyzet.setText("nagyon nehéz ");

        System.out.println(jegyzet.getNoteText());
    }

}
