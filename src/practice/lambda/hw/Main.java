package practice.lambda.hw;

import practice.lambda.tasks.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        List<Student> persons = List.of(
                new Student("Ivan", "Ivanov", 20, List.of(1, 3, 5, 6)),
                new Student("Petr", "Petrov", 25, List.of(1, 5)),
                new Student("Sveta", "Svetikova", 33, List.of(3, 5, 6, 7, 9)),
                new Student("Kate", "Ivanova", 25, List.of(8, 7)),
                new Student("Slava", "Slavikov", 18, List.of(1, 2, 3)),
                new Student("Arni", "Kutuzov12324", 56, List.of(1, 5, 9, 7))
        );

//        int result = persons.stream()
//                .filter(values -> values.getGrades().size() > 3)
//                .average();

        Map<Integer, List<Integer>> map =  persons.stream()
                .filter(value -> value.getGrades().size() > 3)
                .mapToInt(String::valueOf)
                .average()
                .stream()
                .collect(groupingBy(Student::getCourse, mapping(Student::getGrades, toList())));

        System.out.println(map);


//        Map<Integer, List<String>> map = persons.stream()
//                .collect(groupingBy(Person::getAge,
//                        mapping(Person::getFullName, toList())));
    }
}
