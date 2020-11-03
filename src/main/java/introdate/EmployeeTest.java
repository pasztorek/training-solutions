package introdate;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee employee = new Employee(1977, 12, 22, "Pasztorek Gábor");
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
    }
}
