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
        String subj = subject.getSubjectName();
        Double subjAvgSum= 0.00;
        int counter= 0;

        for(Student std: students){
            if (std.calculateSubjectAverage(subject)!=0){
                subjAvgSum = std.calculateSubjectAverage(subject) + subjAvgSum;
                counter++;
             }
        }
        return subjAvgSum/counter;
    }

    public Student findStudentByName(String name) {
            if(students.size()==0){
                throw new  IllegalStateException("No students to search!");
            }
            if(name.equals("")){
                throw new IllegalArgumentException("Student name must not be empty!");
            }
            for(Student std: students){
                if(std.getName().equals(name)){
                    return std;
                }
            throw new IllegalArgumentException("Student by this name cannot be found! Kiss Rita");
            }
            return students.get(2);
            }

    public Student repetition() {
        if(students.size()==0){
            throw new  IllegalStateException("No students to select for repetition!");
        }

        return students.get(rnd.nextInt(students.size()+1));
    }

    public List<StudyResultByName> listStudyResults(){
           List<StudyResultByName> srbn = new ArrayList<>();

        for(int i=0; i<students.size(); i++){
         srbn.add(new StudyResultByName(students.get(i).getName(), students.get(i).calculateAverage()));
           }
        return srbn;

    }
    public String listStudentNames(){
        StringBuilder nevsor = new StringBuilder();

        for(Student std: students){
            nevsor = nevsor.append(std.getName()).append(", ");
        }
        nevsor.deleteCharAt(nevsor.length()-2);
        return nevsor.toString().trim();
    }
}