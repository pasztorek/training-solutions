package week09d03;

import java.util.List;

public class SantaClaus {

    private List<Person> persons;

    public void getThroughChimneys(){

        for(Person person: persons){
            if(person.getAge()<14) {
                person.setPresent();
            }
        }

    }

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

}
