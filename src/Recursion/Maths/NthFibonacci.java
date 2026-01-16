package Recursion.Maths;

import java.util.Scanner;

public class NthFibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n to get its Fibonacci term: ");
        int n = scan.nextInt();

        int result = fib(n);
        if (result != -1) {
            System.out.println(n + "th Fibonacci Term: " + result);
        }

        scan.close();
    }
    static int fib(int n) {
        if (n < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
