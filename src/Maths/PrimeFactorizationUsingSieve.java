package Maths;

import java.util.Arrays;

public class PrimeFactorizationUsingSieve {
    static final int MAX = 100; // 0 ..... 30
    static int[] lpf = new int[MAX + 1];
    public static void main(String[] args) {
        int n = 100;
        sieve(n); // it has created the array lpf for you O(n*log(logn))

        // prime fact. of any temp;
        int temp = 36;
        while(temp > 1){
            System.out.println(lpf[temp]);
            temp /= lpf[temp];
        }
    }
    static void sieve(int n){
        Arrays.fill(lpf, 0);
        for (int i = 2; i * i <= n; i++) {
            if(lpf[i] == 0){
                // it means i is prime
                // we need to mark its multiples with 0 (i * i . . . . N)
                lpf[i] = i;
                for (int j = i * i; j <= n ; j += i) {
                    if(lpf[j] == 0){
                        lpf[j] = i;
                    }
                }
            }
        }
        // Mark remaining primes (those greater than sqrt(n))
        for (int i = 2; i <= n; i++) {
            if (lpf[i] == 0) {
                lpf[i] = i;
            }
        }
    }
}
