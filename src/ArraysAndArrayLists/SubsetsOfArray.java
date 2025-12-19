package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetsOfArray {
    public static void main(String[] args) {
        System.out.println("Enter size(n) of array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Subsets of Array : ");
    }
    public static void subsets(int[] arr){
        int limit = (int)Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            // convert i to binary and use 0's and 1's
        }
    }
}
