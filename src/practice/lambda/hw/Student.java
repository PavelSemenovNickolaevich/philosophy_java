package practice.lambda.hw;

import java.util.List;

public class Student {

    private String name;
    private String surName;
    private int course;
    private List<Integer> grades;

    public Student(String name, String surName, int course, List<Integer> grades) {
        this.name = name;
        this.surName = surName;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}
