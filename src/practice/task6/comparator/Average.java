package practice.task6.comparator;

import practice.task6.Student;

import java.util.Comparator;

public class Average implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAverage(), o2.getAverage());
    }
}
