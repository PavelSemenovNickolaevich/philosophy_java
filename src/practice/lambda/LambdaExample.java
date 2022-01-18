package practice.lambda;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;

//        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);


        System.out.println(comparator.compare(4,5));

    }

}
