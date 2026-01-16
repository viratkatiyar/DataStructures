package Sorting;

import java.util.Arrays;

public class NegativePositiveArray {
    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        partitionArray(arr);
        System.out.println("Sorted Array Negative First then Positive : " + Arrays.toString(arr));
    }
    static void partitionArray(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            while(arr[l] < 0) l++;
            while(arr[r] >= 0) r--;
            if(l < r){
                int temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
        }
    }
}
