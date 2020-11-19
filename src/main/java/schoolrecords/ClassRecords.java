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

        return true;
    }

    public boolean removeStudent(Student student) {

        return true;
    }

    public double calculateClassAverage() {

        return 3.0;
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