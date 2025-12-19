package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {

        // rows and columns are equal in a matrix to rotate
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
        rotateMatrix(arr, m);
        System.out.println(Arrays.deepToString(arr));
    }
    static void rotateMatrix(int[][] arr, int m){
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][m - 1 - j];
                arr[i][m - 1 - j] = temp;
            }
        }
    }
}
