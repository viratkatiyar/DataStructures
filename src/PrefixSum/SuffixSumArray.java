package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class SuffixSumArray {
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
        System.out.println("Suffix Sum Array : " + Arrays.toString(suffixSum(arr)));
    }
    static int[] suffixSum(int[] a){
        for (int i = a.length - 2; i >= 0; i--) {
            a[i] += a[i + 1];
        }
        return a;
    }
}
