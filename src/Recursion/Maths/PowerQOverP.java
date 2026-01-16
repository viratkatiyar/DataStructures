package Recursion.Maths;

import java.util.Scanner;

public class PowerQOverP {
    static void main() {
        System.out.println("Enter Base : ");
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        System.out.println("Enter Power : ");
        int q = scan.nextInt();
        System.out.println("p^q : " + power2(p, q));
    }
    static long power(int p, int q){
        if(q == 0) return 1;
        return p * power(p, q - 1);
    }
    static long power2(int p, int q){
        if(q == 0) return 1;
        long smallPow = power2(p, q / 2);
        if(q % 2 == 0){
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }
}
