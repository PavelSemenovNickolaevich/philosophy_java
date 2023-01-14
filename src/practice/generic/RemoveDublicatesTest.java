package practice.generic;

//Напишите метод, которому передается коллекция объектов типа ArrayList
//        , а возвращается коллекция ArrayList
//        , но уже без дубликатов. Необходимо использовать метод contains() интерфейса List.

import java.util.ArrayList;

public class RemoveDublicatesTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(54);

        ArrayList<Integer> arrayList1 = removeDublicates(arrayList);
        System.out.println(arrayList1);

    }

    public static<E> ArrayList<E> removeDublicates(ArrayList<E> list) {
        ArrayList<E> arrayList = new ArrayList<>();

        for (E e: list) {
            if(!arrayList.contains(e))
            arrayList.add(e);
        }
        return arrayList;
    }
}
