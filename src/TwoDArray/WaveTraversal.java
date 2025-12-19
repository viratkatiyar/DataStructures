package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row of 2D Array : ");
        int m = scan.nextInt();
        System.out.println("Enter column of 2D Array : ");
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter [" + i + "][" + j + "] element : ");
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 1; i < m * n; i++) {
            
        }
    }
}
