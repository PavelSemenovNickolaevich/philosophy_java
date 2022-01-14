package practice.task6.comparator;

import practice.task6.Student;

import java.util.Comparator;

public class FullName implements Comparator<Student> {



    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
