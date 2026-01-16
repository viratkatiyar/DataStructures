package Recursion.String;

import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = scan.nextLine();
        System.out.println("Enter character to remove : ");
        char ch = scan.next().charAt(0);
        System.out.println("Result String : " + removeOcc(s,0,ch)); // better approach
        System.out.println("Result String : " + removeOcc2(s,ch));
    }
    static String removeOcc(String s, int idx, char ch) {
        if (idx == s.length()) return "";

        String rest = removeOcc(s, idx + 1, ch);

        if (s.charAt(idx) == ch){
            return rest;
        }
        return s.charAt(idx) + rest;
    }
    static String removeOcc2(String s, char ch) {
        if (s.isEmpty()){
            return "";
        }
        String rest = removeOcc2(s.substring(1), ch);
        if (s.charAt(0) == ch) {
            return rest;
        }
        return s.charAt(0) + rest;
    }
}
