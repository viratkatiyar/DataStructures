package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndPrint {
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

        // printing 2d array
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
