package practice.collections.practice;

//1. Написать метод, который принимает целочисленный список и возвращает
//        целочисленный список только с нечетными значениями.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 3, 4, 5 ));
        System.out.println(getOdd(list));

    }

    private static List<Integer> getOdd(List<Integer> num) {
        List<Integer> newList = new ArrayList<>();
        for (int n: num) {
            if (n % 2 != 0) {
                newList.add(n);
            }
        }
        return newList;
    }
}
