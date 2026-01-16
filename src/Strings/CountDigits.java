package Strings;

import java.util.Scanner;

public class CountDigits {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to check its digits : ");
        int n = scan.nextInt();
        System.out.println("Number of Digits in a Number : " + countDigits(n));
    }
    static int countDigits(int n){
        String str = "";
        str += n;
        return n > 0 ? str.length() : str.length() - 1;
    }
}
