package practice.sber.task10;

public class CourseNew {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public CourseNew(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if(numberOfStudents  == students.length) {
            increaseSize();
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    private void increaseSize() {
        String [] temp = new String[students.length * 2 + 1];
        System.arraycopy(students, 0, temp, 0 ,students.length);
        students = temp;
    }

    public String[] getStudents() {
        String[] result = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            result[i] = students[i];
        }
        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
       for(int i = 0; i < numberOfStudents; i++) {
           if (students[i] .equals(student)) {
               for (int k = i + 1; k < numberOfStudents; k++) {
                   students[k - 1] = students[k];
               }
               numberOfStudents--;
               break;
           }
       }
    }

    /** Удаляет всех студентов с дисциплины */
    public void clear() {
        for (int i = 0; i < numberOfStudents; i++)
            students[i] = null;
        numberOfStudents = 0;
    }
}
