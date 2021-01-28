package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees){

        String template;
        String result="";

        try (BufferedReader reader = Files.newBufferedReader(file)){
                template = reader.readLine();
                String empconv = template;

                for(Employee emp: employees){
                    empconv = empconv.replace("{nev}",emp.getNev());
                    empconv = empconv.replace("{ev}",emp.getEv()) + "\n";
                    result = result.concat(empconv);
                    empconv = template;
                }
            }

        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }

        return result;
    }

    public static void main(String[] args) {
        Path path = Path.of("employees.txt");
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("John Doe","1980"));
        employee.add(new Employee("Jack Doe","1990"));
        TemplateMerger tm = new TemplateMerger();
        System.out.println(tm.merge(path, employee));
    }

}
