package practice.collections.practice;

//2. Написать метод countUnique, который принимает целочисленный
//        списк в качестве параметра и возвращает количество уникальных
//        целых чисел в этом списке.
//        При получении пустого списка метод должен возвращать 0.
//        Пример:
//        [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        List<Integer>  list = List.of(1, 4, 4, 4, 5);
        System.out.println(countUnique(list));

    }

    private static int countUnique(List<Integer> list){
        Set<Integer> setList = new HashSet<>(list);
        return setList.size();
    }
}
