package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> emberlista = new ArrayList<>();

    public Company(List<Employee> emberlista) {
        this.emberlista = emberlista;
    }

    public void addEmployee(Employee ember){
        emberlista.add(ember);

    }

    public Employee findEmploeeByName(String nev){
        for (Employee egyen : emberlista){
            if (egyen.getName().equals(nev)){
                return egyen;
            }

        }
                return null;

    }
    public List<String> listEmployeeNames(){
        List<String> nevlista = new ArrayList<>();

        for (Employee egyen: emberlista){
            nevlista.add(egyen.getName());
        }
        return nevlista;
    }


}








/*
    public static void main(String[] args) {

        Employee ember1 = new Employee(1977, "Gabi");
        Employee ember2 = new Employee(1990, "Zoli");
        Employee ember3 = new Employee(2000, "Karcsi");
        Employee ember4 = new Employee(1950, "Reni");

        List<Employee> emberlista = new ArrayList<>();

        emberlista.add(ember1);
        emberlista.add(ember2);
        emberlista.add(ember3);
        emberlista.add(ember4);

        System.out.println(ember1.getName());



    }

*/


