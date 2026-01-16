package Recursion.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scan.nextInt();
        System.out.println("Enter array Elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter target : ");
        int target = scan.nextInt();
        System.out.println("Target Found : " + linearSearch(arr, 0, target));
        System.out.println("Target Found at Index : " + linearSearchIndex(arr, 0, target));
        linearSearch2(arr, 0, target);
        scan.close();
    }
    static boolean linearSearch(int[] arr, int idx, int target) {
        if (idx == arr.length) return false;
        if (arr[idx] == target) return true;
        return linearSearch(arr, idx + 1, target);
    }
    static int linearSearchIndex(int[] arr, int idx, int target) {
        if (idx == arr.length) return -1;
        if (arr[idx] == target) return idx;
        return linearSearchIndex(arr, idx + 1, target);
    }
    static void linearSearch2(int[] arr, int idx, int target) {
        if (idx == arr.length) return;
        if (arr[idx] == target) System.out.println(idx);;
        linearSearch2(arr, idx + 1, target);
    }
}
