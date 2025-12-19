package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row of 2D Array : ");
        int m = scan.nextInt();
        System.out.println("Enter column of 2D Array : ");
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter matrix elements : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        printSpiral(arr, m, n);
    }
    static void printSpiral(int[][] arr, int r, int c){
        int tr = 0, br = r - 1, lc = 0, rc = c - 1;
        int e = 0;
        while(e < r * c){
            // top row
            for (int i = lc; i <= rc && e < r * c; i++) {
                System.out.print(arr[tr][i] + " ");
                e ++;
            }
            tr ++;

            // right col
            for (int i = tr; i <= br && e < r * c; i++) {
                System.out.print(arr[i][rc] + " ");
                e ++;
            }
            rc --;

            // bottom row
            for (int i = rc; i >= lc && e < r * c; i--) {
                System.out.print(arr[br][i] + " ");
                e ++;
            }
            br --;

            // left col
            for (int i = br; i >= tr && e < r * c; i--) {
                System.out.print(arr[i][lc] + " ");
                e ++;
            }
            lc ++;
        }
    }
}
