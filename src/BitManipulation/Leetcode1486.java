package BitManipulation;

public class Leetcode1486 {
    static void main(String[] args) {
        int res = xorOperation(4, 3);
        System.out.println(res);
    }
    // Helper function to compute XOR from 0 to x
    static int xorTill(int x) {
        if (x % 4 == 0) return x;
        if (x % 4 == 1) return 1;
        if (x % 4 == 2) return x + 1;
        return 0;
    }

    static int xorOperation(int n, int start) {
        int s = start >> 1;        // Divide start by 2
        int e = s + n - 1;

        int result = xorTill(e) ^ xorTill(s - 1);

        // If start is odd, final answer must adjust last bit
        if ((start & 1) == 1) {
            result = (result << 1) | (n & 1);
        } else {
            result = result << 1;
        }

        return result;
    }
}
