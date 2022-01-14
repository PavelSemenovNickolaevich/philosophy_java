package practice.task6;

import practice.task6.comparator.Age;
import practice.task6.comparator.Average;
import practice.task6.comparator.FullName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(List.of(
                new Student("Ivan", "Ivanov", 23, 10),
                new Student("Petr", "Ivanidze", 18, 9),
                new Student("Pavel", "Testov", 24, 16),
                new Student("Sveta", "Ivanov", 23, 10),
                new Student("Alex", "Tostov", 26, 11)
        ));

        System.out.println(StudentHelper.getTheBestStudent(studentList));

        studentList.sort(new FullName());
        System.out.println(studentList);

        studentList.sort(new Age());
        System.out.println(studentList);

        studentList.sort(new Average());
        System.out.println(studentList);

        studentList.sort(new FullName().thenComparing(new Age()));
        System.out.println(studentList);
    }
}
