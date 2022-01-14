package practice.task6;

import java.util.List;

public class StudentHelper {


    public static Student getTheBestStudent(List<Student> studentList) {
        Student theBestStudent = null;
        for(Student student: studentList) {
            if(theBestStudent == null || theBestStudent.getAverage() < student.getAverage()) {
                theBestStudent = student;
            }
        }
        return theBestStudent;
    }
}
