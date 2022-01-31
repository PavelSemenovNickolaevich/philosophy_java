package practice.regularexpressions.task;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 1. Написать программу, проверяющую, является ли введённая
 * строка адресом почтового ящика.
 * В названии почтового ящика разрешить использование только
 * букв, цифр и нижних подчёркиваний, при этом оно должно
 * начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */
public class Task1 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String regex = "[a-zA-Z]\\w*@\\w{3,}\\.(org|com)";
        String input = "dmdev@gmail.com";
        System.out.println(Pattern.matches(regex, input));
        String a = "3t535235";
        Object s = 5 ;
        Object s1 = 5.6 ;
        String c = "\"122222335п3упру4р4уру4р4122222335п3упру4р4уру4р4122222335п3упру4р4уру4р4122222335п3упру4р4уру4р4122222335п3упру4р4уру4р4122222335п3упру4р4уру4р4122222335\n" +
                "р4уру4р4122222335п3упру4р4уру4р412222р4уру4р4122222335п3упру4р4уру4р412222ааауц4ка34к4444444444444444";
        System.out.println(Arrays.toString(a.getBytes()));
        final byte[] utf8Bytes = c.getBytes("UTF-8");
        System.out.println(utf8Bytes.length);
        System.out.println(s);// prints "11"
        System.out.println(s1);// prints "11"


    }
}

