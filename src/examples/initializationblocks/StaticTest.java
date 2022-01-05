package examples.initializationblocks;

public class StaticTest {
    public static class StatClass {
        static int i = 5;
    }

    public static class StaticBlockClass {
        static {
            int a = 3;
            int b = 10;
            if (b < a)
                System.out.println(a);
            else
                System.out.println(b);
        }
    }
}