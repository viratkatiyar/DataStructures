package Recursion.Arrays;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scan.nextInt();
        System.out.println("Enter array Elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Is Array Sorted : " + (arr.length <= 1 || isSortedAscending(arr, 1)));
        scan.close();
    }
    static boolean isSortedAscending(int[] arr, int idx){
        if(idx == arr.length) return true;
        if(arr[idx] < arr[idx - 1]) return false;
        return isSortedAscending(arr, idx + 1);
    }
}
