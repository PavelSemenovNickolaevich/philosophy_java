package practice.string;


/**
 * Подсчитать количество всех точек, запятых и восклицательных знаков в строке
 */
public class Task4 {

    public static void main(String[] args) {
        String one = "tr!.4466,46";
        System.out.println(count(one));

    }

    public static int count(String one) {
       int count = 0;
        for (int i=0; i < one.length(); i++) {
          if (one.charAt(i) == '!'|| one.charAt(i) == ',' || one.charAt(i) == '.' ) {
              count++;
          }
      }
        return count;
//        String result = one
//                .replace(".", "")
//                .replace("!", "")
//                .replace(",", "");
//        return one.length() - result.length();
    }

}
