package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        int contains= 0;
        students.add(student);

        for(int i=0; i<=students.size()-1; i++) {
            if (students.get(i).getName().equals(student.getName())) {
                contains++;
           }
        }
            if (contains > 1) {
                students.remove(student);
                return false;
            }
        return true;
    }

    public boolean removeStudent(Student student) {

        for(int i=0; i<=students.size()-1; i++) {
            if (students.get(i).getName().equals(student.getName())) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() {
        double avgsum = 0.00;
        double avgclasssum =0.00;

        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        for (Student std : students) {
            avgsum = std.calculateAverage()+avgsum;
        }

        if (avgsum == 0.00) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }

   //     for (Student std : students) {
   //         avgsum = avgsum + std.calculateAverage();
   //     }

        return avgsum / students.size();
    }

    public double calculateClassAverageBySubject(Subject subject) {

        return 3.0;
    }

    public Student findStudentByName(String name) {

        return findStudentByName(name);
    }

    public Student repetition() {

        return repetition();
    }

    public List<StudyResultByName> listStudyResults(){

        return listStudyResults();
    }
    public String listStudentNames(){

        return"1";
    }
}