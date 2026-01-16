package Strings;

import java.util.Scanner;

public class PrintAllSubstrings {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scan.nextLine();
        printSubstrings(str);
    }
    static void printSubstrings(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.print(s.substring(i, j + 1)+ " ");
            }
            System.out.println();
        }
    }
}
