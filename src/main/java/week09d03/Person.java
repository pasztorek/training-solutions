package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    Present present=null;


    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void setPresent(){
        Present present=null;

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);

        for(Present pres: Present.values()){
            if(pres.id==randomNumber){
                present=pres;
            }
        }
        this.present=present;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }
    }



