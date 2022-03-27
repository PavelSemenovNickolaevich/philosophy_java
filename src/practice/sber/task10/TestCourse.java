package practice.sber.task10;

public class TestCourse {
    public static void main(String[] args) {
        CourseNew course1 = new CourseNew("«Основы программирования»");
        CourseNew course2 = new CourseNew("«Объектно-ориентированное программирование»");

        course1.addStudent("Петр Иванович Н.");
        course1.addStudent("Борис Сергеевич П.");
        course1.addStudent("Анна Дмитриевна К.");
        course1.addStudent("Юрий Гагарин");
        course1.addStudent("Герман Титов");
        course1.addStudent("Валентина Терешкова");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");
        course1.addStudent("S4");
        course1.addStudent("S5");
        course1.addStudent("S6");
        course1.addStudent("S7");

        course2.addStudent("Петр Иванович Н.");
        course2.addStudent("Анна Сергеевна Д.");

        System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < students.length; i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.println("Количество студентов по дисциплине\n"
                + course2.getCourseName() + ": " + course2.getNumberOfStudents());

        course1.dropStudent("S1");
        System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));

        course1.clear();
        System.out.println("\nКоличество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
    }
}
