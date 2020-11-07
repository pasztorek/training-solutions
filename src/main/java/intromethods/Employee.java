package intromethods;

public class Employee {

    private String name;
    private int hiringYear;
    private int salery;

    public Employee(String name, int hiringYear, int salery) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalery() {
        return salery;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void raiseSalary(int emeles){
        salery = salery + emeles;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hiringYear=" + hiringYear +
                ", salery=" + salery +
                '}';

    }
}
