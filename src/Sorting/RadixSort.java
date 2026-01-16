package Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 0, 3};
        radixSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
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
    static void radixSort(int[] arr){
        int max = findMax(arr);
        // apply counting sort to sort elements based on place value
        for(int place  = 1; max / place > 0; place *= 10){
            countSort(arr, place);
        }
    }
    static void countSort(int[] arr, int place){
        int[] freq = new int[findMax(arr) + 1];
        for (int k : arr) { // making freq. array
            freq[(k / place) % 10]++;
        }
        for(int i = 1; i < freq.length; i++){
            freq[i] += freq[i - 1];
        }
        int[] ans = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            int pos = freq[(arr[i] / place) % 10]--;
            ans[pos - 1] = arr[i];
        }
        System.arraycopy(ans, 0, arr, 0, arr.length);
    }
}
