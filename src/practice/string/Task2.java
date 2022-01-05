package practice.string;


//Написать ф., принимающую 2 парметра:  строку и слово  и возвращающую true, если строка начинается и заканчичвается этим словаом


public class Task2 {
    public static void main(String[] args) {
        String one = "test";
        String two = "test one two test1";
        System.out.println(method(one, two));
    }

    static Boolean method(String one, String two) {
        if (two.startsWith(one) && two.endsWith(one)) {
            return true;
        }
        return false;
    }

}
