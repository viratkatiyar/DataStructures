package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class IndexedBasedSum {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of input array (n) : ");
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter array elements : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }
        prefixSumArray(arr);
        System.out.println("Enter No. of Queries : ");
        int q = scan.nextInt();
        while((q--) > 0){
            System.out.println("Enter First Index : ");
            int l = scan.nextInt();
            System.out.println("Enter Last Index : ");
            int r = scan.nextInt();
            System.out.println("Sum Of Given Indexes : " + (arr[r] - arr[l - 1]));
        }
    }
    static void prefixSumArray(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }
}
