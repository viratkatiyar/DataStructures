package Recursion.Arrays;

public class FrogJumpProblem {
    static void main() {
        int[] h = {10, 30, 40, 20};
        System.out.println("Minimum Cost : " + minCost(h, 4, 0));
    }
    static int minCost(int[] h, int n, int idx){
        if(idx == n - 1) return 0;
        int op1 = Math.abs(h[idx] - h[idx + 1]) + minCost(h, n, idx + 1);
        if(idx == n - 2) return op1; // because last se pahle(n - 2) wale ke pass only 1 choice

        int op2 = Math.abs(h[idx] - h[idx + 2]) + minCost(h, n, idx + 2);

        return Math.min(op1, op2);
    }
}
