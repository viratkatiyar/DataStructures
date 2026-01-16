package Recursion.String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = scan.nextLine();
        System.out.println("is Palindrome String : " + isPalindrome(s, 0));
        scan.close();
    }
    static boolean isPalindrome(String s, int idx){
        if(idx == s.length() / 2) return true;
        if(s.charAt(idx) != s.charAt(s.length() - 1 - idx)) return false;
        return isPalindrome(s, idx + 1);
    }
}
