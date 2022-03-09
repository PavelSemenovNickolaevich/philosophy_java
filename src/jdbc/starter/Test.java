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

        User user = new User();
        User user1 = new User();
        User user2 = new User();
        user.info();
        user1.info();
        user2.info();
        user.info();

        String a = "tetet";
        a += "rgrgrgrgrg:";
        System.out.println(a);
    }


}
