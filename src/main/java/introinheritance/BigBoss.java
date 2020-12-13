package introinheritance;

public class BigBoss extends Boss{

    double bonus;


    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
    }

    public int getNumberOfEmployees(){

        return this.NumberOfEmployees;
    }

    public double getBonus(){

        return this.bonus;
    }

    public double getSalary(){

        return super.getSalary() + bonus;
    }

}
