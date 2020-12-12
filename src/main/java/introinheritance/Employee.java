package introinheritance;

public class Employee extends Person {

    double salary;

    public Employee(String name, String address, double salary){
        super(name,address);
        this.salary=salary;

    }

    public double getSalary(){
            return salary;
    }

    public void raiseSalary(int percent){
            salary=salary+(salary/100)*percent;
    }

}
