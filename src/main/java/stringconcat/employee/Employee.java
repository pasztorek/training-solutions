package stringconcat.employee;

public class Employee {

    String name;
    String job;
    int salary;

    public Employee(String name, String job, int salary) {
        if (name.isEmpty() || name == null){
            throw new IllegalArgumentException("Name must not be empty.");
        }

        if (salary<0){
            throw new IllegalArgumentException("Salary must be positive.");
        }

        if (job == null || job.isEmpty()){
            throw new IllegalArgumentException("Job must not be empty.");
        }

        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " +  job + " - " + salary + " Ft";
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }
}
