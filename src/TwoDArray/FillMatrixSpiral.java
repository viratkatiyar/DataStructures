package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class FillMatrixSpiral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter rows of matrix : ");
        int r = scan.nextInt();
        System.out.print("Enter columns of matrix : ");
        int c = scan.nextInt();
        int[][] arr = new int[r][c];
        int tr = 0, br = r - 1, lc = 0, rc = c - 1;
        int e = 1;
        while(e <= r * c){
            // top row
            for (int i = lc; i <= rc && e <= r * c; i++) {
                arr[tr][i] = e ++;
            }
            tr ++;

            // right col
            for (int i = tr; i <= br && e <= r * c; i++) {
                arr[i][rc] = e ++;
            }
            rc --;

            // bottom row
            for (int i = rc; i >= lc && e <= r * c; i--) {
                arr[br][i] = e ++;
            }
            br --;

            // left col
            for (int i = br; i >= tr && e <= r * c; i--) {
                arr[i][lc] = e ++;
            }
            lc ++;
        }
        scan.close();
        System.out.println(Arrays.deepToString(arr));

    }
}
