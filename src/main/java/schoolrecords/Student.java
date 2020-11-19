package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){


    }

    public double calculateAverage(){

        return 3.0;
    }

    public double calculateSubjectAverage(Subject subject){

        return 3.0;
    }

}

