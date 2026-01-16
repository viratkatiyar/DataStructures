package Recursion.Maths;

import java.util.Scanner;

public class KMultiples {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scan.nextInt();
        System.out.println("Enter value k : ");
        int k = scan.nextInt();
        kMultiples(n, k);
    }
    static void kMultiples(int n, int k){
        // base case
        if(k == 1){ // or k == 0 simply return
            System.out.print(n);
            return;
        }

        // recursive work - faith on recursion
        kMultiples(n, k - 1);

        //self work
        System.out.print(" " + n * k);
    }
}
