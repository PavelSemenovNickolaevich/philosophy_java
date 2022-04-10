package practice.sber.task13;

public class TestMyCharacter {
    public static void main(String[] args) {
        MyCharacter c = new MyCharacter('A');
        System.out.println(c.isDigit());
        System.out.println(MyCharacter.isDigit('t'));
    }
}
