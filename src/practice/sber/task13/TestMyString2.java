package practice.sber.task13;

public class TestMyString2 {

    public static void main(String[] args) {

        MyString2 s = new MyString2(new char[]{'a', 'b', 'c'});


        char[] chars = MyString2.valueOf(true).toChars();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
