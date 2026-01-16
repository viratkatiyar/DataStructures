package Maths;
import java.util.Scanner;
public class PrimeFactorization {
    static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPrimeFactors2(n);
    }
    static void printPrimeFactors(int n){
        // Brute Force Approach
        int temp = n;
        for(int i = 2; i <= n; i++){
            while(temp % i == 0){
                System.out.print(i + "\t"); // TC = n * logn
                temp /= i;
            }
        }
    }
    static void printPrimeFactors2(int n){
        // Optimised Approach
        int temp = n;
        for(int i = 2; i * i <= n; i++){
            while(temp % i == 0){
                System.out.print(i + "\t");
                temp /= i;
            }
        }
        if(temp != 1) System.out.print(temp); // temp is a prime factor of n greater than root n
    }
}
