package stringbasic.pets;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate birth;
    private Gender gender;
    private String serial;

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Gender getGender() {
        return gender;
    }

    public String getSerial() {
        return serial;
    }

    public Pet(String name, LocalDate birth, Gender gender, String serial) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.serial = serial;
    }
}


