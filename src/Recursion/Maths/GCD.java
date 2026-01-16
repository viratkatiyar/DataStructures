package Recursion.Maths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.println(bruteGCD(num1, num2));
        System.out.println(iterativeGCD(num1, num2));
        System.out.println(recursiveGCD(num1, num2));
        sc.close();
    }
    static int bruteGCD(int num1, int num2) {
        if (num1 == 0) return num2;
        if (num2 == 0) return num1;
        int min = Math.min(num1, num2);
        for (int i = min; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
    static int iterativeGCD(int num1, int num2){
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        // Euclidean GCD Algorithm
        while (num2 != 0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
    }
    static int recursiveGCD(int num1, int num2){
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        if (num2 == 0) return num1;
        return recursiveGCD(num2, num1 % num2);
    }
}
