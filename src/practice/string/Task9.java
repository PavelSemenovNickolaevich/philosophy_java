package practice.string;

//Дана строка.
//
//        Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
//
//        Результат привести к верхнему регистру.
//
//        Например:
//
//        “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”


import java.util.SplittableRandom;

public class Task9 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {

        String value = "abc Cpddd Dio OsfWw";

        System.out.println(deleteSymbhol(value));

    }

    private static String deleteSymbhol(String value) {
        String withoutSpaceValue = value.replace(SPACE, EMPTY).toUpperCase();

        StringBuilder data = new StringBuilder(withoutSpaceValue);
        for (int i = 0; i < data.length(); i++) {
            String character = String.valueOf(data.charAt(i));
            int dupIndex = data.indexOf(character, i + 1);
            while (dupIndex != -1) {
                data.deleteCharAt(dupIndex);
                dupIndex = data.indexOf(character, i + 1);
            }
        }
        return data.toString();
    }

}
