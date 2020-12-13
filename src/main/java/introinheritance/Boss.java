package introinheritance;

public class Boss extends Employee {

    double LEADERSHIP_FACTOR=0.1;
    int NumberOfEmployees;


    public Boss(String name, String address, double salary, double LEADERSHIP_FACTOR) {
        super(name, address, salary);
        this.LEADERSHIP_FACTOR = this.LEADERSHIP_FACTOR*LEADERSHIP_FACTOR;
    }

    public double getSalary() {

        return salary + (salary*LEADERSHIP_FACTOR);
    }

    public double getNumberOfEmployees() {
        return LEADERSHIP_FACTOR;
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
