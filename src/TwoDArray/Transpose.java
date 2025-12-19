package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row of 2D Array : ");
        int m = scan.nextInt();
        System.out.println("Enter column of 2D Array : ");
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter Matrix Elements : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        // transpose // in a new matrix
//        int[][] transpose = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                transpose[i][j] = arr[j][i];
//            }
//        }

        // in place conversion possible for square matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) { // j = i because it causes double swap if j = 0
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
