package practice.task6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        markLength4(list);
    }

    private static void markLength4(List<String> list) {
        String stars = "****";
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() == 4) {
                iterator.set(stars);
                iterator.add(next);
                //iterator.remove();
            }
            //  System.out.println(next);
        }
        for(String s: list) {
            System.out.println(s);
        };


    }
}
