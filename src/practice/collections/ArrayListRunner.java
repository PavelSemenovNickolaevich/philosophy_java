package practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0 ; i < 10; i++) {
            integers.add(i);;
        }
        for(int i: integers) {
            System.out.println(i);
        }
    }
}
