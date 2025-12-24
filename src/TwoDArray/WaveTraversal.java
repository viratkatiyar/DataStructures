package TwoDArray;
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
                arr[i][j] = scan.nextInt();
            }
        }
        waveTraversal(arr);
    }
    static void waveTraversal(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int te = 0;
        int lc = 0;
        while(te < m * n){
            for (int i = 0; i < m && te < m * n; i++) {
                System.out.print(arr[i][lc] + " ");
                te ++;
            }
            lc ++;
        }
    }
}
