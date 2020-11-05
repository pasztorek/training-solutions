package debug;

import java.util.ArrayList;

public class CompanyMain {






    public static void main(String[] args) {

        Company cegem = new Company(new ArrayList<>());

        Employee ember1 = new Employee(1977, "Gabi");
        Employee ember2 = new Employee(1990, "Zoli");
        Employee ember3 = new Employee(2000, "Karcsi");
        Employee ember4 = new Employee(1950, "Reni");

        cegem.addEmployee(ember1);
        cegem.addEmployee(ember2);
        cegem.addEmployee(ember3);
        cegem.addEmployee(ember4);

        System.out.println(cegem.listEmployeeNames());

    }
}
