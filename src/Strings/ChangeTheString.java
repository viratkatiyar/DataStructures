package Strings;

import java.util.Scanner;

public class ChangeTheString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word to change the string:");
        String str = scan.next();
        System.out.println(modifyString(str));
    }
    static String modifyString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char ch = str.charAt(0);

        if (Character.isUpperCase(ch)) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }
}
