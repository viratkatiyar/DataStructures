package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n for sieve algorithm : ");
        int n = scan.nextInt();
        System.out.println(Arrays.toString(sieveOfEratosthenes(n)));
    }
    static int[] sieveOfEratosthenes(int n){
        /*
         * Sieve of Eratosthenes Algorithm
         * --------------------------------
         * We create an array from 0 to n.
         * Index represents the number.
         * Value at index:
         *      1 -> number is prime
         *      0 -> number is not prime
         */

        // Step 1: Create an array of size n + 1 (to include n)
        int[] sieve = new int[n + 1];

        /*
         * Step 2: Initially assume all numbers are prime.
         * IMPORTANT:
         * We must use i < sieve.length
         * NOT i <= sieve.length
         * because array index goes from 0 to sieve.length - 1
         */
        for(int i = 0; i < sieve.length; i++){
            sieve[i] = 1;
        }

        // 0 and 1 are NOT prime numbers
        if(n >= 0) sieve[0] = 0;
        if(n >= 1) sieve[1] = 0;

        /*
         * Step 3: Start from 2 (first prime number)
         * We only need to run loop till i * i <= n
         *
         * Why?
         * Because if a number has a factor greater than √n,
         * it must also have a smaller factor already processed.
         */
        for(int i = 2; i * i <= n; i++){

            // If current number is still marked prime
            if(sieve[i] == 1){

                /*
                 * Step 4: Mark all multiples of i as NOT prime
                 * We start from i * i
                 *
                 * Why not 2 * i?
                 * Because smaller multiples (like 2*i, 3*i, ...)
                 * were already marked by smaller primes.
                 */
                for(int j = i * i; j <= n; j += i){
                    sieve[j] = 0;
                }
            }
        }
        return sieve;
    }
}
