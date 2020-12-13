package introinheritance;

public class Boss extends Employee {

    double LEADERSHIP_FACTOR=0.1;
    int NumberOfEmployees;


    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        NumberOfEmployees = numberOfEmployees;
    }

    public double getSalary() {

        return salary + (salary*LEADERSHIP_FACTOR*getNumberOfEmployees());
    }

    public int getNumberOfEmployees() {
        return NumberOfEmployees;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }
}
