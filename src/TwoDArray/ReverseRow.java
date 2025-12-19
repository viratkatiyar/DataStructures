package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseRow {
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

        for (int i = 0; i < m; i++){
//            for (int j = 0; j < n / 2; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[i][n - 1 - j];
//                arr[i][n - 1 - j] = temp;
//            }

            // two pointers
            int f = 0;
            int l = n - 1;
            while(f < l){
                int temp = arr[i][f];
                arr[i][f] = arr[i][l];
                arr[i][l] = temp;
                f ++;
                l --;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
