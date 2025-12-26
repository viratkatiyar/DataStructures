package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class SquareSorted {
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
        int[] ans = new int[n];
        int k = n - 1;
        int l = 0;
        int r = n - 1;
        while(l <= r){
            if(Math.abs(arr[l]) > Math.abs(arr[r])){
                ans[k--] = arr[l] * arr[l];
                l++;
            }
            else{
                ans[k--] = arr[r] * arr[r];
                r--;
            }
        }
        return ans;
    }
}
