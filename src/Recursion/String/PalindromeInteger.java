package Recursion.String;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Integer : ");
        int n = scan.nextInt();
        System.out.println("Is Palindrome : " + isPalindrome(n));
    }
    static boolean isPalindrome(int n){
        if (n < 0) return false;
        return n == reverse(n, 0);
    }

    static int reverse(int n, int rev){
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + (n % 10));
    }
}
