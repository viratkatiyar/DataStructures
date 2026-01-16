package Recursion.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = scan.nextLine();
        System.out.println("Reversed String : " + reverseString(s, 0));
        System.out.println("Reversed String : " + reverseString2(s));
    }
    static String reverseString(String s, int idx){
        if(idx == s.length()) return "";
        return reverseString(s, idx + 1) + s.charAt(idx);
    }
    static String reverseString2(String s){
        if(s.isEmpty()) return "";
        return  reverseString2(s.substring(1)) + s.charAt(0);
    }
}
