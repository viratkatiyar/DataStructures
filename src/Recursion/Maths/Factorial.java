package Recursion.Maths;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to get its factorial: ");
        int n = scan.nextInt();

        int result = fact(n);
        if (result != -1) {
            System.out.println("Factorial of " + n + " : " + result);
        }
        scan.close();
    }

    static int fact(int n) {
        if (n < 0) {
            System.out.println("Factorial of negative integers is not possible");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
