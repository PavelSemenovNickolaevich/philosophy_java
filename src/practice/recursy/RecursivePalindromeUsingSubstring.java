package practice.recursy;

public class RecursivePalindromeUsingSubstring {
    public static void main(String[] args) {
        System.out.println("ропот - это палиндром? " + isPalindrome("ропот"));
        System.out.println("топот - это палиндром? " + isPalindrome("топот"));
        System.out.println("я - это палиндром? " + isPalindrome("я"));
        System.out.println("ара - это палиндром? " + isPalindrome("ара"));
        System.out.println("ар - это палиндром? " + isPalindrome("ар"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) // простой случай
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) // простой случай
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));
    }
}