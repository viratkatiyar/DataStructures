package Recursion.Maths;

import java.util.Scanner;

public class CountDigits {
    static void main() {
        System.out.println("Enter Number to gets its count digits : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Count Digits in " + n + " : " + countDigits(n));
    }
    static int countDigits(int n){
        if(n < 10) return 1;
        // if assume last time n become 9 or 8 or 7 ... 1 then it divides and become 0 and another digit is added
        return countDigits(n / 10) + 1;
    }
}
