package practice.string;


//Замените все грустные смайлы :( на веселые :)
public class Task1 {



    public static void main(String[] args) {
        String test = "test :( test :( ttttt :)";
        String result = replace(test);
        System.out.println(result);

        int h = 770 % 100;
        System.out.println(h);
    }

    public static String replace(String test) {
        return test.replace(":(", ":)");
    }



}
