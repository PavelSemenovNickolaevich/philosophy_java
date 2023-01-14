package practice.generic;


import java.util.ArrayList;

//Напишите следующий метод, который сортирует ArrayList:
public class TestSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(4);
        list.add(42);
        list.add(5);
        TestSort.<Integer>sort(list);

        System.out.print(list);
    }

    /** Сортирует массив сравнимых объектов */
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.size() - 1; i++) {
            // Найти наименьшее значеие в list[i+1..list.length-2]
            currentMin = list.get(i);
            currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.compareTo(list.get(j)) > 0) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            // Переставить list[i] и list[currentMinIndex] при необходимости
            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
