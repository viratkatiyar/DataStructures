package PrefixSum;
import java.util.Scanner;
public class MatrixRectangleSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rows of matrix:");
        int rows = scan.nextInt();

        System.out.println("Enter columns of matrix:");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        printMatrix(matrix);

        System.out.println("Enter top-left coordinates (row1 col1):");
        int row1 = scan.nextInt();
        int col1 = scan.nextInt();

        System.out.println("Enter bottom-right coordinates (row2 col2):");
        int row2 = scan.nextInt();
        int col2 = scan.nextInt();
        System.out.println("Rectangle Sum (Brute Force): " + rectSum(matrix, row1, col1, row2, col2));
        buildPrefixSum(matrix);
        System.out.println("Rectangle Sum (Optimized 2D Prefix): " + rectSumOptimized(matrix, row1, col1, row2, col2));
    }
    public static void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    static int rectSum(int[][] matrix, int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    static void buildPrefixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // STEP 1: Row-wise prefix sum (in-place)
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // STEP 2: Column-wise prefix sum (in-place)
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }
    static int rectSumOptimized(int[][] matrix, int row1, int col1, int row2, int col2) {
        int total = matrix[row2][col2];
        int up = (row1 > 0) ? matrix[row1 - 1][col2] : 0;
        int left = (col1 > 0) ? matrix[row2][col1 - 1] : 0;
        int diagonal = (row1 > 0 && col1 > 0) ? matrix[row1 - 1][col1 - 1] : 0;

        return total - up - left + diagonal;
    }
}
