package week07d04;

import java.time.LocalDate;

public class Lab {

    String title;
    Boolean completed;
    LocalDate completedAt;

    public Lab (String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate commpletedAt) {
        this.title = title;
        this.completedAt = commpletedAt;

    }
    public void complete (LocalDate completedAt){
        this.completedAt= completedAt;
        this.completed=true;

    }
    public void complete (){
        this.completedAt=LocalDate.now();
        this.completed=true;

    }

    @Override
    public String toString() {
        return title +
                ", completed=" + completed +
                ", completedAt=" + completedAt;
    }

    public static void main(String[] args) {
        Lab lab = new Lab("Java");
    }
}
