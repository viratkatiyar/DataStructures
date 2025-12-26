package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0sAnd1sArray {
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
        System.out.println("Sorted Array : " + Arrays.toString(sortedArray2(arr)));
    }
    static int[] sortedArray2(int[] arr){
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while(l < r){
            if(arr[l] == 1 && arr[r] == 0){
                arr[l] = arr[l] + arr[r];
                arr[r] = arr[l] - arr[r]; // swap these 3 lines
                arr[l] = arr[l++] - arr[r--];
            }
            if(arr[l] == 0){
                l ++;
            }
            if(arr[r] == 1){
                r --;
            }
        }
        return arr;
    }
    static int[] sortedArray1(int[] arr){
        int totalZeroes = 0;
        for(int k : arr){
            if(k == 0){
                totalZeroes ++;
            }
        }
        for (int i = 0; i < totalZeroes; i++) {
            arr[i] = 0;
        }
        for (int i = totalZeroes; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }
}
