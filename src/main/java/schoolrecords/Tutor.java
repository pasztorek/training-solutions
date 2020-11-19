package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubject = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubject) {
        this.name = name;
        this.taughtSubject = taughtSubject;
    }

    public String getName()
    {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
           for(int i=0; i<taughtSubject.size(); i++) {
               if (taughtSubject.get(i).getSubjectName().equals(subject.getSubjectName())) {
                   return true;
               }
           }
            return false;
    }
}
