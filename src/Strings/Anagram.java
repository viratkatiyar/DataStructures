package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Word : ");
        String s1 = scan.next();
        System.out.println("Enter Second Word : ");
        String s2 = scan.next();
        System.out.println("Are First and Second Words are Anagrams : " + areAnagrams(s1, s2));
    }
    static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
