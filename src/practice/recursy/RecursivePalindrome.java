package practice.recursy;

public class RecursivePalindrome {
    public static void main(String[] args) {
        System.out.println("ропот - это палиндром? " + isPalindrome("ропот"));
        System.out.println("топот - это палиндром? " + isPalindrome("топот"));
        System.out.println("я - это палиндром? " + isPalindrome("я"));
        System.out.println("ара - это палиндром? " + isPalindrome("ара"));
        System.out.println("ар - это палиндром? " + isPalindrome("ар"));
    }

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) // простой случай
            return true;
        else if (s.charAt(low) != s.charAt(high)) // простой случай
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }
}