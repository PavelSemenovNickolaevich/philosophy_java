package practice.sber.task13;

public class TestMyString1 {
    public static void main(String[] args) {
        MyString1 s = new MyString1(new char[]{'a', 'b', 'c'});
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.equals(new MyString1(new char[]{'a', 'b', 'c'})));

        char[] chars = MyString1.valueOf(345).toChars();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}