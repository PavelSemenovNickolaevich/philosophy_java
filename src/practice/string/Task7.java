package practice.string;

/*
Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 */

public class Task7 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String value = "12321";
       boolean result1 = isPalindrome(value);
       boolean result = isPalindrome2(value);
       System.out.println(result);
       System.out.println(result1);

    }

    private static boolean isPalindrome(String value) {
        int b = value.length();
        for(int i = 0; i < b/2; i++)
            if (value.charAt(i) != value.charAt(b - i - 1)) return false;
            return true;
    }

    private static Boolean isPalindrome2(String value) {
        String withoutSpaceValue = value.replace(SPACE, EMPTY);
        return new StringBuilder(withoutSpaceValue).reverse().toString().equalsIgnoreCase(withoutSpaceValue);
    }
}
