package TwoDArray;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter rows(n) : ");
        int n = scan.nextInt();
        int[][] ans = pascal(n);
        printMatrix(ans);
    }
    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            // ith row has i + 1 columns or elements
            ans[i] = new int[i + 1];
            // 1st and last element is always 1
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }
    static void printMatrix(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
