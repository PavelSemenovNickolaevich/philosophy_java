package practice.task6.comparator;

import practice.task6.Student;

import java.util.Comparator;

public class Age implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
