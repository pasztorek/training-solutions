package week14d03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClassNotebook {

    private List<Student> students = new ArrayList<>();


    public List<Student> sortNotebook(){
        Collections.sort(students);

        return students;
    }

    public static void main(String[] args) {
        Student std = new Student("Patrik");
        std.addGrade("biosz",2);
        std.addGrade("biosz",4);


        Student std2 = new Student("Dóri");
        std.addGrade("föci",3);
        std.addGrade("föci",1);

        ClassNotebook cnb = new ClassNotebook();
        cnb.students.add(std);
        cnb.students.add(std2);

        System.out.println(cnb.sortNotebook().toString());

    }

}
