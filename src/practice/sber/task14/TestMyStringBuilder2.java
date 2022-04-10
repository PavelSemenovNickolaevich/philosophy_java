package practice.sber.task14;

public class TestMyStringBuilder2 {
    public static void main(String[] args) {
        MyStringBuilder2 s1 =
                new MyStringBuilder2(new char[]{'a', 'b', 'c', 'd', 'p'});
        MyStringBuilder2 s2 = new MyStringBuilder2("xyz");

//    System.out.println(s1.length());
//    System.out.println(s1.charAt(3));
//
//    s2.append(123456789);
//
//    System.out.println(s2.toString());
//    System.out.println(s1.substring(1, 2));
//
//    s1.reverse();
//    System.out.println(s1.substring(2));
        System.out.println(s1.toUpperCase().toString());
    }
}
