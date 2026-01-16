package Recursion.Maths;

import java.util.Scanner;

public class PrintNaturalNumbers {
    static void main() {
        System.out.print("Enter n to print natural number till n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pI(n);
        System.out.println();
        pIReverseOrder(n);
    }
    static void pI(int n){
        if(n == 1){ // base case
            System.out.print(1 + " ");
            return;
        }
        pI(n - 1);
        System.out.print(n + " ");
    }
    // ex -->  pI(4) -> pI(3) -> pI(2) -> pI(1) // method terminated here when base case condition meets
    // if method didn't meet stack overflow occurs because it has limited Memory

    static void pIReverseOrder(int n) {
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        pIReverseOrder(n - 1);
    }
}
