package practice.string;

public class Task6 {

    public static void main(String[] args) {

        StringBuilder value = new StringBuilder();
        for (int i =  0;  i< 1000; i++) {
            value.append(i);
        }
        System.out.println(value);
    }
}
