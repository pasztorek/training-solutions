package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee dolgozo = new  Employee("Gabi", 2020, 999);

        System.out.println(dolgozo);

        dolgozo.raiseSalary(1);

        System.out.println(dolgozo);
    }
}
