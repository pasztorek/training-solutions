package covid;

import java.time.LocalDate;

public class Citizen {

private long id;
private String name;
private String zip;
private int age;
private String email;
private String taj;
private int numOfVaccine;
private LocalDate lastVaccination;

    public Citizen(String name, String zip, int age, String email, String taj) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
    }

    public Citizen(long id, String name, String zip, int age, String email, String taj, int numOfVaccine, LocalDate lastVaccination) {
        this.id = id;
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.numOfVaccine = numOfVaccine;
        this.lastVaccination = lastVaccination;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public int getNumOfVaccine() {
        return numOfVaccine;
    }

    public LocalDate getLastVaccination() {
        return lastVaccination;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zip='" + zip + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", taj='" + taj + '\'' +
                ", numOfVaccine=" + numOfVaccine +
                ", lastVaccination=" + lastVaccination +
                '}';
    }
}
