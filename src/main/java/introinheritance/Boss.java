package introinheritance;

public class Boss extends Employee {

    double LEADERSHIP_FACTOR = 0.1;


    public Boss(String name, String address, double salary, double LEADERSHIP_FACTOR) {
        super(name, address, salary);
        this.LEADERSHIP_FACTOR = LEADERSHIP_FACTOR;
    }

    public double getSalary() {

        return salary = salary + (salary*LEADERSHIP_FACTOR);
    }

    public int getNumberOfEmployees() {


        return 1;
    }

}
