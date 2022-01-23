package practice.lambda.tasks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.LongUnaryOperator;
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

       characterStream("boat").forEach(System.out::println);

        List<String> wordList = List.of("Test", "Boat");
        Stream<String> word = wordList.stream();

        Stream<Character>  letters = word.flatMap( w -> characterStream(w));
        System.out.println(letters);

    }

    List<String> wordList = List.of("Test", "Boat");
    Stream<String> word = wordList.stream();

    public static Stream<Character> characterStream(String s) {
        List<Character> result = new ArrayList<>();
        for (char c : s.toCharArray()) result.add(c);
        return result.stream();

    }

}
