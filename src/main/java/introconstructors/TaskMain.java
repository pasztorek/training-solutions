package introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task feladat = new Task("Feladat,","Konstruktor");
        feladat.start();
        System.out.println(feladat.getStartDateTime().toString());
        feladat.setDuration(20);

        System.out.println(feladat.toString());
    }

}
