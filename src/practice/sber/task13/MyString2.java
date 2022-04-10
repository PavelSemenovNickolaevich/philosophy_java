package practice.sber.task13;

public class MyString2 {

    private char[] chars;


    public MyString2(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);

    }

    public MyString2 substring(int begin) {
        char[] temp =  new char[chars.length - begin];
        for (int i = begin; i < temp.length; i++) {
           temp[i - begin] = chars[i];
        }
        return new MyString2(temp);
    }

    public MyString2 toUpperCase() {
        char[] temp = new char[chars.length];
        for (int i = 0 ; i < temp.length; i++) {
            temp[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString2(temp);
    }

    public char[] toChars() {
        return chars;
    }

    public static MyString2 valueOf(boolean d) {
        if (d)
            return new MyString2(new char[]{'t', 'r', 'u', 'e'});
        else
            return new MyString2(new char[]{'f', 'a', 'l', 's', 'e'});
    }
}
