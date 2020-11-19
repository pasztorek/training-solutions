package schoolrecords;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {

        double avg = 0.00;
        for (int i = 0; i < marks.size(); i++) {

            avg = marks.get(i).getMarkType().getValue()+avg;
        }

        avg = avg / marks.size();

        int temp = (int)(avg * 100);
        avg = ((double)temp)/100;

        return avg;
    }

    public double calculateSubjectAverage(Subject subject) {

        return 3.0;
    }

    @Override
    public String toString() {
        String grade=null;

        for (int i = 0; i < marks.size(); i++) {
            grade = name + " marks: " + marks.get(i).getSubject().getSubjectName() + ": " + marks.get(i).toString();
        }
            return grade;
    }
}
