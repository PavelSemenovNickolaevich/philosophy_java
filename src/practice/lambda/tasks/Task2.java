package practice.lambda.tasks;

//2. Дан список строк. Найти количество уникальных
//        строк длиной более 8 символов.

import practice.iterator.List;

import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        java.util.List<String> strings = java.util.List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16"
        );

        int result = strings.stream()
                .filter(values -> values.length() > 8)
                .collect(Collectors.toSet())
                .size();

        System.out.println(result);

        long result2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();

        System.out.println(result2);
    }
}
