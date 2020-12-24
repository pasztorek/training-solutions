package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    Present present;


    public Person(String name, int age) {
        this(name, age, setPresent());

    }

    public Person(String name, int age, Present present) {

        this.name = name;
        this.age = age;
        this.present = present;
    }

    public static  Present setPresent(){
        Present present=null;

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);

        for(Present pres: Present.values()){
            if(pres.id==randomNumber){
                present=pres;
            }
        }
        return present;
    }

    public static void main(String[] args) {
        Person person = new Person("Jancsi", 10);
        System.out.println(person.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", present=" + present +
                '}';
    }
}
