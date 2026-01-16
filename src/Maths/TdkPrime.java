package Maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class TdkPrime {

    /*
     * ============================================
     *          SPOJ - TDKPRIME PROBLEM
     *        "Finding the Kth Prime Number"
     * ============================================
     *
     * Problem Summary:
     * ----------------
     * You are given Q queries.
     * Each query contains a number K.
     * For each query, print the Kth prime number.
     *
     * Constraints:
     * ------------
     * 1 <= Q <= 50000
     * 1 <= K <= 5000000
     *
     * Important Observation:
     * ----------------------
     * The 5,000,000th prime is 86,028,121.
     * So we must generate primes up to ~90 million.
     *
     * Efficient Approach Required:
     * ----------------------------
     * Brute force will NOT work.
     * Use:
     *   - Sieve of Eratosthenes
     *   - Precomputation
     *   - Fast I/O
     */


    // ============================================
    // STEP-WISE PRACTICE QUESTIONS
    // ============================================


    // 1️⃣ What is the maximum limit required for sieve?
    // Why can't we sieve only till 5,000,000?


    // 2️⃣ How many primes exist up to 90 million approximately?
    // Use Prime Number Theorem idea.


    // 3️⃣ What data structure should be used?
    // boolean[] ?
    // int[] ?
    // ArrayList<Integer> ?
    // Why?


    // 4️⃣ How will you store primes so that
    // answering each query becomes O(1)?


    // 5️⃣ Why must sieve be done only once?


    // 6️⃣ What is the time complexity of sieve?
    // Explain why it is O(n log log n)


    // 7️⃣ What is the space complexity?
    // Is boolean array enough?


    // 8️⃣ Why is Fast I/O required in this problem?


    // 9️⃣ What happens if we compute prime for every query separately?
    // Analyze time complexity.


    // 🔟 How would you optimize memory usage further?
    // (Hint: Bitset / odd numbers only)


    /*
     * ============================================
     * IMPLEMENTATION PLAN (DO NOT CODE HERE)
     * ============================================
     *
     * Step 1: Read all queries.
     * Step 2: Find maximum K among queries.
     * Step 3: Run sieve up to safe upper bound (~90 million).
     * Step 4: Store primes in an array.
     * Step 5: Answer each query using direct indexing.
     *
     * DO NOT IMPLEMENT HERE.
     * Practice writing full optimized code separately.
     */
    static final int MAX = (int)9e7; // upper limit to generate 5M Primes
    static ArrayList<Integer> primes = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // we store all results in this StringBuilder then print at the end
        int t = Integer.parseInt(br.readLine()); // number of queries

        // Precompute primes
        sieve();

        while(t-- > 0){ // shortcut
            int n = Integer.parseInt(br.readLine()); // taking each query
            sb.append(primes.get(n - 1)).append("\n");
        }
        System.out.print(sb);

    }
    // sieve of Eratosthenes
    static void sieve(){
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true); // use when we want to fill whole array with a single value
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= MAX ; i++) {
            if(isPrime[i]){
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= MAX; i++) {
            if(isPrime[i]){
                primes.add(i);
            }
        }
    }









}
