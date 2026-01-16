package Recursion.Arrays;

import java.util.Scanner;

public class RecursionOnArrays {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scan.nextInt();
        System.out.println("Enter array Elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        printsValues(arr, 0);
        System.out.println();
        System.out.println("Max Value in Array : " + maxValue(arr, 0));
        System.out.println("Total Sum : " + totalSum(arr, 0));
    }
    static int maxValue(int[] arr, int idx){
        if(idx == arr.length - 1) return arr[idx];
        return Math.max(arr[idx], maxValue(arr, idx + 1));
    }
    static void printsValues(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printsValues(arr, idx + 1);
    }
    static int totalSum(int[] arr, int idx){
        if(idx == arr.length) return 0;
        return arr[idx] + totalSum(arr, idx + 1);
    }
}
