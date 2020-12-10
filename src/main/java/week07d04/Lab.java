package week07d04;

import java.time.LocalDate;

public class Lab {

    String title;
    Boolean completed;
    LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
    }

    public Lab(String title, LocalDate commpletedAt) {
        this.title = title;
        this.completedAt = commpletedAt;

    }
    public void complete (LocalDate completedAt){
        this.completedAt= completedAt;

    }
    public void complete (){
        this.completedAt=LocalDate.now();

    }
}
