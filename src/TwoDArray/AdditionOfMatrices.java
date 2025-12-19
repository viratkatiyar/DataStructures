package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // matrix 1
        System.out.println("Enter rows of matrix 1 : ");
        int r1 = scan.nextInt();
        System.out.println("Enter cols of matrix 1 : ");
        int c1 = scan.nextInt();
        int[][] m1 = new int[r1][c1];
        System.out.println("Enter matrix 1 elements in a single line with space");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(m1));

        // matrix 2
        System.out.println("Enter rows of matrix 2 : ");
        int r2 = scan.nextInt();
        System.out.println("Enter cols of matrix 2 : ");
        int c2 = scan.nextInt();
        int[][] m2 = new int[r2][c2];
        System.out.println("Enter matrix 2 elements in a single line with space");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(m2));

        // addition
        if(r1 == r2 && c1 == c2){
            int[][] result = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    result[i][j] = m1[i][j] + m2[i][j];
                }
            }
            System.out.println(Arrays.deepToString(result));
        }
        else{
            System.out.println("Matrix Addition Not Possible Due to different dimensions");
        }
    }
}
