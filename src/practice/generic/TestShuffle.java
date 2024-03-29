package practice.generic;

import java.util.ArrayList;


//Напишите следующий метод, который перетасовывает ArrayList:
public class TestShuffle {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(4);
        list.add(42);
        list.add(5);
        shuffle(list);


        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

    }


    public static <E> void shuffle(ArrayList<E> list) {

        for (int i = 0; i < list.size(); i++) {
            int index = (int)(Math.random() * list.size());

            E temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }

    }
}
