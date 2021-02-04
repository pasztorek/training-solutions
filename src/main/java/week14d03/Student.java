package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student>{

    private String name;
    private Map<String, List<Integer>> notes = new HashMap<>();

    public Student(String name)
    {
        this.name = name;
    }

    public void addGrade(String object, Integer grade){
           if(!notes.containsKey(object)){
               notes.put(object, new ArrayList<>());
           }
            notes.get(object).add(grade);

}

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", notes=" + notes +
                '}';
    }
}
