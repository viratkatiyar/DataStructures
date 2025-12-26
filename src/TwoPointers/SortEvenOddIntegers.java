package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenOddIntegers {
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
        System.out.println("Sorted Array : " + Arrays.toString(sortedArray(arr)));
    }
    static int[] sortedArray(int[] arr){
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while(l < r){
            if(arr[l] % 2 != 0 && arr[r] % 2 == 0){
                arr[l] = arr[l] + arr[r];
                arr[r] = arr[l] - arr[r]; // swap
                arr[l] = arr[l++] - arr[r--];
            }
            if(arr[l] % 2 == 0){
                l ++;
            }
            if(arr[r] % 2 != 0){
                r --;
            }
        }
        return arr;
    }
}
