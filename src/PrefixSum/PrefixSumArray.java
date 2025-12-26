package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumArray {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of input array (n) : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Prefix Sum Array : " + Arrays.toString(prefixSum(arr)));
    }
    static int[] prefixSum(int[] a){
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
        return a;
    }
}
