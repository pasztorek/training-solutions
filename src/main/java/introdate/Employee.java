package introdate;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate DateOfBirth;
    private LocalDate beginEmployement;

    public Employee(int year, int month, int day, String name) {
        this.name = name;
        this.DateOfBirth = LocalDate.of(year, month, day);
        this.beginEmployement = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public LocalDate getBeginEmployment() {
        return beginEmployement;
    }

    public void setName(String name) {
        this.name = name;
    }

}
