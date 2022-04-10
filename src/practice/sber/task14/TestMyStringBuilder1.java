package practice.sber.task14;

public class TestMyStringBuilder1 {
    public static void main(String[] args) {
        MyStringBuilder1 s1 = new MyStringBuilder1("Welcome to");
        MyStringBuilder1 s2 = new MyStringBuilder1(" Java");

        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.toLowerCase().toString());
        s1.append(s2);
        System.out.println(s1.toString());
        System.out.println(s1.substring(1, 4));
    }
}
