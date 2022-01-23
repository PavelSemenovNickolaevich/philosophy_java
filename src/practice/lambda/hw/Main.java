package practice.lambda.hw;

import practice.lambda.tasks.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//
//Дан список студентов с полями:
//        - Имя
//        - Фамилия
//        - Номер курса в университете
//        - Список оценок за учебу
//
//        Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
//
//        Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
//
//        Список студентов данного курса, но только с полями Имя и Фамилия.
//        Список должен быть отсортированы по этим двум полям
//
//        Объект с двумя полями:
//        - Отсортированный список студентов с пункта 2
//        - Средняя оценка этих студентов
//
//        Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap

public class Main {

    public static void main(String[] args) {

        List<Student> persons = List.of(
                new Student("Ivan", "Ivanov", 20, List.of(1, 3, 5, 6)),
                new Student("Petr", "Petrov", 25, List.of(1, 5)),
                new Student("Sveta", "Svetikova", 33, List.of(3, 5, 6, 7, 9)),
                new Student("Kate", "Ivanova", 25, List.of(8, 7)),
                new Student("Slava", "Slavikov", 18, List.of(1, 2, 3)),
                new Student("Arni", "Kutuzov12324", 56, List.of(1, 5, 9, 7))
//                new Student("Arni4", "Kutuzov12324", 56, List.of(1, 5, 5, 7))
        );

//        int result = persons.stream()
//                .filter(values -> values.getGrades().size() > 3)
//                .average();

//        Map<Integer, List<List<Integer>>> map =  persons.stream()
//                .filter(value -> value.getGrades().size() > 3)
//                .map(value -> value.getGrades())
//                .mapToInt(value -> value.getGrades())
//                .average()
//                .collect(groupingBy(Student::getCourse, mapping(Student::getGrades, Function.identity())));

//        Map<Integer, List<Integer>> map =  persons.stream()
//                .filter(value -> value.getGrades().size() > 3)
//                .mapToInt(value -> value.getGrades())
//                .collect(groupingBy(Student::getCourse, mapping(summarizingInt(Student::getGrades))));
//        System.out.println(map);

//        Map<Integer, List<Integer>> mapAnotherVariable =  persons.stream()
//                .filter(value -> value.getGrades().size() > 3)
//                .collect(Collectors.toMap(Student::getCourse,Student::getGrades));
////
//        System.out.println(mapAnotherVariable);

//        Map<Integer, List<String>> map = persons.stream()
//                .collect(groupingBy(Person::getAge,
//                        mapping(Person::getFullName, toList())));
    }
}
