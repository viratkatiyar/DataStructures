package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementInRotatedSortedArrayOrPeak {
    public static void main(String[] args) {
        System.out.println("Enter size of array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Min Element index in Rotated Sorted Array : " + findIndex(arr));
    }
    static int findIndex(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + ((end - start) >>> 1);
            if(arr[mid] > arr[n - 1]){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
