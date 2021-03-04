package covid;

import java.time.LocalDate;

public class Citizen {

private String name;
private String zip;
private int age;
private String email;
private int numOfVaccine;
private LocalDate lastVaccination;

    public Citizen(String name, String zip, int age, String email) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumOfVaccine() {
        return numOfVaccine;
    }

    public void setNumOfVaccine(int numOfVaccine) {
        this.numOfVaccine = numOfVaccine;
    }

    public LocalDate getLastVaccination() {
        return lastVaccination;
    }

    public void setLastVaccination(LocalDate lastVaccination) {
        this.lastVaccination = lastVaccination;
    }
}
