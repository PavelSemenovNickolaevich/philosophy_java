package jdbc.starter;

public class Test {

    static int a;

    public static void main(String[] args) {

//        Test test = new Test();
//        System.out.println(a);
//
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a++);

//        User user = new User();
//        User user1 = new User();
//        User user2 = new User();
//        user.info();
//        user1.info();
//        user2.info();
//        user.info();
//
//        String a = "tetet";
//        a += "rgrgrgrgrg:";
//        System.out.println(a);

        System.out.println(parseInt("4545"));

    }


    public static int parseInt(String s) {
        // s состоит из символов цифр.
        // Например, если s равно "125", то возвращаемое значение
        // должно быть равным 125.
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
        //    result = result * 10 + (s.charAt(i) - '0');
            //result = s.charAt(i) - '0';
            int a = s.charAt(i) - '0';
            result = result* 10 + a;
        }

        return result;
    }


}
