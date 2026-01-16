package Recursion.Maths;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to get Sum of Its Digit : ");
        int n = scan.nextInt();
        n = n >= 0 ? n : -1 * n;
        System.out.println("Sum Of Digits of " + n + " : " + sumOfDigits(n));
        scan.close();
    }
    static int sumOfDigits(int n){
        if(n < 10) return n;
        return n % 10 + sumOfDigits(n / 10);
    }
}
