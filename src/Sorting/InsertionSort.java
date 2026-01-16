package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] arr = {5, 1, 2, 4, 3, 6, 0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i ++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]){ // j > 0 pahle likha jayega nahi to index bound error aayega
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j --;
            }
        }
    }
}
