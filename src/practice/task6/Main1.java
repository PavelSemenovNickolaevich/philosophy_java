package practice.task6;

import java.util.*;

public class Main1 {

    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;

    public static void main(String[] args) {
        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        markLength4(list);
    }

    private static void markLength4(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() == TARGET_LENGTH) {
                iterator.set(TARGET_VALUE);
                iterator.add(next);
            }
        }
        for(String s: list) {
            System.out.println(s);
        };

    }
}
