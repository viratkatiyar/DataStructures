package Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 3, 1, 3, 5};
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        countSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    static void basicCountSort(int[] arr){
        int[] freq = new int[findMax(arr) + 1];
        for (int k : arr) {
            freq[k]++;
        }
        int k = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                arr[k++] = i;
            }
        }
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int[] arr){
        int[] freq = new int[findMax(arr) + 1];
        for (int k : arr) {
            freq[k]++;
        }
        for(int i = 1; i < freq.length; i++){
            freq[i] += freq[i - 1];
        }
        int[] ans = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            int pos = freq[arr[i]]--;
            ans[pos - 1] = arr[i];
        }
        System.arraycopy(ans, 0, arr, 0, arr.length);
    }
}
