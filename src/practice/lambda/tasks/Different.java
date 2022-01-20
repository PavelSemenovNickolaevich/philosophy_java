package practice.lambda.tasks;

import java.math.BigInteger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Different {

    public static void main(String[] args) {

        Stream<String> song = Stream.of("gently", "down", "the");
        song.filter(w -> w.length() > 5).forEach(System.out::println);
      //  song.forEach(System.out::println);

        Stream<String> echos = Stream.generate(() -> "Echo");
//        echos.forEach(System.out::println);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        //integers.forEach(System.out::println);
        String context = "test qwert ytyty";
        Boolean test = context.isEmpty();
        System.out.println(test);
        Stream<String> words = Pattern.compile("[\\P{L}]+").splitAsStream(context);
        words.forEach(System.out::println);



    }
}
